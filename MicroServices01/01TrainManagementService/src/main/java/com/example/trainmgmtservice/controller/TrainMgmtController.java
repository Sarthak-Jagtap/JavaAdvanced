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
import com.example.trainmgmtservice.dto.RouteStationResponseDTO;
import com.example.trainmgmtservice.dto.ScheduleResponseDTO;
import com.example.trainmgmtservice.dto.TrainRequestDTO;
import com.example.trainmgmtservice.dto.TrainResponseDTO;
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
	public List<TrainResponseDTO> getAllTrains(){
		return trainService.getAllTrains()
				.stream()
				.map(train -> {
					TrainResponseDTO dto = new TrainResponseDTO();
					dto.setId(train.getId());
		            dto.setTrainNumber(train.getTrainNumber());
		            dto.setTrainName(train.getTrainName());
		            return dto;
				}).toList();
	}
	
	@GetMapping("/{id}")
	public Train getByTrainId(@PathVariable int id) {
		return trainService.getTrainById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteTrain(@PathVariable int id) {
	    trainService.deleteTrain(id);
		return "Train Deleted Successfully";
	}	
	
	@GetMapping("/{id}/route")
	public List<RouteStationResponseDTO> getRoute(@PathVariable int id){
		List<RouteStation> route = trainService.getRouteByTrainId(id);
		
		return route.stream()
				.map(RouteStationResponseDTO::new)
				.toList();
	}
	
	@GetMapping("/{id}/schedule")
    public List<ScheduleResponseDTO> getSchedule(@PathVariable int id) {
        List<Schedule> schedule =  trainService.getScheduleByTrainId(id);
        
        return schedule.stream()
        		.map(ScheduleResponseDTO::new)
        		.toList();
    }
}
