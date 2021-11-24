package com.serhiihonchar.dao;


import com.serhiihonchar.entity.Book;

import java.util.List;

public interface BookDAO {
    public List<Book> getAllBooks();

    public void insertBook(Book book);

    public Book getBookById(int id);

    public List<Book> getIsAvailableBook();

//    public void deleteBookById(int id);

}
