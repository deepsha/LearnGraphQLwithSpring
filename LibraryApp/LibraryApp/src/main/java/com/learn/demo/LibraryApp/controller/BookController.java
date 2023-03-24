package com.learn.demo.LibraryApp.controller;

import com.learn.demo.LibraryApp.model.BookInput;
import com.learn.demo.LibraryApp.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.learn.demo.LibraryApp.model.Book;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @QueryMapping
    public Iterable<Book> books(){
        return this.bookRepository.findAll();
    }

    @QueryMapping
    public Book bookById(@Argument Long id){
        return this.bookRepository.findById(id).orElseThrow();
    }

   @QueryMapping
    public Book bookByBookIsbn(@Argument String bookIsbn){
        return this.bookRepository.findBookByBookIsbn(bookIsbn);
    }

    @MutationMapping
    public Book addBook(@Argument(name="input") BookInput bookinput)    {
        return this.bookRepository.save(bookinput.getBookEntity());
    }
}
