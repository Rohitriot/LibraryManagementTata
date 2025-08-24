package com.Rohit.LibraryManagementTata.service;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class LibService {
    @Autowired
    LibraryRepo libRepo;

    public List<Library> getLibrary() {
        return libRepo.findAll();
    }

    public Library getLibraryById(int libId) {
        return libRepo.findById(libId).orElse(new Library());
    }

    public void addLibrary(Library lib) {
        libRepo.save(lib);
    }

    public void updateLibrary(Library lib) {
        libRepo.save(lib);
    }
    public void deleteLibrary(int libId) {
        libRepo.deleteById(libId);
    }

    public void feedLibrary(Library lib, Book book, int bookCount) {
        Set<Book> st=lib.getAlbum();
        book.setCount(bookCount+book.getCount());
        st.add(book);
        libRepo.save(lib);
    }
}
