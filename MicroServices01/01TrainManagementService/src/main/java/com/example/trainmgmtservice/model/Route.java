package com.example.trainmgmtservice.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "routes")
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	@JoinColumn(name = "train_id", nullable = false, unique = true)
	@JsonIgnore
	private Train train;

	@OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
	@OrderBy("stationOrder ASC")
	@JsonManagedReference
	private List<RouteStation> routeStations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public List<RouteStation> getRouteStations() {
		return routeStations;
	}

	public void setRouteStations(List<RouteStation> routeStations) {
		this.routeStations = routeStations;
	}

}
