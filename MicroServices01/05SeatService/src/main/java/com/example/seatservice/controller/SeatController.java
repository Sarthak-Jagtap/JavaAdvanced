package com.example.seatservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.seatservice.service.SeatService;

@RestController
@RequestMapping("/seats")
public class SeatController {

	@Autowired
	private SeatService seatService;

	@PostMapping("/reserve")
	public String serve(
			@RequestParam Integer trainId, 
			@RequestParam String date, 
			@RequestParam Integer count) {
		boolean success = seatService.reserveSeat(trainId, date, count);

		if (success) {
			return "Seat Booked";
		} else {
			return "No Enough Seats";
		}
	}
	
	@PutMapping("/release")
	public String releaseSeats(@RequestParam Integer trainId,
	                           @RequestParam String date,
	                           @RequestParam int count) {

		seatService.releaseSeats(trainId, date, count);
	    return "Seats released";
	}

}
