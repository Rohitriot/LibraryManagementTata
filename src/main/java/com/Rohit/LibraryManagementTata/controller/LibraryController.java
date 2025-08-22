package com.Rohit.LibraryManagementTata.controller;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.service.BookService;
import com.Rohit.LibraryManagementTata.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LibraryController {
    @Autowired
    LibService lservice;

    @GetMapping("/librarys")
    public List<Library> getProducts() {
        return lservice.getLibrary();
    }

//    @GetMapping("/books/{bookId}")
//    public Book getBooktById(@PathVariable int bookId) {
//        return service.getBookById(bookId);
//        return lservice.
//    }


    @PostMapping("/librarys")
    public void addLibrary(@RequestBody Library lib) {
        lservice.addLibrary(lib);
    }

}
