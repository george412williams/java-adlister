package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import models.Config;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            //check correct syntax
        }
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public Long insert(User user) {

        Long returnedUserId = null;
        String insertSqlQuery = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
        return null;
    }
}
