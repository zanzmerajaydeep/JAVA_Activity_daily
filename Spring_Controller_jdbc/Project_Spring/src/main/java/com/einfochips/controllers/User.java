package com.einfochips.controllers;

public class User {
	private int id;
	private String name;
	private String surname;
	private String email;
	
	
	@Override
	public String toString() {
		return " " + id + ", name=" + name + ", surname=" + surname + ", email=" + email;
	}
	
	public int getId() {
		return id;
	}
	public User(int id, String name, String surname, String email) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
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
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
