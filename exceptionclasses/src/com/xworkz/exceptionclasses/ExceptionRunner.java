package com.xworkz.exceptionclasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner {

	public static void main(String[] args) {

		// unchecked by compiler

//		String[] index = new String[3];
//		System.out.println(index[4]);
//
//		String name = null;
//		name.equals("ulaga");
//		System.out.println(name);
//
//		int a = 0;
//		int b = 7;
//		System.out.println((b * a) / a);
		
		// checked by compiler
		
		try {
			FileInputStream input_file = new FileInputStream("C:\\Users\\Dell\\Documents\\DefoultConstructor.java");
			System.out.println("hello goolge {say hi to all}");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("file not found ");
		}
	
		

	}

}
