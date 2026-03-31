package com.example.seatservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.seatservice.model.SeatAvailability;
import com.example.seatservice.repository.SeatRepository;

@Service
public class SeatService {

	@Autowired
	private SeatRepository repo;
	
	public synchronized boolean reserveSeat(Integer trainId, String date, Integer count) {
		SeatAvailability seat = repo.findByTrainIdAndTravelDate(trainId, date)
				.orElseThrow(() -> new RuntimeException("No Data Found"));
		
		if (seat.getAvailableSeats() < count) {
            return false;
        }
		
		seat.setAvailableSeats(seat.getAvailableSeats() - count);
        repo.save(seat);

        return true;
	}
	
	public synchronized void releaseSeats(Integer trainId, String date, int count) {
		SeatAvailability seat = repo
				.findByTrainIdAndTravelDate(trainId, date)
				.orElseThrow(() -> new RuntimeException("No Data Found"));
		
		seat.setAvailableSeats(seat.getAvailableSeats() + count);
		
		repo.save(seat);
	}
}
