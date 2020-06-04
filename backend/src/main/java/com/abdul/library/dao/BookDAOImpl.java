package com.abdul.library.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.abdul.library.entity.BookEntity;
import com.abdul.library.entity.GenreEntity;
import com.abdul.library.model.Book;
import com.abdul.library.model.Genre;

@Repository
public class BookDAOImpl implements BookDAO{
	
	@Autowired
	EntityManager em;

	@Override
	public List<Book> getBookCatalog() throws Exception {
		Query query = em.createQuery("SELECT b FROM BookEntity b");
		List<BookEntity> bookEntityList = query.getResultList();
		List<Book> bookList = new ArrayList<>();
		
		bookEntityList.forEach(
				entity -> {
					Book book = new Book();
					book.setIsbn(entity.getIsbn());
					book.setQuantity(entity.getQuantity());
					book.setTitle(entity.getTitle());
					book.setYear(entity.getYear());
					Genre genre = new Genre();
					genre.setId(entity.getGenreEntity().getId());
					genre.setName(entity.getGenreEntity().getName());
					book.setGenre(genre);
					bookList.add(book);
				});

		if(bookList.isEmpty()){
			return null;
		}
		return bookList;
	}

	@Override
	public List<Genre> getGenreCatalog() throws Exception {
		
		Query query = em.createQuery("SELECT G FROM GenreEntity G");
		List<GenreEntity> genreEntityList = query.getResultList();
		List<Genre> genreList = new ArrayList<>();
		
		genreEntityList.forEach(
				entity -> {
					Genre genre = new Genre();
					genre.setId(entity.getId());
					genre.setName(entity.getName());
					genreList.add(genre);
				});
		if(genreList.isEmpty()){
			return null;
		}
		return genreList;
	}
	



}
