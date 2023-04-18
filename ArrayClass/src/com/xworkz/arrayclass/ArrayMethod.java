package com.xworkz.arrayclass;

public class ArrayMethod {
	public static void main(String[] args) {
		byte[] marks = {45,56,67,78,89,90,91};
		String[] snakeNames = {"KingCobra","cobra","love","Vipers","Garter","Titanoboa","Grass","Colubrid","Boomslang"};
		float [] ratio = {12.2f,23.3f,34.4f,45.5f,56.6f,67.6f,67.7f,78.8f,89.9f};
		short[] evenNumber= {1,2,3,4,5,6,7,8,9,10,11,12,25,14,15,16,17,18,19,20,21};
		char[] unitsSymbols= {'a','g','v','m','d','h','j','k','N'};
		int[] seialNumber = {01,5464,03,4534,05,4822,07,5866,19,2222,13,4444,467,6666,17};
		
		int[] mobilePrice = new int[45];
		String[] names = new String[10];
		String[] subjects = new String[5];
		String[] birds = new String [234];
		int[] noOfPlayersInTeam = new int[7];
		
		
		for(int i=0;i<marks.length;i=i+2) {
			System.out.println(marks[i]);
			
			}
		
			System.out.println("travel backword");
		for(int u=seialNumber.length-1;u>=0;u=u-2) {
			System.out.println(seialNumber[u]);
			
			
		}
		
			System.out.println("even number");
		for(int k=0;k<evenNumber.length;k++) {
			if(evenNumber[k] %2==0) {
			System.out.println(evenNumber[k]);
			
			}
		}



		
		
	}
}
