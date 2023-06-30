package com.xworkz.electronics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("ulaga", "1");
		map.put("mass", "2");
		map.put("kiran", "3");
		map.put("shubeh", "4");
		map.put("abi", "5");

		Set<String> key = map.keySet();
		for (String str : key) {
			System.out.println(map.get(str));

		}

	}

}
