package com.Rohit.LibraryManagementTata.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity(name = "library")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property="libraryId")
public class Library {
    @Id
    private int libraryId;
    private String libraryName;
    private String libCity;

    @ManyToMany
//    @JsonIgnore
    private Set<Book> album = new HashSet<>();

    public Library(String libraryName, int libraryId, String libCity)
    {
        this.libraryName = libraryName;
        this.libraryId = libraryId;
        this.libCity = libCity;
    }

    public Library() {
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    public String getLibCity() {
        return this.libCity;
    }

    public void setLibCity(String libCity) {
        this.libCity = libCity;
    }

    public Set<Book> getAlbum() {
        return this.album;
    }

    public void setAlbum(Set<Book> album) {
        this.album = album;
    }
    public void setBookInAlbum(Book book)
    {
        album.add(book);
        System.out.println("ADDED BOOK");
    }
}
