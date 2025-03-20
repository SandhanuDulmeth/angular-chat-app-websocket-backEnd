package org.example.db;


import lombok.Getter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static DBConnection dbConnection;

    @Getter
    private final Connection connection;

    private DBConnection() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/angular_chat_app", "root", "1234");
    }

    public static DBConnection getInstance() throws SQLException {

            return null==dbConnection  ? dbConnection = new DBConnection() : dbConnection;

    }

}
