package com.example.einfochips.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int movieid;
	private String moviename;
	private String director;
	private String language;
	
	
	public Movie(int movieid, String moviename, String director, String language) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.director = director;
		this.language = language;
	}
	
	@Override
	public String toString() {
		return "movieid=" + movieid + ", moviename=" + moviename + ", director=" + director + ", language="
				+ language;
	}

	public Movie() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("in movie class");
	}

	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getMoviename() {
		return moviename;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
