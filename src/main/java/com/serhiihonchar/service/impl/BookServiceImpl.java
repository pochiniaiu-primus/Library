package com.serhiihonchar.service.impl;

import com.serhiihonchar.dao.BookDAO;
import com.serhiihonchar.entity.Book;

import com.serhiihonchar.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookDAO.getAllBooks();
    }

    @Override
    @Transactional
    public void insertBook(Book book) {
        bookDAO.insertBook(book);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return bookDAO.getBookById(id);
    }


    @Override
    @Transactional
    public List<Book> getIsAvailableBook() {
        return bookDAO.getIsAvailableBook();
    }

//
//    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        employeeDAO.deleteEmployee(id);
//    }
}
