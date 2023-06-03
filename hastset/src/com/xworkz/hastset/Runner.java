package com.xworkz.hastset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Runner {

	public static void main(String[] args) {

		HashSet<Character> set = new HashSet<Character>();
		HashSet<String> intsSet = new HashSet<String>();
		LinkedHashSet<String> strSet = new LinkedHashSet<String>();

		set.add('a');
		set.add('f');
		set.add('e');
		set.add('d');
		set.add('c');
		set.add('a');
		set.add('b');

		intsSet.add("tamil");
		intsSet.add("english");
		intsSet.add("maths");
		intsSet.add("science");
		intsSet.add("socical");
		intsSet.add("tamil");
		intsSet.add("kanada");

		strSet.add("tamil");
		strSet.add("english");
		strSet.add("maths");
		strSet.add("science");
		strSet.add("socical");
		strSet.add("tamil");
		strSet.add("kanada");

		for (Character chars : set) {
			System.out.println(chars);
		}
		System.out.println("-------------");

		for (String str : intsSet) {
			System.out.println(str);
		}

		System.out.println("-------linkedHashSet----------");
		for (String Strs : strSet) {
			System.out.println(Strs);
		}

	}

}
