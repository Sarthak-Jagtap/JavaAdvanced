package com.example.trainmgmtservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainmgmtservice.model.Station;

public interface StationRepository extends JpaRepository<Station, String>{

}
