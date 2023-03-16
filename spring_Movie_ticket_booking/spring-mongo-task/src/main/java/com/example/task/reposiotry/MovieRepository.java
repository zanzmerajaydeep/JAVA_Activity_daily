package com.example.task.reposiotry;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.task.model.MovieModel;

@Repository
public interface MovieRepository extends MongoRepository<MovieModel, String> {
	
}
