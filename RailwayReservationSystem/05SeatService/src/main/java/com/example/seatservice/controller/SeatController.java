package com.example.seatservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.seatservice.dto.SeatRequest;
import com.example.seatservice.service.SeatService;

@RestController
@RequestMapping("/seats")
public class SeatController {

	@Autowired
	private SeatService seatService;

	@PostMapping("/reserve")
	public String reserveSeat(@RequestBody SeatRequest request) {

	    boolean success = seatService.reserveSeat(
	        request.getTrainId(),
	        request.getTravelDate(),
	        request.getCount()
	    );

	    if (success) {
	        return "Seats booked";
	    } else {
	        return "Not enough seats";
	    }
	}
	
	@PutMapping("/release")
	public String releaseSeats(@RequestBody SeatRequest request) {

	    seatService.releaseSeats(
	        request.getTrainId(),
	        request.getTravelDate(),
	        request.getCount()
	    );

	    return "Seats released";
	}
}
