package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.spring.dao.TicketDao;
import com.spring.dto.TicketBooking;

@Controller
public class TicketCtrl {
	@Autowired
	TicketBooking booking;
	@Autowired
	TicketDao dao;

	@RequestMapping("/booking")
	public ModelAndView methodBooking() {
		ModelAndView andView = new ModelAndView("booking.jsp");
		andView.addObject("bookingObj", booking);
		return andView;
	}

	@ResponseBody
	@RequestMapping("/ticketBooking")
	public String methodInput(TicketBooking booking) {
		booking.setTotalPrice(booking.getPrice() * booking.getNoOfTicket());
		dao.ticketBooking(booking);
		return "YOUR BOOKING HAS BEEN DONE $:" + booking.getTotalPrice();
	}

}