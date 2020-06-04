package com.abdul.library.service;

import java.util.List;

import com.abdul.library.model.Book;
import com.abdul.library.model.Genre;

public interface BookService {
	
	public List<Book> getBookCatalog() throws Exception;
	public List<Genre> getGenreCatalog() throws Exception;

}
