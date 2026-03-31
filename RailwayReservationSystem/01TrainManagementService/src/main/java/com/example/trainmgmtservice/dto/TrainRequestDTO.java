package com.example.trainmgmtservice.dto;

import java.util.List;

public class TrainRequestDTO {

	private String trainNumber;
	private String trainName;
	private String trainType;

	private List<RouteStationDTO> stations;

	private List<String> runningDays;

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

	public String getTrainType() {
		return trainType;
	}

	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}

	public List<RouteStationDTO> getStations() {
		return stations;
	}

	public void setStations(List<RouteStationDTO> stations) {
		this.stations = stations;
	}

	public List<String> getRunningDays() {
		return runningDays;
	}

	public void setRunningDays(List<String> runningDays) {
		this.runningDays = runningDays;
	}

}
