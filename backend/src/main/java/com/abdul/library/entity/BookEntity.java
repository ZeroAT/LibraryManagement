package com.abdul.library.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.abdul.library.model.Book;

@Entity
@Table(name="Book")
public class BookEntity {
	@Id
	@Column(name="book_isbn")
	private String isbn;
	@Column(name="book_title")
	private String title;
	@Column(name="book_year")
	private int year;
	@Column(name="book_quantity")
	private int quantity;
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="book_genre")
	private GenreEntity genreEntity;
	

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

	
	
	
	

}
