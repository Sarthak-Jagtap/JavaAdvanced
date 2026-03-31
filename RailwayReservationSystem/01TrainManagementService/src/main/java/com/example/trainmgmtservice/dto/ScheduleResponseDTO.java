package com.example.trainmgmtservice.dto;

import com.example.trainmgmtservice.model.Schedule;

public class ScheduleResponseDTO {

	private String runningDay;

	public ScheduleResponseDTO(Schedule s) {
		this.runningDay = s.getRunningDay();
	}

	public String getRunningDay() {
		return runningDay;
	}

	public void setRunningDay(String runningDay) {
		this.runningDay = runningDay;
	}

}
