package com.Rohit.LibraryManagementTata.controller;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.service.BookService;
import com.Rohit.LibraryManagementTata.service.LibService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class BookController {

    @Autowired
    BookService service;
    @Autowired
    LibService lService;

//    Map<String, Integer> mp=new HashMap<String,Integer>();

    @GetMapping("/books")
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @GetMapping("/books/{bookId}")
    public Book getBooktById(@PathVariable int bookId) {
        return service.getBookById(bookId);
    }
    @GetMapping("/books_in_Lib/{bookId}")
    public List<Library>  getLibrarytByBookId(@PathVariable int bookId) {
        Set<Library> temp=lService.getLibByBookId(bookId);
        List<Library> list=new ArrayList<>();
        for(Library l:temp) {
            System.out.println(l.getLibraryId());
            list.add(l);
        }
        return list;
    }


    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        int libId=book.getLibraryId();
        service.addBook(book);
        lService.addBooks(libId,book);
    }


    @PutMapping("/books")
    public void updateBook(@RequestBody Book book) {
        service.updateBook(book);
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable int bookId){
        service.deleteBook(bookId);
    }
}