<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="ticketBooking" modelAttribute="bookingObj">
Customer Name: <form:input path="CustomerName" placeholder="your name"
			align="centre" />
		<br>
Seat Number: <form:input path="SeatNo"
			placeholder="immersive experence in" align="center" />
		<br>
Number of Tickets: <form:input path="NoOfTicket"
			placeholder="how many of you" align="centre" />
		<br>
Price per Ticket: <form:input path="Price" placeholder="per head"
			align="centre" />
		<br>
		<form:button>BOOK MY TICKET</form:button>
	</form:form>

</body>
</html>