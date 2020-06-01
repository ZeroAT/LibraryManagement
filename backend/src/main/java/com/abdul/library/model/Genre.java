package com.abdul.library.model;

/*Create Table Genre
(
	Genre_ID int IDENTITY(1,1) NOT NULL, --PK(1/1)
	Genre_Name nvarchar(255) NOT NULL,
	Constraint PK_GENRE_ID Primary Key(Genre_ID)
);*/

public class Genre {
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
