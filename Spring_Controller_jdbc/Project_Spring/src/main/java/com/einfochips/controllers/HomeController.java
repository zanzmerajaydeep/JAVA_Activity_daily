package com.einfochips.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	public HomeController()
	{
	  System.out.println("controller is working fine.....");
	}
	
	@RequestMapping("hello")
	public String display()
	{
		return "Hello world";
		
	}
	
	@RequestMapping("display")
	public String displayMethod()
	{
		return "this is Display method";
	}
	
	@RequestMapping("login")
	public ModelAndView login()
	{
		return new  ModelAndView("login.jsp");
	}

}
