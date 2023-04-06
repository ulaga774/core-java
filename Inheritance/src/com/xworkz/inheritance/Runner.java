package com.xworkz.inheritance;


public class Runner {
	

	public static void main(String[] args) {
		Alcohol drink = new Alcohol();// object creating
		drink.makesCancer();
		drink.energyDrink();
		drink.givesConfidence();
		System.out.println(drink.price);
		System.out.println(drink.quantity);
		System.out.println(drink.name);
		System.out.println(drink.desin);
		System.out.println(drink.quality);
		
		Rum rum = new Rum ("less than brindy","normate price "); // object creating
		rum.makeschillness();
		rum.givesOldMemerys();
		System.out.println(rum.efforts);
		System.out.println(rum.cost);
		
		Brindy pain = new Brindy(49.54f, 7.32d);// object creating
		pain.givesHeadPain();
		pain.givesBodyPain();
		System.out.println(pain.percentage);
		System.out.println(pain.eastartio);
		
		Whisky whisky =new Whisky('f');// object creating
		whisky.makesprice();
		whisky.makesComfort();
		System.out.println(whisky.symbol);
	
	}
}
