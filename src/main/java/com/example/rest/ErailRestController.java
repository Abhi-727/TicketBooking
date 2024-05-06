package com.example.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.Passenger;
import com.example.response.Ticket;

@RestController
public class ErailRestController {
	
	
	private Map<Integer,Ticket > tickets =new HashMap<>();
	
	@PostMapping(
			value ="/ticket"
			//consumes = {"application/xml" ,"application/json"},
			//produces = {"application/xml","application/json"}
			)
	public Ticket bookTicket(@RequestBody Passenger passenger) {
	
		Ticket t =new Ticket();
		
		Random r =new Random();
		int ticketId=r.nextInt();
		
		t.setTicketId(ticketId);
		t.setFrom(passenger.getFrom());
		t.setTo(passenger.getTo());
		t.setTktStatus("confirmed");
		t.setTrainNum(passenger.getTrainNum());
		t.setTktcost("1500");
		
		tickets.put(ticketId, t);
		
		
		return t ;
	}
	
	@GetMapping(
			value ="/ticket/{ticketId}"
			//produces= {"application/xml","application/json"}
			
			)
	public Ticket getTicketInfo(@PathVariable Integer ticketId) {
		
		if(tickets.containsKey(ticketId)) {
			return tickets.get(ticketId);
		}
		return null;
		
	}
}
