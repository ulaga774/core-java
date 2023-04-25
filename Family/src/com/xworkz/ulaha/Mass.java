package com.xworkz.ulaha;
public class Mass{
		public Mass(){
			System.out.println("Default Constructor");}
		
		public Mass(double num){
			this();
			System.out.println("I Don't Know");
		}
		public Mass(String name){
			this(10.01);
			System.out.println("Learn JAVA");
		}
		public static void main(String[] args){
			Mass branch= new Mass("ulaga");
			System.out.println("Learn JAVA");
	}

}
