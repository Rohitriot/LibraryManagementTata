package com.Rohit.LibraryManagementTata.repository;

import com.Rohit.LibraryManagementTata.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepo extends JpaRepository<Library,Integer> {
}
