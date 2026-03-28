package com.example.bookingservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookingservice.model.Booking;
import com.example.bookingservice.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository repo;

	public BookingService(BookingRepository repo) {
		this.repo = repo;
	}

	public Booking bookTicket(Booking booking) {
		booking.setPnr(generatePNR());
		booking.setStatus("BOOKED");

		return repo.save(booking);
	}

	public Booking getByPnr(String pnr) {
		return repo.findByPnr(pnr).orElseThrow(() -> new RuntimeException("Booking Not Found"));
	}

	public Booking cancelTicket(String pnr) {
		Booking booking = getByPnr(pnr);

		booking.setStatus("CANCELLED");

		return repo.save(booking);
	}

	private String generatePNR() {
		return "TR" + System.currentTimeMillis() + new Random().nextInt(1000);
	}
}
