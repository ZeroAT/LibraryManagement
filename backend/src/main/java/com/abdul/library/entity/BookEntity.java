package com.abdul.library.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

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

}
