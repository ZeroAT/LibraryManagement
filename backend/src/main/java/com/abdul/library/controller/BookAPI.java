package com.abdul.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.abdul.library.model.Book;
import com.abdul.library.service.BookService;

@RestController
@CrossOrigin
@RequestMapping("Books")
public class BookAPI {
	
	
	@Autowired
	BookService bookServiceImpl;
	
	@Autowired
	private Environment env;
	
	@GetMapping(value = "GetAllBooks")
	public List<Book> getAllBooks() throws Exception {
		
		try {
			return bookServiceImpl.getBookCatalog();
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, env.getProperty(e.getMessage()));
		}
		
		
	}
	

}
