package com.xworkz.poly.method;

public class MethodOverlodingRunner {

	public static void main(String[] args) {

		MethodOverloding loading = new MethodOverloding();
		System.out.println(loading.call(1234567));
		System.out.println(loading.call('a', 2.3f));
		System.out.println(loading.call("ulaga", 936038));
		

	}

}
