package com.example.trainmgmtservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainmgmtservice.model.Schedule;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer>{

	List<Schedule> findByTrain_Id(Integer trainId);	
	List<Schedule> findByRunningDay(String runningDay);
}
