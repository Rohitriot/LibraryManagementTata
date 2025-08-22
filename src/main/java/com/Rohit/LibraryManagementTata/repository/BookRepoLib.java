package com.Rohit.LibraryManagementTata.repository;

import com.Rohit.LibraryManagementTata.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepoLib extends JpaRepository<Book,Integer> {
}
