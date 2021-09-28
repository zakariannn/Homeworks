package com.aca.homework6;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws SQLException, ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);


        System.out.println("which datasource do you want ");
        System.out.println("0:hikari");
        System.out.println("1:postgre");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        BookRepository bookRepository = new JDBCBookRepository(resolveDataSource(a));
        Book book = new Book();

        final long start = System.currentTimeMillis();
        List<Future<?>> futureList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            final Future<?> future = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    book.setTitle("Java");
                    book.setAuthor(String.format("Author %d", finalI));
                    try {
                        bookRepository.create(book);
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                }
            });
            futureList.add(future);

        }
        for (final Future<?> future : futureList) {
            future.get();
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    public static DataSource getHikariDatasource() {
        HikariConfig config = new HikariConfig();


        config.setJdbcUrl("jdbc:postgresql://localhost:5434/aca");
        config.setUsername("postgres");
        config.setPassword("postgres");
        return new HikariDataSource(config);
    }

    public static DataSource getPgDataSourcce() {
        PGSimpleDataSource dataSource = new PGSimpleDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5434/aca");
        dataSource.setUser("postgres");
        dataSource.setPassword("postgres");
        return dataSource;
    }


    public static DataSource resolveDataSource(int selectedId) {
        if (selectedId == 0) {
            return getHikariDatasource();
        }
        if (selectedId == 1) {
            return getPgDataSourcce();
        }
        throw new IllegalArgumentException();
    }
}
