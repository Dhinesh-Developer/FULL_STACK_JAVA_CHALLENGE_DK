package com.dk.Library.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="lib")
public class Lib {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title",nullable = false)
    private String title;
    @Column(name = "author",nullable = false)
    private String author;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "publishedYear")
    private int publishedYear;
    @Column(name = "available")
    private boolean available = true;


}
