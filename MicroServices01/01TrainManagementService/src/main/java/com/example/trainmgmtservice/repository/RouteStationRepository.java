package com.example.trainmgmtservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainmgmtservice.model.RouteStation;

public interface RouteStationRepository extends JpaRepository<RouteStation, Integer> {

	List<RouteStation> findByRoute_IdOrderByStationOrderAsc(Integer routeId);}
