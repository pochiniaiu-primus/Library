package com.serhiihonchar.controller;

import com.serhiihonchar.entity.Book;
import com.serhiihonchar.service.BookService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyRESTController {

    private BookService bookService;

    public MyRESTController(BookService bookService) {
        this.bookService = bookService;
    }

//    @GetMapping("/booksParse")
//    public String getAllBooks(Model model) {
//        model.addAttribute("allBooks", bookService.getAllBooks());
//        model.addAttribute("isAvailableBooks", bookService.getIsAvailableBook());
//        return "allBooks";
//    }



    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> allBooks = bookService.getAllBooks();
        return allBooks;
    }


    @GetMapping("/isAvailableBooks")
    public List<Book> getIsAvailableBook() {
        List<Book> availableBooks = bookService.getIsAvailableBook();
        return availableBooks;
    }
}