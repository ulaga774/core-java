package com.xworkx.gyms;

import java.util.HashSet;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		for (Integer integer : set) {
			System.out.println(integer);
			
		}

	}

}
