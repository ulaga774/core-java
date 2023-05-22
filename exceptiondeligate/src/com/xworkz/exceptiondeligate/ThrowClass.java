package com.xworkz.exceptiondeligate;

import java.io.FileNotFoundException;

public class ThrowClass {

	public static void ownMethod() throws FileNotFoundException {
//		String file_a = "varun love story + worst ";
//		String file_b = "animal love kiran + avg";
		int a = 0;
		throw new FileNotFoundException("there is no file available in lap");

	}

	public  void ownMethod(String name) throws ClassNotFoundException {

		name = null;

		throw new ClassNotFoundException("the value is null.,but excuted classNotFound");

	}

}
