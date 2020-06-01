package com.abdul.library.model;

/*Create Table Book
(
	Book_ISBN nvarchar(13) NOT NULL,--PK(1/1)
	Book_Title nvarchar(255) NOT NULL ,
	Book_Genre int NOT NULL,  --FK(1/1)
	Book_Year int NOT NULL,
	Book_Quantity int NOT NULL DEFAULT 1,
	Constraint Book_ISBN_PK PRIMARY KEY(Book_ISBN),
	Constraint Book_Genre_FK FOREIGN KEY(Book_Genre) REFERENCES Genre(Genre_ID)

);*/

public class Book {

	private String isbn;
	private String title;
	private Genre genre;
	private int year;
	private int quantity;
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
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
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
	
	
}
