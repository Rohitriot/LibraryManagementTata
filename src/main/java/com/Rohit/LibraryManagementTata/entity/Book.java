package com.Rohit.LibraryManagementTata.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
@Entity(name = "book")
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private int count;
    private int libraryId;

//    public Book(int id, String title, String author, int count) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.count = count;
//    }

    public Book(int id, String title, String author, int count, int libraryId) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.count = count;
        this.libraryId = libraryId;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", count=" + count +
                '}';
    }
}
