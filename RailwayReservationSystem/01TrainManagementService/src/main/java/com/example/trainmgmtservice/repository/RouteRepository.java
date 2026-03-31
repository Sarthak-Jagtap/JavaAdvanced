package com.example.trainmgmtservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainmgmtservice.model.Route;

public interface RouteRepository extends JpaRepository<Route, Integer> {

	Optional<Route> findByTrain_Id(Integer trainId);}
