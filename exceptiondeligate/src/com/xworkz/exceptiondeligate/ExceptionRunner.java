package com.xworkz.exceptiondeligate;

import java.io.FileNotFoundException;

public class ExceptionRunner {

	public static void main(String[] args) {
		try {
			ExceptionClass.found_file();
			ExceptionClass.found_class();
			ExceptionClass.array_unchecked();
			ExceptionClass.null_exp("kiran");

		} catch (FileNotFoundException e) {

			int a = 10;
			int b = 2 + a;
			System.out.println("[file not found + checked exception]" + "----" + a);

		} catch (ClassNotFoundException e) {
			System.out.println("class not found + checked exception");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("check the index");

		} catch (NullPointerException e) {
			System.out.println("null pointer exception");
		}
	}

}
