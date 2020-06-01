package com.abdul.library.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abdul.library.dao.BookDAO;
import com.abdul.library.model.Book;


@Service
@Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	BookDAO bookDAOImpl;

	@Override
	public List<Book> getBookCatalog() throws Exception{
		return bookDAOImpl.getBookCatalog();
	}
	

}
