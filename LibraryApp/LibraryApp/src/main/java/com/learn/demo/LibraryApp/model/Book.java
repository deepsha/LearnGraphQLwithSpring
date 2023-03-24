package com.learn.demo.LibraryApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="BOOKS")
public class Book {
    @Id
    @Column(name="BOOK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="BOOK_ISBN")
    private String bookIsbn;
    @Column(name="BOOK_NAME")
    private String bookName;
    @Column(name="BOOK_DESCRIPTION")
    private String bookDescription;
    @Column(name="BOOK_GENRE")
    private String bookGenre;
    @Column(name="BOOK_AUTHOR")
    private String bookAuthorName;
    @Column(name="BOOK_PUBLISHER")
    private String bookPublisherName;
    @Column(name="BOOK_PUBLISHED_DATE")
    private String bookPublishedDate;
    @Column(name="BOOK_LANGUAGE")
    private String bookLanguage;
    @Column(name="BOOK_AVAILABLE")
    private String bookAvailableStatus;


}
