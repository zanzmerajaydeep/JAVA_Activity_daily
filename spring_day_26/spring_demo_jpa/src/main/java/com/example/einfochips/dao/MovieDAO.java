package com.example.einfochips.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.einfochips.model.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie,Integer> {
	
	@Query("select m from Movie m where m.language=:lang")
	List<Movie> getViewMovieByLanguage(@Param("lang") String lang);
	
//	@Query("select from movie where :cn = :cv",nativequery=true)
//	List<Movie> getViewMovieByCV(@Param("columnN") String cn,@Param("columnN") String cv);
	
	
//    List<Movie> findByCNameAndCValue(@Param("columnN") String cn,@Param("columnN") String cv);

}
