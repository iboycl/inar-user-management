package com.inar.reqres.user.management.pojo;

public class User {

	public User(int id, String email, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	private int id;

	private String email;

	private String firstName;

	private String lastName;

	// Default constructor
	public User() {
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
