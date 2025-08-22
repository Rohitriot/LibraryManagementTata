package com.Rohit.LibraryManagementTata.service;

import com.Rohit.LibraryManagementTata.entity.Book;
import com.Rohit.LibraryManagementTata.entity.Library;
import com.Rohit.LibraryManagementTata.repository.LibraryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class LibService {
    @Autowired
    LibraryRepo libRepo;

    public List<Library> getLibrary() {
        return libRepo.findAll();
    }

//    public Book getLibraryById(int libId) {
//        return libRepo.findById(libId).orElse(new Library());
//    }

    public void addLibrary(Library lib) {
        libRepo.save(lib);
    }

    public void updateLibrary(Library lib) {
        libRepo.save(lib);
    }
    public void deleteLibrary(int libId) {
        libRepo.deleteById(libId);
    }
    public void addBooks(int libId,Book book) {
        libRepo.findById(libId).get().setBookInAlbum(book);
    }
    public Set<Library> getLibByBookId(int bookId)
    {
        List<Library> array=libRepo.findAll();
        Set<Library> set=new HashSet<>();
        for(int i=0;i<array.size();i++)
        {
            if(array.get(i).getAlbum().contains(bookId)) {
                set.add(array.get(i));
            }
        }
        return set;
    }
}
