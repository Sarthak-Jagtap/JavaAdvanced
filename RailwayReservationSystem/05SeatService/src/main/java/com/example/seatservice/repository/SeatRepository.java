package com.example.seatservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.seatservice.model.SeatAvailability;

public interface SeatRepository extends JpaRepository<SeatAvailability, Integer> {

	Optional<SeatAvailability> findByTrainIdAndTravelDate(Integer trainId, String travelDate);
}
