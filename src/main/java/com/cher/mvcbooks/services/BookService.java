package com.cher.mvcbooks.services;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.cher.mvcbooks.models.Book;
import com.cher.mvcbooks.repositories.BookRepository;

@Service
public class BookService {
	// adding the book repository as a dependency
	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	//READ ALL
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	//CREATE
	public Book createBook(Book b) {
		return bookRepository.save(b);
	}

	//READ ONE
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}		
	}
	
	//UPDATE
	public Book updateBook(Book b) {
		return bookRepository.save(b);
	}
	
	//DELETE
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
