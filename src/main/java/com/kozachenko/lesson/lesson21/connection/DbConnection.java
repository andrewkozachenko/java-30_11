package com.kozachenko.lesson.lesson21.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DbConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Pass2020!";
    private static List<Connection> connectionPool;
    private static Connection connection;


    public static Connection getConnection() {
        if(connection != null){
            return connection;
        }
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver was not found!");
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            if (connection != null) {
                System.out.println("Successful Connection to PostgreSQL");
            }
        } catch (SQLException e) {
            System.out.println("Connection was not found!");
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
