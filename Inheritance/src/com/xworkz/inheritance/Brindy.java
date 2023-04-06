package com.xworkz.inheritance;

public class Brindy extends Alcohol{
	
	float percentage =49.54f;
	double eastartio = 7.32d;
	
	public Brindy(float percentage,double eastartio) {
		this.percentage=percentage;
		this.eastartio=eastartio;
	}
	
	public  void givesHeadPain() {
		System.out.println("Drink tea ");
	}
	public void givesBodyPain() {
		System.out.println("Sleep well");
	}
	
	

}
