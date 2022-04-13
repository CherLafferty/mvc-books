package com.cher.mvcbooks.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cher.mvcbooks.models.Book;
import com.cher.mvcbooks.services.BookService;

@Controller
public class BookController {

	//Dependency Injection for Service
	private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
    @RequestMapping("/")
    public String redirectToBooks() {
    	return "redirect:/books";
    }
    
    @RequestMapping("/books")
    public String index(Model model) {
    	List<Book> allBooks = bookService.allBooks();
    	
    	model.addAttribute("allBooks", allBooks);
    	System.out.println(allBooks);
    	
    	return "/index.jsp";
    }
    
    @RequestMapping("/books/{id}")
    public String showOne(Model model, @PathVariable("id") Long id) {
    	Book book = bookService.findBook(id);
    	System.out.println(book);
    	
    	model.addAttribute("book", book);
    	
    	
    	return"/showOne.jsp";
    }
}
