package com.learn.demo.LibraryApp.model;

import lombok.Data;

@Data
public class BookInput {


    private String bookName;
    private String bookIsbn;
    private String bookAuthorName;
    private String bookDescription;
    private String bookLanguage;
    private String  bookAvailableStatus;

    public Book getBookEntity() {
        Book book=new Book();
        book.setBookName(this.bookName);
        book.setBookIsbn(this.bookIsbn);
        book.setBookAuthorName(this.bookAuthorName);
        book.setBookDescription(this.bookDescription);
        book.setBookLanguage(this.bookLanguage);
        book.setBookAvailableStatus(this.bookAvailableStatus);
        return book;
    }
}
