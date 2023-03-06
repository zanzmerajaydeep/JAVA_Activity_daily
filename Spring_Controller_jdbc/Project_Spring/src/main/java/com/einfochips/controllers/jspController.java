package com.einfochips.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.einfochips.controllers.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class jspController {

	@RequestMapping("index")
	public String indexPage() {
		return "index.jsp";
	}

	@RequestMapping("register")
	public String registerPage() {

		return "registeration.jsp";

	}
	@RequestMapping("success")
	public String successPage() {

		return "success.jsp";

	}

	@RequestMapping("adddata")
	public String addRegister(HttpServletRequest req) throws SQLException {

		String tempid = req.getParameter("id");
		String tempname = req.getParameter("name");
		String tempsname = req.getParameter("sname");
		String tempemail = req.getParameter("email");

		ModelAndView mv = new ModelAndView("success.jsp");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into register values(?,?,?,?)");
		ps.setString(1, tempid);
		ps.setString(2, tempname);
		ps.setString(3, tempsname);
		ps.setString(4, tempemail);
		boolean b = ps.execute();
		if (b == false) {
			mv.addObject("nm", "insert Successfully...");
		} else {
			mv.addObject("nm", "insert Not Successfully...");
		}

		return "success.jsp";
	}

//	@RequestMapping("userLogin")
//	public ModelAndView userLogin(HttpServletRequest req) throws SQLException
//	{
	// String uname =req.getParameter("username");
//		String pass =req.getParameter("password");
//		
//		ModelAndView mv = new ModelAndView("success.jsp");
//		
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
//		PreparedStatement ps = c.prepareStatement("insert into user values(?,?)");
//		ps.setString(1,uname);
//		ps.setString(2,pass);
//		
//		if (ps.execute() == false)
//		{
//			mv.addObject("nm", "insert Successfully...");
//		}
//		mv.addObject("nm", "insert Not Successfully...");
//		
//		
//		return mv;
//	}

	@RequestMapping("userLogin")
	public ModelAndView userLogin(HttpServletRequest req) throws SQLException {
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");

		ModelAndView mv = new ModelAndView("success.jsp");

		if (uname.equals("admin")) {
			mv.addObject("nm", uname);
		} else {
			mv.addObject("nm", "Enter valid details");
		}
		return mv;
	}
	
	public List<User> showData()
	{
		List<User> l1 = new ArrayList<User>();
		ModelAndView mv = new ModelAndView("success.jsp");
		try {

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from register");
			while (rs.next()) {
				l1.add(new User (rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
			}
			
			c.close();
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("data", l1);
		
		return l1;
		
	}

}
