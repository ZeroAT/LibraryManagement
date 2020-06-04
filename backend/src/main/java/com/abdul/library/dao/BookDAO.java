package com.abdul.library.dao;

import java.util.List;

import com.abdul.library.model.Book;
import com.abdul.library.model.Genre;

public interface BookDAO {
	
	public List<Book> getBookCatalog() throws Exception;
	public List<Genre> getGenreCatalog() throws Exception;
	
	

}
