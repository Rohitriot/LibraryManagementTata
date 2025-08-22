package com.Rohit.LibraryManagementTata.service;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.repository.BookRepoLib;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;


import java.util.*;

@Service
public class BookService {

     @Autowired
    BookRepoLib repo;
//    List<Book> library = new ArrayList<>(Arrays.asList(new Book(1, "1984", "George Orwell", 3), new Book(2, "To Kill a Mockingbird", "Harper Lee", 5), new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", 2)));

//    public List<Book> getBooks() {
//        return library;
//    }

//    public Book getBooktById(int bookId) {
//        return library.stream().filter(p -> p.getId() == bookId).findFirst().orElse(new Book(100, "No book", "no author",0));
//    }
//
//    public void addBook(Book book) {
//        library.add(book);
//    }
//
//    public void updateBook(Book book) {
//        int index = 0;
//        for (int i = 0; i < library.size(); i++)
//            if (library.get(i).getId() == book.getId())
//                index = i;
//        library.set(index, book);
//    }
//
//    public void deleteBook(int bookId) {
//        int index = 0;
//        for (int i = 0; i < library.size(); i++)
//            if (library.get(i).getId() == bookId)
//                index = i;
//        library.remove(index);
//    }

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
}


