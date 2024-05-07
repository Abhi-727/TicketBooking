package com.org.response;

import lombok.Data;

@Data
public class Ticket {
	
	private Integer ticketId;
	private String from;
	private String to;
	private String ticketStatus;
	private String ticketCost;
	private String trainNum;
	
	
}
