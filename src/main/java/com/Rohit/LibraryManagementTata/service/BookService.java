package com.Rohit.LibraryManagementTata.service;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.repository.BookRepoLib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

     @Autowired
    BookRepoLib repo;

    public List<Book> getBooks() {
        return repo.findAll();
    }

    public Book getBookById(int bookId) {
        return repo.findById(bookId).orElse(new Book());
    }

    public void addBook(Book book) {
        repo.save(book);
    }

    public void updateBook(Book book) {
        repo.save(book);
    }
    public void deleteBook(int bookId) {
        repo.deleteById(bookId);
    }
    public Set<Library> getLibrariesByBookName(String title){
        Book b=repo.findBookByTitle(title);
        Set<Library> st=b.getLibraries();
        for(Library lib:st){
            System.out.println(lib+",");
        }
        return st;
    }
}


