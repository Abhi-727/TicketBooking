<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<h1> Find your Ticket Details </h1>
		<table>
			<tr>
					<td>Ticket Id</td>
					<td>${ticket.ticketId}</td>
			
			</tr>
			<tr>
					<td>From</td>
					<td>${ticket.from}</td>
			
			</tr>
			<tr>
					<td>To</td>
					<td>${ticket.to}</td>
			
			</tr>
			<tr>
					<td>Ticket Status</td>
					<td>${ticket.ticketStatus}</td>
			
			</tr>
			<tr>
					<td>Ticket cost</td>
					<td>${ticket.ticketCost}</td>
			
			</tr>
			<tr>
					<td>TicketNumber</td>
					<td>${ticket.trainNum}</td>
			
			</tr>
		
		</table>
		
		
		
		<a href ="/"> Go back</a>
</body>
</html>