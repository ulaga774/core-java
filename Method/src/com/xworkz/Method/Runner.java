package com.xworkz.Method;

public class Runner {
	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.ride(138,87,1.45f);
		veh.travel();
		veh.consume("petrol");
		
		Car car = new Car();
		car.ride(145,87,1.20f);
		car.travel();
		car.consume("petrol and diesel");
		
		Bike bike = new Bike();
		bike.ride(150,87,55.45f);
		bike.travel();
		bike.consume("petrol");
		
		Tricycle auto = new Tricycle();
		auto.ride(55,87,2.45f);
		auto.travel();
		auto.consume("electricPower");
		
		Truck truck = new Truck();
		truck.ride(89,87,2.00f);
		truck.travel();
		truck.consume("diesel");
		
		JCB jcb = new JCB();
		jcb.ride(45,87,3.00f);
		jcb.travel();
		jcb.consume("diesel");
		
		
				
		
		
	}

}
