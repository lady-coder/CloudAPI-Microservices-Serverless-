package com.restapi.example;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	
	@Autowired
	private BookRepository bookRepo;


	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookRepo.findAll();
	}
   
	@GetMapping("/books/{id}")
	public Book retrieveBook(@PathVariable long id) {
		Optional<Book> book = bookRepo.findById(id);

		if (!book.isPresent())
			throw new RuntimeException("Book id not found " + id);

		return book.get();
	}
   
	@DeleteMapping("/books/{id}")
	public void deletebook(@PathVariable long id) {
		bookRepo.deleteById(id);
	}

	@PostMapping("/books")
	public Book createBook(@RequestBody Book book) {
		Book saved = bookRepo.save(book);
		return saved;

	}
	
	@PutMapping("/books/{id}")
	public String updateBook(@RequestBody Book book, @PathVariable long id) {

		Optional<Book> bookOptional = bookRepo.findById(id);

		if (!bookOptional.isPresent())
			return "Book not found, please enter valid data";

		book.setId(id);
		
		bookRepo.save(book);

		return "Book "+id+" updated successfully";
	}
}