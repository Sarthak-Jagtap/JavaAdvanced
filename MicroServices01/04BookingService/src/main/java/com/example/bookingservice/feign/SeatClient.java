package com.example.bookingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.bookingservice.dto.SeatRequest;

@FeignClient(name = "seat-service")
public interface SeatClient {
    
	@PostMapping("/seats/reserve")
	String reserveSeat(@RequestBody SeatRequest request);

	@PutMapping("/seats/release")
	String releaseSeats(@RequestBody SeatRequest request);
}
