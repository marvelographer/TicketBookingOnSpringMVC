package com.spring.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;

@Entity
@Component
//@Data
public class TicketBooking {
	@Id
	@GeneratedValue
	private int TicketId;
	private String CustomerName;
	private String SeatNo;
	private int NoOfTicket;
	private double Price;
	private double TotalPrice;
	
	public int getTicketId() {
		return TicketId;
	}
	public void setTicketId(int ticketId) {
		TicketId = ticketId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getSeatNo() {
		return SeatNo;
	}
	public void setSeatNo(String seatNo) {
		SeatNo = seatNo;
	}
	public int getNoOfTicket() {
		return NoOfTicket;
	}
	public void setNoOfTicket(int noOfTicket) {
		NoOfTicket = noOfTicket;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public double getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		TotalPrice = totalPrice;
	}
}