package com.kozachenko.lesson.lesson21;

import com.kozachenko.lesson.lesson21.connection.DbConnection;
import com.kozachenko.lesson.lesson21.dao.TableNameDao;
import com.kozachenko.lesson.lesson21.entity.TableName;

import java.sql.SQLException;

public class JDBCExample {

    public static void main(String[] args) throws SQLException {
        TableNameDao tableNameDao = new TableNameDao();
//        TableName mask = tableNameDao.get(0);
//        System.out.println(mask);
//        mask.setName("Mask Elon");
//        tableNameDao.update(mask);
//        TableName mask7 = tableNameDao.get(0);

        TableName defoe = new TableName();
        defoe.setName("Daniel");
        defoe.setSurname("Defoe");
        tableNameDao.save(defoe);
//        tableNameDao.delete(3);
        DbConnection.closeConnection();
    }


}
