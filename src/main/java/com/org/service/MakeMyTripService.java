package com.org.service;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.org.request.Passenger;
import com.org.response.Ticket;

@Service
public class MakeMyTripService {
	
	private static final String IRCTC_ENDPOINT =" ";
	
	
	public Ticket  processTktBooking( Passenger passenger) {
		
		RestTemplate r =new RestTemplate();
		ResponseEntity<Ticket> responseEntity=
				r.postForEntity(IRCTC_ENDPOINT, r, Ticket.class);
		 
		int statusCode = responseEntity.getStatusCodeValue();
		
		if(statusCode== 200) {
			Ticket ticket=responseEntity.getBody();
			return ticket;
		}
		return null;
}
}
