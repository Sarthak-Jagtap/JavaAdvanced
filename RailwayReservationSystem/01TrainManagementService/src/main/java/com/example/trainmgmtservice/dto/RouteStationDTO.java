package com.example.trainmgmtservice.dto;

public class RouteStationDTO {

	private String stationCode;
	private int stationOrder;
	private String arrivalTime;
	private String departureTime;
	private int dayNumber;

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public int getStationOrder() {
		return stationOrder;
	}

	public void setStationOrder(int stationOrder) {
		this.stationOrder = stationOrder;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public int getDayNumber() {
		return dayNumber;
	}

	public void setDayNumber(int dayNumber) {
		this.dayNumber = dayNumber;
	}

}
