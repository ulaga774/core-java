package com.xwork.inheritance5;

public class Kabaddi extends Cricket {
	int noOfPlayers;
	String leftCorner;
	String rightCorner;
	
	public Kabaddi(int noOfPlayers,String leftCorner,String rightCorner) {
		this.noOfPlayers=noOfPlayers;
		this.leftCorner=leftCorner;
		this.rightCorner=rightCorner;
		
		System.out.println("Come Let's Play");
	}


}
