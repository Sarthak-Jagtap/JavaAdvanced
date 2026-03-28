package com.example.bookingservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookingservice.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

	Optional<Booking> findByPnr(String pnr);
}
