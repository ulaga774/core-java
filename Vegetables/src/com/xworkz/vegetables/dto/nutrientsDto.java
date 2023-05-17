package com.xworkz.vegetables.dto;

public class nutrientsDto {
	private String protine;
	private int carbs;
	public nutrientsDto(String protine, int carbs) {
		super();
		this.protine = protine;
		this.carbs = carbs;
	}
	public String getProtine() {
		return protine;
	}
	public void setProtine(String protine) {
		this.protine = protine;
	}
	public int getCarbs() {
		return carbs;
	}
	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}
	@Override
	public String toString() {
		return "nutrientsDto [protine=" + protine + ", carbs=" + carbs + "]";
	}
	
	

}
