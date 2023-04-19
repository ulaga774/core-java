package com.xworkz.bus;

import com.xworkz.bus.busData.Drives;
import com.xworkz.bus.busData.VolvoBus;

public class BusRunner extends VolvoBus{
	

	public BusRunner(int SpeedMeter, String EngineName, short noOfSeats, String EngineType, long engineSerialNumber,Drives drivesTypes) {
		super(SpeedMeter, EngineName, noOfSeats, EngineType, engineSerialNumber, drivesTypes);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		VolvoBus bus = new VolvoBus(180,"volvo D7E",(short)58,"4 StrockEngine",123456789,Drives.FRONTWHEELDRIVE);
		System.out.println("public with non static");
		System.out.println(bus.SpeedMeter);
		System.out.println(bus.EngineName);
		
		bus.moreEmergencyFeatures();
		VolvoBus.givesComfortable();
		
		BusRunner run = new BusRunner(180,"volvo D7E",(short)58,"4 StrockEngine",123456789,Drives.FRONTWHEELDRIVE);
		System.out.println("protected with non static");
		System.out.println(run.engineSerialNumber);
		System.out.println(run.BusNumber);
	}

}
