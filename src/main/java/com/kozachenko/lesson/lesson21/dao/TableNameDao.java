package com.kozachenko.lesson.lesson21.dao;

import com.kozachenko.lesson.lesson21.connection.DbConnection;
import com.kozachenko.lesson.lesson21.entity.TableName;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class TableNameDao implements Dao<TableName> {

    @Override
    public TableName get(int id) {
        Connection connection = DbConnection.getConnection();
        TableName tn = new TableName();
        try {
            PreparedStatement ps = connection.prepareStatement("Select * from table_name where id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idd = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                tn = new TableName(idd, name, surname);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return tn;
    }

    @Override
    public List<TableName> getAll() {
        Connection connection = DbConnection.getConnection();
        List<TableName> tableNames = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("Select * from table_name;");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                TableName tn = new TableName(id, name, surname);
                tableNames.add(tn);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return tableNames;
    }

    @Override
    public void save(TableName tableName) {
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("insert into table_name(name, surname) VALUES (?,?);");
            ps.setString(1, tableName.getName());
            ps.setString(2, tableName.getSurname());
            int i = ps.executeUpdate();
            System.out.println(i);
            System.out.println("Object was created successful");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void update(TableName tableName) {
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("update table_name set name = ?, surname =?  where id = ?;");
            ps.setString(1, tableName.getName());
            ps.setString(2, tableName.getSurname());
            ps.setInt(3, tableName.getId());

            int i = ps.executeUpdate();
            System.out.println(i);
            System.out.println("Object was updated successful");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void delete(TableName tableName) {
        delete(tableName.getId());
    }

    @Override
    public void delete(int id) {
        Connection connection = DbConnection.getConnection();
        try {
            PreparedStatement ps = connection.prepareStatement("delete from table_name where id = ?;");
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            System.out.println(i);

            System.out.println("Object was deleted successful");

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

