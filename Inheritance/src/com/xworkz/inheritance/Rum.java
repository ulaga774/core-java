package com.xworkz.inheritance;

public class Rum extends Alcohol{

	String efforts;
	String cost;
	
	public Rum(String efforts , String cost) {
		this.efforts=efforts;
		this.cost=cost;
	}
	
	public  void makeschillness() {
		System.out.println("ice gives chillness");
	}
	public void givesOldMemerys() {
		System.out.println("think about it");
	}
}
