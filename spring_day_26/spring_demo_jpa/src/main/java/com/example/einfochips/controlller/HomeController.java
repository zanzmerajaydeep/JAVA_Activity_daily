package com.example.einfochips.controlller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

import com.example.einfochips.dao.MovieDAO;
import com.example.einfochips.model.Movie;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("in home working...");
	}
	
	@Autowired
	MovieDAO md;
	
	
	@RequestMapping("/home")
	public ModelAndView getIndex()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/add")
	public ModelAndView getAddMovie()
	{
		return new ModelAndView("addMovie");
	}
	
	@RequestMapping(value="insertMovie", method=RequestMethod.POST)
	public ModelAndView insertMovie(HttpServletRequest req)
	{
		int tempid =Integer.parseInt(req.getParameter("mid"));
		String tempname =req.getParameter("mname");
		String tempDirector =req.getParameter("director");
		String tempLanguage =req.getParameter("language");
		
		
		Movie m = new Movie(tempid,tempname,tempDirector,tempLanguage);
		
		md.save(m);
		System.out.println(m);
		
		ModelAndView mv = new ModelAndView("viewMovies");
		ArrayList<Movie> l1 = new ArrayList<Movie>();
		 l1 = (ArrayList<Movie>) md.findAll();
		 mv.addObject("movies",l1);
		
		
		return mv;
	}
	
	@RequestMapping("/all")
	public ModelAndView viewAllMovie()
	{
		ModelAndView mv = new ModelAndView("viewMovies");
		ArrayList<Movie> l1 = new ArrayList<Movie>();
		 l1 = (ArrayList<Movie>) md.findAll();
		 mv.addObject("movies",l1);
		return  mv;
	}
	
	@RequestMapping("/deleteById")
	public ModelAndView deleteByID(HttpServletRequest req)
	{
		int id =Integer.parseInt( req.getParameter("deleteid"));
		ModelAndView mv = new ModelAndView("viewMovies");
		
		md.deleteById(id);
		
		//FOR sending data
		ArrayList<Movie> l1 = new ArrayList<Movie>();
		l1 = (ArrayList<Movie>) md.findAll();
		mv.addObject("movies",l1);
		
	 
		return mv;
		
	}
	
	@RequestMapping("/update")
	public ModelAndView gotoUpdate()
	{
		return new ModelAndView("Update");
	}
	
	@RequestMapping("/getMovieById")
	public ModelAndView getMovieById(HttpServletRequest req)
	{
		int uid =Integer.parseInt(req.getParameter("updateid"));
		ModelAndView mv = new ModelAndView("Update");
		ArrayList<Movie> l1 = new ArrayList<Movie>();
		
		 Movie m =  md.getById(uid);
		 mv.addObject("movieDetails",m);
		return  mv;
	}
	
	@RequestMapping(value="updateData", method=RequestMethod.POST)
	public ModelAndView updateData(HttpServletRequest req)
	{
		int tempid =Integer.parseInt(req.getParameter("mid"));
		String tempname =req.getParameter("mname");
		String tempDirector =req.getParameter("director");
		String tempLanguage =req.getParameter("language");
		
		
		Movie m = new Movie(tempid,tempname,tempDirector,tempLanguage);
		
		md.save(m);
		
		ModelAndView mv = new ModelAndView("viewMovies");
		mv=viewAllMovie();
		//.out.println(m);
		return mv;
	}
	
	@RequestMapping("viewmoviebylang")
	public ModelAndView getViewMovieByLanguage(@RequestParam("lang") String lang)
	{
		ModelAndView mv =new  ModelAndView("viewMovieByLang");
		
		ArrayList<Movie> l1 = (ArrayList<Movie>) md.getViewMovieByLanguage(lang);
		mv.addObject("viewMovieByLanguage",l1);
		return mv;
	}
	
	//column value
//	@RequestMapping("viewmoviebyCV")
//	public ModelAndView getViewMovieCV(@RequestParam("columnN") String cn,@RequestParam("columnV") String cv)
//	{
//		ModelAndView mv =new  ModelAndView("viewMovieByLang");
//		
//		ArrayList<Movie> l1 = (ArrayList<Movie>) md.getViewMovieByCV(cn, cv);
//		mv.addObject("viewMovieByLanguage",l1);
//		return mv;
//	}
	
	
	
	
	
	

}
