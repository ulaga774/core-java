package com.xworkz.exceptiondeligate;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionClass {
	public static void found_file() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("qwertyu");
	}
	public static void found_class() throws ClassNotFoundException {
		Class.forName("sdfghj");
	}
	public static void array_unchecked() {
		String[] name = new String[1];
		System.out.println(name[5]);
	}

	public static void null_exp(String name) {
		name = null;
		name.equals("varun");
		System.out.println(name);
	}
	


}
