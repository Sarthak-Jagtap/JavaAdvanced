package com.example.searchservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.searchservice.dto.RouteStationDTO;
import com.example.searchservice.dto.ScheduleDTO;
import com.example.searchservice.dto.TrainDTO;

@FeignClient(name = "train-service")
public interface TrainClient {
	
	@GetMapping("/trains")
	List<TrainDTO> getAllTrains();
	
	@GetMapping("/trains/{id}/route")
	List<RouteStationDTO> getRoute(@PathVariable int id);
	
	@GetMapping("/trains/{id}/schedule")
	List<ScheduleDTO> getSchedule(@PathVariable int id);	
	
}
