package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.request.Passenger;
import com.org.response.Ticket;
import com.org.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
		
	@Autowired
	private MakeMyTripService service;
	
	
	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	@PostMapping("/bookTicket")
	public String bookTicket(Passenger request ,Model model) {
		
	Ticket ticketInfo=service.processTktBooking(request);
	
	model.addAttribute("ticket", ticketInfo);
	
		System.out.println("passenger info "+request);
		
		return "success";
	}
}
