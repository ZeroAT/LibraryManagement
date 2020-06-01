package com.abdul.library.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.abdul.library.model.Book;

public class BookEntity {
	@Id
	private String isbn;
	@Column(name="title")
	private String title;
	@Column(name="year")
	private int year;
	@Column(name="quantity")
	private int quantity;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "genre")
	private GenreEntity genreEntity;
	
	private List<Book> bookList;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public GenreEntity getGenreEntity() {
		return genreEntity;
	}

	public void setGenreEntity(GenreEntity genreEntity) {
		this.genreEntity = genreEntity;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
	

}
