package com.aca.homework5;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBSUserRepository implements UserRepository {
    private final DataSource dataSource;

    public JDBSUserRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(User user) {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("insert into users (name, age) values ('" + user.getName() + "','" + user.getAge() + "');");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void deleteAll() {
        Statement statement = null;
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            statement = connection.createStatement();
            statement.execute("delete from users");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
