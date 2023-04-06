package com.xworkz.inheritance4;

public class Strawberries extends Apple {
	
	int cost;
	String quality;
	String anthorName;
	String colour;
	
	public Strawberries(int cost,String quality,String anthorName,String colour) {
		this.cost=cost;
		this.quality=quality;
		this.anthorName=anthorName;
		this.colour=colour;
		
		System.out.println("you taste like a Strawberries starts on my lips");
	}

}
