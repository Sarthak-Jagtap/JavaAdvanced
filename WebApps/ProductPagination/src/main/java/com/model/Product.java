package com.model;

import java.time.LocalDate;

public class Product {
	private int pId;
	private String pName;
	private double pPrice;
	private int pQuantity;
	private LocalDate pMFGDate;

	public Product(int pId, String pName, double pPrice, int pQuantity, LocalDate pMFGDate) {
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.pMFGDate = pMFGDate;
	}

	public int getpId() {
		return pId;
	}

	public String getpName() {
		return pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public LocalDate getpMFGDate() {
		return pMFGDate;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public void setpMFGDate(LocalDate pMFGDate) {
		this.pMFGDate = pMFGDate;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", pQuantity=" + pQuantity
				+ ", pMFGDate=" + pMFGDate + "]";
	}

}
