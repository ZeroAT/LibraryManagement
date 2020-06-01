package com.abdul.library.service;

import java.util.List;

import com.abdul.library.model.Book;

public interface BookService {
	
	public List<Book>getBookCatalog() throws Exception;

}
