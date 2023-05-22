package com.xworkz.exceptiondeligate;

import java.io.FileNotFoundException;

public class ThrowRunner {

	public static void main(String[] args) {
		ThrowClass throwed = new ThrowClass();
		try {
			ThrowClass.ownMethod();
			throwed.ownMethod("kiran");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
