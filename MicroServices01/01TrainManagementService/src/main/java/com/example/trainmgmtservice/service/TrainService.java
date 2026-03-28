package com.example.trainmgmtservice.service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trainmgmtservice.dto.RouteStationDTO;
import com.example.trainmgmtservice.dto.TrainRequestDTO;
import com.example.trainmgmtservice.model.Route;
import com.example.trainmgmtservice.model.RouteStation;
import com.example.trainmgmtservice.model.Schedule;
import com.example.trainmgmtservice.model.Station;
import com.example.trainmgmtservice.model.Train;
import com.example.trainmgmtservice.repository.RouteRepository;
import com.example.trainmgmtservice.repository.RouteStationRepository;
import com.example.trainmgmtservice.repository.ScheduleRepository;
import com.example.trainmgmtservice.repository.StationRepository;
import com.example.trainmgmtservice.repository.TrainRepository;

import jakarta.transaction.Transactional;

@Service
public class TrainService {

	@Autowired
	private TrainRepository trainRepository;

	@Autowired
	private StationRepository stationRepository;

	@Autowired
	private RouteRepository routeRepository;

	@Autowired
	private RouteStationRepository routeStationRepository;

	@Autowired
	private ScheduleRepository scheduleRepository;

	@Transactional
	public Train addTrain(TrainRequestDTO dto) {

		Train train = new Train();
		train.setTrainNumber(dto.getTrainNumber());
		train.setTrainName(dto.getTrainName());
		train.setTrainType(dto.getTrainType());

		if (trainRepository.existsByTrainNumber(dto.getTrainNumber())) {
		    throw new RuntimeException("Train already exists");
		}
		
		train = trainRepository.save(train);

		Route route = new Route();
		route.setTrain(train);

		route = routeRepository.save(route);

		List<RouteStation> routeStations = new ArrayList<>();

		for (RouteStationDTO rsDto : dto.getStations()) {
			Station station = stationRepository.findById(rsDto.getStationCode())
					.orElseThrow(() -> new RuntimeException("Station Not Found"));

			RouteStation rs = new RouteStation();
			rs.setRoute(route);
			rs.setStation(station);
			rs.setStationOrder(rsDto.getStationOrder());
			rs.setDayNumber(rsDto.getDayNumber());

			if (rsDto.getArrivalTime() != null) {
				rs.setArrivalTime(LocalTime.parse(rsDto.getArrivalTime()));
			}

			if (rsDto.getDepartureTime() != null) {
				rs.setDepartureTime(LocalTime.parse(rsDto.getDepartureTime()));
			}

			routeStations.add(rs);
		}

		routeStationRepository.saveAll(routeStations);

		List<Schedule> schedules = new ArrayList<>();

		for (String day : dto.getRunningDays()) {
			Schedule schedule = new Schedule();
			schedule.setTrain(train);
			schedule.setRunningDay(day);
			schedules.add(schedule);
		}

		scheduleRepository.saveAll(schedules);

		return train;
	}
	
	public List<Train> getAllTrains(){
		return trainRepository.findAll();
	}
	
	public Train getTrainById(int id) {
		return trainRepository.findById(id).orElseThrow(() -> new RuntimeException("Train not found"));
	}
	
	public void deleteTrain(int id) {
		if(!trainRepository.existsById(id)) {
			throw new RuntimeException("Train not found");
		}
		
		trainRepository.deleteById(id);
	}
	
	public List<RouteStation> getRouteByTrainId(int trainId) {
	    Route route = routeRepository.findByTrain_Id(trainId)
	            .orElseThrow(() -> new RuntimeException("Route not found"));

	    return routeStationRepository.findByRoute_IdOrderByStationOrderAsc(route.getId());
	}
	
	public List<Schedule> getScheduleByTrainId(int id){
		return scheduleRepository.findByTrain_Id(id);
	}

}
