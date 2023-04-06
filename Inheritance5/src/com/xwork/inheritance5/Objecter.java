package com.xwork.inheritance5;

public class Objecter {
	public static void main(String[] args) {
		Kabaddi play = new Kabaddi(7,"leftArch","rightArch");
		
		play.makesHealthFully();
		play.physicalinjury();
		play.givesEnterainment();
		play.givesMentalPressure();
		
		System.out.println(play.noOfPlayers);
		System.out.println(play.leftCorner);
		System.out.println(play.rightCorner);
		System.out.println(play.sName);
		System.out.println(play.noOfSports);
		
	}

}
