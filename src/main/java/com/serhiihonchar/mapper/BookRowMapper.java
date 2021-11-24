package com.serhiihonchar.mapper;

import com.serhiihonchar.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRowMapper implements RowMapper<Book> {

    @Override
    public Book mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Book book = new Book();

        book.setId(resultSet.getInt("id"));
        book.setName(resultSet.getString("name"));
        book.setDateAdded(resultSet.getInt("dateadded"));
        book.setAvailable(resultSet.getBoolean("available"));

        return book;
    }
}

