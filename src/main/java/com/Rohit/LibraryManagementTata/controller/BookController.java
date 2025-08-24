package com.Rohit.LibraryManagementTata.controller;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.service.BookService;
import com.Rohit.LibraryManagementTata.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {

    @Autowired
    BookService service;
    @Autowired
    LibService lService;


    @GetMapping("/books")
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBooktById(@PathVariable int bookId) {
        return service.getBookById(bookId);
    }


    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        service.addBook(book);
    }


    @PutMapping("/books")
    public void updateBook(@RequestBody Book book) {
        service.updateBook(book);
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable int bookId){
        service.deleteBook(bookId);
    }

    @GetMapping(value = "/books/name/{bookTitle}")
    public Set<Library> getLibraryByTitle(@PathVariable String bookTitle) {
        return service.getLibrariesByBookName(bookTitle);
    }

}