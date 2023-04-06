package com.xworkz.inheritance3;

public class Runner {
	public static void main(String[] args) {
		
		Bike travel = new Bike(2);
		travel.start();
		travel.stop();
		System.out.println(travel.engineType);
		System.out.println(travel.noOfTyres);
		System.out.println(travel.fuel);
		System.out.println(travel.strocke);
		travel.givesBackPain();
		
	}

}
