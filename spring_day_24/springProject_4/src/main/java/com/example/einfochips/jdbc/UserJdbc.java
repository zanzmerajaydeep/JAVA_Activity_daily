package com.example.einfochips.jdbc;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import com.example.einfochips.model.*;

import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;

import com.example.einfochips.model.User;

import jakarta.servlet.http.HttpServletRequest;

@Repository
public class UserJdbc {

	public void addRegister(HttpServletRequest req) throws SQLException {

		// String tempid = req.getParameter("id");
		String tempname = req.getParameter("uname");
		String tempsname = req.getParameter("sname");
		String tempnumber = req.getParameter("number");

		//ModelAndView mv = new ModelAndView("success.jsp");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
		PreparedStatement ps = c.prepareStatement("insert into register1 values(?,?,?)");
		// ps.setString(1, tempid);
		ps.setString(1, tempname);
		ps.setString(2, tempsname);
		ps.setString(3, tempnumber);
		boolean b = ps.execute();
//		if (b == false) {
//			mv.addObject("nm", "insert Successfully...");
//		} else {
//			mv.addObject("nm", "insert Not Successfully...");
//		}

		// showData();

		// return mv;
	}

	public List<User> showData() {
		List<User> l1 = new ArrayList<User>();
		//ModelAndView mv = new ModelAndView("success.jsp");
		try {

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice", "root", "root");
			java.sql.Statement s = c.createStatement();
			ResultSet rs = s.executeQuery("select * from register1");
			while (rs.next()) {
				l1.add(new User(rs.getString(1), rs.getString(2), rs.getInt(3)));
			}

			c.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(l1);
		//mv.addObject("data", l1);

		return l1;

	}

}
