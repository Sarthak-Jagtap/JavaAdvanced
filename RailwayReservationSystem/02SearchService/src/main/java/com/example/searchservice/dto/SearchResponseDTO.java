package com.example.searchservice.dto;

import java.util.List;

public class SearchResponseDTO {

	private String trainNumber;
	private String trainName;
	private List<RouteStationDTO> route;

	public String getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public List<RouteStationDTO> getRoute() {
		return route;
	}

	public void setRoute(List<RouteStationDTO> route) {
		this.route = route;
	}

}