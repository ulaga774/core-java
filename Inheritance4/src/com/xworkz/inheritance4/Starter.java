package com.xworkz.inheritance4;

public class Starter {
	
	public static void main(String[] args) {
		Strawberries berry = new Strawberries(240,"good","happiest fruit","red");
			
		berry.givesEnergy();
		berry.health();
		berry.givesvitamins();
		berry.givesminerals();
		System.out.println(berry.cost);
		System.out.println(berry.price);
		System.out.println(berry.quality);
		System.out.println(berry.anthorName);
		System.out.println(berry.colour);
		
	}

}
