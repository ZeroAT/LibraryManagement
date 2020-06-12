package com.abdul.library.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Author")
public class AuthorEntity {
	@Id
	@Column(name="author_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	@Column(name="author_first_name")
	private String firstName;
	@Column(name="author_middle_name")
	private String middleName;
	@Column(name="author_last_name")
	private String lastName;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
