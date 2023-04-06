package com.xworkz.inheritance;

public class Whisky extends Alcohol{
	int a = 1849;
	int b = 1;
	int brandName=a-b;
	char symbol = 'f';
	
	public Whisky (char symbol) {
		this.symbol =symbol;
	}
	

	public  void makesprice() {
		System.out.println(brandName);
	}
	public void makesComfort() {
		System.out.println("you go for high");
	}

}
