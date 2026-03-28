package com.example.trainmgmtservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trainmgmtservice.model.Train;

public interface TrainRepository extends JpaRepository<Train, Integer> {

	Optional<Train> findByTrainNumber(String trainNumber);

	boolean existsByTrainNumber(String trainNumber);

}
