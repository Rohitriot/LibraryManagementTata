package com.Rohit.LibraryManagementTata.controller;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.service.BookService;
import com.Rohit.LibraryManagementTata.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {
    @Autowired
    LibService lservice;
    @Autowired
    BookService bservice;


    @GetMapping("/librarys")
    public List<Library> getLibrarys() {
        return lservice.getLibrary();
    }

    @GetMapping("/librarys/{libId}")
    public Library getLibraryById(@PathVariable int libId) {
        return lservice.getLibraryById(libId);
    }

    @PutMapping("/librarys/FeedBooks/{libID}/{bookID}/{bookCount}")
    public void feedLibrary(@PathVariable("libID") int libID,@PathVariable("bookID") int bookID,@PathVariable("bookCount") int bookCount)
    {
        Book book=bservice.getBookById(bookID);
        Library lib=lservice.getLibraryById(libID);
        lservice.feedLibrary(lib,book,bookCount);
    }

    @PostMapping(value = "/librarys")
    public void addLibrary(@RequestBody Library lib) {
        lservice.addLibrary(lib);
    }


}
