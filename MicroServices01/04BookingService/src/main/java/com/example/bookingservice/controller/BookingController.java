package com.example.bookingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookingservice.model.Booking;
import com.example.bookingservice.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {

	@Autowired
	private BookingService service;
	
	public BookingController(BookingService service) {
		this.service = service;
	}

	@PostMapping
	public Booking book(@RequestBody Booking booking) {
		return service.bookTicket(booking);
	}
	
	@GetMapping("/{pnr}")
	public Booking get(@PathVariable String pnr) {
		return service.getByPnr(pnr);
	}
	
	@PutMapping("/cancel/{pnr}")
	public Booking cancel(@PathVariable String pnr) {
		return service.cancelTicket(pnr);
	}
	
}

