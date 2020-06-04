package com.abdul.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.abdul.library.model.Book;
import com.abdul.library.model.Genre;
import com.abdul.library.service.BookService;

import ch.qos.logback.core.net.SyslogOutputStream;


@RestController
@CrossOrigin
@RequestMapping("Books")
public class BookAPI {
	
	
	@Autowired
	BookService bookServiceImpl;
	
	@Autowired
	private Environment env;

	@GetMapping(value = "GetAllBooks")
	public ResponseEntity<List<Book>> getAllBooks() throws Exception {
		bookServiceImpl.getBookCatalog().forEach(test -> {test.getIsbn();});
		try {
			List<Book> bookList  = bookServiceImpl.getBookCatalog();
			return new ResponseEntity<List<Book>>(bookList,HttpStatus.OK);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, env.getProperty(e.getMessage()));
		}
		
		
	}
	@GetMapping(value="GetAllGenres")
	public ResponseEntity<List<Genre>> getAllGenres() throws Exception {
		try{
			List<Genre> genreList = bookServiceImpl.getGenreCatalog();
			return new ResponseEntity<List<Genre>>(genreList,HttpStatus.OK);
			
		}catch(Exception e){
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, env.getProperty(e.getMessage()));
		}
	}
	

}
