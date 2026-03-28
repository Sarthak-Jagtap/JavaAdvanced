package com.example.trainmgmtservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.trainmgmtservice.dto.TrainRequestDTO;
import com.example.trainmgmtservice.model.RouteStation;
import com.example.trainmgmtservice.model.Schedule;
import com.example.trainmgmtservice.model.Train;
import com.example.trainmgmtservice.service.TrainService;

@RestController
@RequestMapping("/trains")
public class TrainMgmtController {

	@Autowired
	private TrainService trainService;
	
	@PostMapping
	public Train addTrain(@RequestBody TrainRequestDTO dto) {
		return trainService.addTrain(dto);
	}
	
	@GetMapping
	public List<Train> getAllTrains(){
		return trainService.getAllTrains();
	}
	
	@GetMapping("/{id}")
	public Train getByTrainId(@PathVariable int id) {
		return trainService.getTrainById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTrain(@PathVariable int id) {
		return "Train Deleted Successfully";
	}	
	
	@GetMapping("/{id}/route")
	public List<RouteStation> getRoute(@PathVariable int id){
		return trainService.getRouteByTrainId(id);
	}
	
	@GetMapping("/{id}/schedule")
    public List<Schedule> getSchedule(@PathVariable int id) {
        return trainService.getScheduleByTrainId(id);
    }
}
