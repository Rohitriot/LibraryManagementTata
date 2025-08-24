package com.Rohit.LibraryManagementTata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.*;

@Entity(name = "book")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="id")
public class Book {
    @Id
    private int id;
    private String title;
    private String author;
    private int count;
    @ManyToMany(mappedBy = "album",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Library> libraries=new HashSet<>();

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Book() {
    }

    public Set<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(Set<Library> libraries) {
        this.libraries = libraries;
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
}
