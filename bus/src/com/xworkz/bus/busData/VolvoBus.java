package com.xworkz.bus.busData;

public class VolvoBus {
	static int noOfTyres;
	static int noOfDoors;
	static byte noOfMirror;
	static byte noOfGears;
	public int SpeedMeter;
	public String EngineName;
	private short noOfSeats;
	private String EngineType;
	protected static long engineSerialNumber;
	protected static short BusNumber=4545;
	Drives drivesTypes;
	
	public VolvoBus( int SpeedMeter,String EngineName,short noOfSeats, String EngineType, long engineSerialNumber, Drives drivesTypes) {
		
		this.SpeedMeter=SpeedMeter;
		this.EngineName=EngineName;
		this.noOfSeats=noOfSeats;
		this.EngineType=EngineType;
		this.engineSerialNumber=engineSerialNumber;
		this.drivesTypes=drivesTypes;
			
		
	}
	
	public String moreEmergencyFeatures() {
		System.out.println("private with non static");
		System.out.println(noOfSeats);
		System.out.println(EngineType);
		return"medical help";
		
	}
	static{
		noOfTyres=4;
		noOfDoors=3;
		noOfMirror=3;
		noOfGears=5;
			
	}
	
	public static void givesComfortable() {
		
		
		System.out.println("Default with non static");
		System.out.println(VolvoBus.noOfTyres);
		System.out.println(VolvoBus.noOfDoors);
		System.out.println(VolvoBus.noOfMirror);
		System.out.println(VolvoBus.noOfGears);
	}
	public static void providesWifi() {
		System.out.println("gives free internet");
		}

	public static void providesTelevision() {
	System.out.println("makes entertainment");
	}

	public static void makesSafetytravel() {
	System.out.println("comfortable to journey");
	}

}
