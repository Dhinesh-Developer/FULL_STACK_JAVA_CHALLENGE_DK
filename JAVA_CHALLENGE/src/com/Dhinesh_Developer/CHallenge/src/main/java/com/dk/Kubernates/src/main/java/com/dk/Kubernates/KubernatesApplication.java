// Library Management System with CI/CD

package com.dk.Kubernates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@SpringBootApplication
public class KubernatesApplication {
	public static void main(String[] args) {
		SpringApplication.run(KubernatesApplication.class, args);
	}
}

@RestController
@RequestMapping("/api/books")
class BookController {
	private final List<Book> books = new ArrayList<>();

	@GetMapping
	public List<Book> getAllBooks() {
		return books;
	}

	@PostMapping
	public String addBook(@RequestBody Book book) {
		books.add(book);
		return "Book added successfully!";
	}
}

class Book {
	private String title;
	private String author;

	public Book() {}

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
