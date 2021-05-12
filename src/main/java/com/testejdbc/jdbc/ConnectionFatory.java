package com.testejdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFatory {
    private final static String URL = "jdbc:postgresql://localhost:5432/postgres";
    private final static String USERNAME = "postgres";
    private final static String PASSWORD = "123";


    public  static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL,USERNAME,PASSWORD);
        } catch (SQLException throwables) {
          throw new RuntimeException(throwables);
        }
    }


}
