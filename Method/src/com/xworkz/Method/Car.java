package com.xworkz.Method;

public class Car extends Vehicle {
	public  void ride(int speed,int km, float reachingHours) {
		System.out.println(speed);
		System.out.println(km);
		System.out.println(reachingHours);
		}
	public  void travel() {
		System.out.println("gives smooth travel");
		}
	public  void consume(String fuel) {
		System.out.println(fuel);
		}


}
