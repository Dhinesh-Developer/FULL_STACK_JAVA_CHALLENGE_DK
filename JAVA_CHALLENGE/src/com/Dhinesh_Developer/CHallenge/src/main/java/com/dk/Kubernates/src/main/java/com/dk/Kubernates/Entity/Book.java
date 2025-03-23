package com.dk.Kubernates.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    private String author;
    private String genre;
    private String isbn;
}
