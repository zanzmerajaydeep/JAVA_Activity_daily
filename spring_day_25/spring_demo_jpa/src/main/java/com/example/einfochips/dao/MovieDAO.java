package com.example.einfochips.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.einfochips.model.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie,Integer> {

}
