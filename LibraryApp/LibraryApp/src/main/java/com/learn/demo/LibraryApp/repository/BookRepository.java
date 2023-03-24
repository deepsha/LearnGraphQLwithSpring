package com.learn.demo.LibraryApp.repository;

import com.learn.demo.LibraryApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  BookRepository extends JpaRepository<Book,Long> {

    public Book findBookByBookIsbn(String bookIsbn);
}
