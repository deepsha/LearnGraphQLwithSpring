package com.learn.demo.LibraryApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="AUTHORS")
public class Author {

    @Id
    @Column(name="AUTHOR_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long authorId;

    @Column(name="AUTHOR_NAME")
    private String authorName;

    @Column(name="AUTHOR_LOCATION")
    private String authorLocation;


}
