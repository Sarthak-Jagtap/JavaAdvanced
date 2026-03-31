package com.example.bookingservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookingservice.dto.SeatRequest;
import com.example.bookingservice.feign.SeatClient;
import com.example.bookingservice.model.Booking;
import com.example.bookingservice.repository.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository repo;

	@Autowired
	private SeatClient seatClient;

	public BookingService(BookingRepository repo) {
		this.repo = repo;
	}

	public Booking bookTicket(Booking booking) {

		SeatRequest request = new SeatRequest();
		request.setTrainId(booking.getTrainId());
		request.setTravelDate(booking.getTravelDate());
		request.setCount(booking.getSeatCount());

		String response = seatClient.reserveSeat(request);

		if (response == null || !response.contains("Seats booked")) {
			throw new RuntimeException("Seats not Available");
		}

		try {
			booking.setPnr(generatePNR());
			booking.setStatus("BOOKED");

			return repo.save(booking);

		} catch (Exception e) {

			seatClient.releaseSeats(request);

			throw new RuntimeException("Booking failed, seats rolled back");

		}
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
