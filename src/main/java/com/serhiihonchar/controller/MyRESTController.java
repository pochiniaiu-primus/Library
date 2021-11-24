package com.serhiihonchar.controller;

import com.serhiihonchar.entity.Book;
import com.serhiihonchar.service.BookService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRESTController {

    private BookService bookService;

    public MyRESTController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book>  getAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return allBooks;
    }

    @GetMapping("/isAvailableBooks")
    public List<Book>  getIsAvailableBook() {
        List<Book> availableBooks = bookService.getIsAvailableBook();
        return availableBooks;
    }

}