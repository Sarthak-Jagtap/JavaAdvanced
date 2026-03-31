package com.example.searchservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.searchservice.dto.RouteStationDTO;
import com.example.searchservice.dto.ScheduleDTO;
import com.example.searchservice.dto.SearchResponseDTO;
import com.example.searchservice.dto.TrainDTO;
import com.example.searchservice.feign.TrainClient;

@Service
public class SearchService {

	@Autowired
	private TrainClient trainClient;
	
	public List<SearchResponseDTO> search(String from, String to, String day){
		
		List<SearchResponseDTO> result = new ArrayList<>();
		
		List<TrainDTO> trains = trainClient.getAllTrains();
		
		for(TrainDTO train : trains) {
			List<RouteStationDTO> route = trainClient.getRoute(train.getId());
			
			int fromIndex = -1;
			int toIndex = -1;
			
			for(int i = 0; i<route.size(); i++) {
				if(route.get(i).getStationCode().equalsIgnoreCase(from)) {
					fromIndex = i;
				}
				
				if (route.get(i).getStationCode().equalsIgnoreCase(to)) {
                    toIndex = i;
                }
			}
			
			if (fromIndex == -1 || toIndex == -1 || fromIndex >= toIndex) {
                continue;
            }
			
			List<ScheduleDTO> schedules = trainClient.getSchedule(train.getId());
			
			boolean runsOnDay = schedules.stream()
					.anyMatch(s -> s.getRunningDay().equalsIgnoreCase(day));
			
			if(!runsOnDay) continue;
			
			List<RouteStationDTO> subRoute = route.subList(fromIndex, toIndex + 1);
			
			SearchResponseDTO dto = new SearchResponseDTO();
			
			dto.setTrainNumber(train.getTrainNumber());
			dto.setTrainName(train.getTrainName());
			dto.setRoute(subRoute);
			
			result.add(dto);
			
		}
		
		return result;
	}
}
