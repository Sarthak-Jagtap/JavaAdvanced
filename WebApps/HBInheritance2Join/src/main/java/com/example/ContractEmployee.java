package com.example;

import jakarta.persistence.Entity;

@Entity
//@DiscriminatorValue(value = "contract")
public class ContractEmployee extends Employee{

	double payPerHour;

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

}
