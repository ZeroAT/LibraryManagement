package com.abdul.library.model;
/*
		Author_ID int IDENTITY(1,1) NOT NULL , --PK(1/1)
		Author_First_Name nvarchar(255) NOT NULL,
		Author_Middle_Name nvarchar(255),
		Author_Last_Name nvarchar(255) NOT NULL,
		Constraint Author_ID_PK Primary Key(Author_ID)
*/

public class Author {
	
	private int authorId;
	private String authorFirstName;
	private String authorMiddleName;
	private String authorLastName;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getAuthorFirstName() {
		return authorFirstName;
	}
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	public String getAuthorMiddleName() {
		return authorMiddleName;
	}
	public void setAuthorMiddleName(String authorMiddleName) {
		this.authorMiddleName = authorMiddleName;
	}
	public String getAuthorLastName() {
		return authorLastName;
	}
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	
	
}
