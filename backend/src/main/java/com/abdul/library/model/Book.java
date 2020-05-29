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
	
	
}
