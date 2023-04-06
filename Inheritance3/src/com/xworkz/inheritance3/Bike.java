package com.xworkz.inheritance3;

public class Bike extends Car {
	
	int engineType;
	
	public Bike(int engineType) {
		this.engineType=engineType;
		
	}

	
	public void givesBackPain() {
		System.out.println("duo to long travel");
	}
	

}
