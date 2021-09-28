package com.aca.homework6;

import java.sql.SQLException;

public interface BookRepository {
    void create(Book book) throws SQLException; //save book in DB
}
