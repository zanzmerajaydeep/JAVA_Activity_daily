package com.example.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.model.MovieModel;
import com.example.task.reposiotry.MovieRepository;

@RestController
public class HelloController {

	@Autowired
	MovieRepository movieRepository;
	
	
	@RequestMapping("/hello")
	public String Helo() {
		return "Hello World!!";
	}
	
//	@RequestMapping("/add")
//	public String add() {
//		movieRepository.save(new MovieModel("RRR"));
//		return "Movie added succesfuly!!";
//	}
}
