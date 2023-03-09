package com.example.einfochips.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.einfochips.jdbc.UserJdbc;
import com.example.einfochips.model.User;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	@Autowired
	UserJdbc uj;
	
	public HomeController() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("working.....");
	}

	@RequestMapping("/home")
	public ModelAndView getHomePage()
	{
		return new ModelAndView("home");
	}
	
	@RequestMapping("/reg")
	public ModelAndView getRegisterPage()
	{
		return new ModelAndView("register");
	}
	
	@RequestMapping("/getCheck")
	public ModelAndView getCheck(@RequestParam("uname") String fname)
	{
		return new ModelAndView("success");
	}
	
	@RequestMapping("/addUser")
	public ModelAndView addUser(HttpServletRequest req) throws SQLException
	{
		List<User> l1 = new ArrayList<User>();
		ModelAndView mv = new ModelAndView("success1");
		
		uj.addRegister(req);
		
		l1=uj.showData();
		mv.addObject("data",l1);
		return mv;
	}
	
	
	
	


}
