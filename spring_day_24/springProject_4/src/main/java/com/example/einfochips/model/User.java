package com.example.einfochips.model;


public class User {
	
	private String username;
	private String surname;
	private int number;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public User(String username, String surname, int number) {
		super();
		this.username = username;
		this.surname = surname;
		this.number = number;
	}
	@Override
	public String toString() {
		return "username=" + username + ", surname=" + surname + ", number=" + number;
	}
	

}
