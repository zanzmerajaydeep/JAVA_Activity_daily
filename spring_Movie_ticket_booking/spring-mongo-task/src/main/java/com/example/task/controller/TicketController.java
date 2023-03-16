package com.example.task.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.task.model.TicketModel;
import com.example.task.reposiotry.TicketRepository;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@RestController
public class TicketController {

	@Autowired
	TicketRepository ticketRepository;

	@GetMapping("/check")
	public String check(@RequestParam String mno, String movielist, String mdate, String mtime, String seatType,
			String nseats,String ptype, String tid) {

//		List<TicketModel> li = ticketRepository.findAll();
		
		
		int p_count = 100;
		int e_count = 300;
		for (TicketModel i : ticketRepository.findSameShowUsers(movielist,mdate,mtime)) {
			
				if (seatType.equals("economy")) {
					e_count = e_count - Integer.parseInt(i.getNumberOfSeats());
				} else {
					p_count = p_count - Integer.parseInt(i.getNumberOfSeats());
				}
			
		}
		if (seatType.equals("economy")) {
			e_count = e_count - Integer.parseInt(nseats);

		} else {
			p_count = p_count - Integer.parseInt(nseats);
		}
		
		if (e_count <= 0 || p_count <= 0) {
			return "false";
		} else {
			return "true";
		}
		
		

	}

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		return mv;

	}

	@GetMapping("/add")
	public ModelAndView add(@RequestParam String mno, String movielist, String mdate, String mtime, String seatType, String nseats, String ptype, String tid ) {
		
		ModelAndView mv = new ModelAndView("success");
		
		 LocalDate currentDate = LocalDate.now(); 
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
		 String bookingDate = currentDate.format(formatter);
		 
		 int paymentAmount = 0;
		 
		 if(seatType.equals("economy")) {
			 paymentAmount = 150 * Integer.parseInt(nseats);
			 
		 }
		 
		 else {
			 paymentAmount = 250 * Integer.parseInt(nseats);
		 }
				 
		
		ticketRepository.save(new TicketModel(mno, movielist, bookingDate, mdate, mtime,
			nseats, seatType, ptype, "Success", Integer.toString(paymentAmount)));
		
		return mv.addObject("paymentAmount",paymentAmount);
	}

	
}
