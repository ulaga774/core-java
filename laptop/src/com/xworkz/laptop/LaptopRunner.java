package com.xworkz.laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Dell7490Latitude lap = new Dell7490Latitude();
		lap.havingKeyboard();
		lap.havingDisplay();
		lap.haveCharger();
		lap.givesStorage();
		lap.makesPortable();
		System.out.println("---------concrete method--------");
		lap.havingFingerPrint();
		lap.havingTouchScreen();
		
		System.out.println("------------------------------------------------------------------------------------");
		
		Hp1100 hpLap = new Hp1100();
		hpLap.havingKeyboard();
		hpLap.havingDisplay();
		hpLap.haveCharger();
		hpLap.givesStorage();
		hpLap.makesPortable();
		System.out.println("---------concrete method--------");
		hpLap.colour();
		
		
		


	}

}
