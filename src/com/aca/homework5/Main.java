package com.aca.homework5;

import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setPassword("postgres");
        dataSource.setUsername("postgres");
        dataSource.setJdbcUrl("jdbc:postgresql://localhost:5434/aca");
        UserRepository userRepository = new JDBSUserRepository(dataSource);
        User user = new User("Jack", 36);
        userRepository.save(user);
        userRepository.deleteAll();
    }
}
