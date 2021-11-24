package com.serhiihonchar.service;

import com.serhiihonchar.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();

    public void insertBook(Book book);

    public Book getBookById(int id);
//
//    public void deleteBook(int id);
}
