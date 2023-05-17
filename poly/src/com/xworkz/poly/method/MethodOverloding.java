package com.xworkz.poly.method;

public class MethodOverloding {

	// private long ph_number;

	public String call(String name, int number) {
		return "name=" + name + "---and---" + "int=" + number;

	}

	public String call(long ph_number) {
		return "ph_number=" + ph_number;

	}

	protected String call(char symbol, float percentage) {
		return "symbol" + symbol + "----and----" + "percentage=" + percentage;

	}

}
