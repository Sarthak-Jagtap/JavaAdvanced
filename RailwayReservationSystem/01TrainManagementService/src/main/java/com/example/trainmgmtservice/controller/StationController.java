package com.example.trainmgmtservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainmgmtservice.model.Station;
import com.example.trainmgmtservice.repository.StationRepository;

@RestController
@RequestMapping("/stations")
public class StationController {

	@Autowired
	private StationRepository stationRepository;

	@PostMapping
	public Station addStation(@RequestBody Station station) {
		return stationRepository.save(station);
	}

	@GetMapping
	public List<Station> getAllStations() {
		return stationRepository.findAll();
	}

	@GetMapping("/{code}")
	public Station getStation(@PathVariable String code) {
		return stationRepository.findById(code).orElseThrow(() -> new RuntimeException("Station not found"));
	}

}
