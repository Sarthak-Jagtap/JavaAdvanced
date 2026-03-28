package com.example.bookingservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "seat-service")
public interface SeatClient {
	
	@PostMapping("/seats/reserve")
	String reserveSeat(
			@RequestParam Integer trainId,
			@RequestParam String date,
			@RequestParam Integer count);
}
