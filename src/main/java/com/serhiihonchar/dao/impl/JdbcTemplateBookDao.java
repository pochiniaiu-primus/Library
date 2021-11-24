package com.serhiihonchar.dao.impl;

import com.serhiihonchar.dao.BookDAO;
import com.serhiihonchar.entity.Book;
import com.serhiihonchar.mapper.BookRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import java.util.List;


public class JdbcTemplateBookDao implements BookDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateBookDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Book> getAllBooks() {
        var sql = "SELECT * FROM books";
        List<Book> allBooksList = jdbcTemplate.query(sql, new BookRowMapper());
        return allBooksList;
    }

    @Override
    public void insertBook(Book book) {
        var sql = "INSERT INTO books " +
                "(id, name, dateadded, available) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, book.getId(), book.getName(), book.getDateAdded(),book.isAvailable());
    }

    @Override
    public Book getBookById(int id) {
        var sql = "SELECT * FROM books WHERE id = ?";
        var book = jdbcTemplate.queryForObject(sql, new BookRowMapper(), id);
        return book;
    }

    @Override
    public List<Book> getIsAvailableBook() {
        var sql = "SELECT * FROM books WHERE available = false";
        List<Book> allBooksList = jdbcTemplate.query(sql, new BookRowMapper());
        return allBooksList;
    }
//
//    @Override
//    public void deleteBook(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query
//                = session.createQuery("delete from Employee where id =:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//    }
}