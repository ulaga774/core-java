package com.xworkz.animal;

public class Runner {

	public static void main(String[] args) {
		
		LIon lion = new LIon();
		lion.addAnimal();
		lion.merageAnimal();
		lion.callAnimal();
		
		Tiger hello = new Tiger();
		String ref = hello.helloLion("lions");
		System.out.println(ref);

	}

}
