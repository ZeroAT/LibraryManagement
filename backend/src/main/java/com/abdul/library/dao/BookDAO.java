package com.abdul.library.dao;

import java.util.List;

import com.abdul.library.model.Book;

public interface BookDAO {
	
	public List<Book> getBookCatalog() throws Exception;
	
	

}
