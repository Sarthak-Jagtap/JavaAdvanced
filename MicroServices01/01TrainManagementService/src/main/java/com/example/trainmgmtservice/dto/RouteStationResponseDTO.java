package com.example.trainmgmtservice.dto;

import com.example.trainmgmtservice.model.RouteStation;

public class RouteStationResponseDTO {

	private String stationCode;
	private int stationOrder;

	public RouteStationResponseDTO(RouteStation rs) {
		this.stationCode = rs.getStation().getStationCode();
		this.stationOrder = rs.getStationOrder();
	}

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

}
