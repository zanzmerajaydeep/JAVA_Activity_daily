package com.example.task.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class MovieModel {

	@Id
	private String id;
	private String movieName;
	
	public MovieModel(String id, String movieName) {
		super();
		this.id = id;
		this.movieName = movieName;
	}

	public MovieModel(String movieName) {
		super();
		this.movieName = movieName;
	}

	public MovieModel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "MovieModel [id=" + id + ", movieName=" + movieName + "]";
	}
	
	
	
	
}
