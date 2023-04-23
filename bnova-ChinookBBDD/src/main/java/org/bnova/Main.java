package org.bnova;

import java.sql.*;
import java.awt.Color;

public class Main {
    final static String URL = "jdbc:mysql://localhost:3306/chinook";
    final static String USER = "root";
    final static String PASSWORD = "root";

    public static void main(String[] args) {

        Connection connection;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("\033[32mCONECTADO\033[0m");
        } catch (SQLException e) {
            System.err.println("ERROR while CONNECTING STEP|1");
            throw new RuntimeException(e);
        }

        Statement statement;
        ResultSet resultSet;
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SHOW DATABASES");
            System.out.println("\u001B[34mTEST: \033[32mShowing available databases\033[0m");
            while (resultSet.next()) {
                String database = resultSet.getString("database");
                System.out.println(database);
            }

            connection.close();
            System.out.println("\033[32mCLOSED GRACEFULLY\033[0m");
        } catch (SQLException e) {
            System.err.println("ERROR during REQUEST STEP|2");
            throw new RuntimeException(e);
        }

    }
}