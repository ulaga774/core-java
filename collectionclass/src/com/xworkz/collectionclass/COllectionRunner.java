package com.xworkz.collectionclass;

import java.util.ArrayList;

public class COllectionRunner {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("tamil");
		list.add("ulaga");
		list.add("varun");
		list.add("kiran");
		list.add("shuhub");
		list.add("suresh");
		list.add("mari");
		list.add("madesh");
		list.add("sanjay");
		list.add("thiyagu");
		list.add("gowtham");
		list.add("kabil");
		list.add("ela");
		list.add("sukumar");
		list.add("pugal");
		list.add("veera");
		list.add("sandy");
		list.add("praba");
		list.add("kumar");
		list.add("mani");
		System.out.println(list.toString());
		
		System.out.println("------------remove----------");
		list.remove(0);
		list.remove(0);
		list.remove(0);
		list.remove(0);
		list.remove(0);
		System.out.println(list.toString());
		
		System.out.println("------add by index-----");
		list.add(0, "tamil");
		list.add(1, "ulaga");
		list.add(2, "varun");
		list.add(3, "kiran");
		list.add(4, "shuhub");
		System.out.println(list.toString());
		
		System.out.println("-------get-----------");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.get(5));
		System.out.println(list.get(6));
		System.out.println(list.get(7));
		System.out.println(list.get(8));
		System.out.println(list.get(9));
		System.out.println(list.get(10));
		
		System.out.println("----------set----------");
		
		list.set(2, "madesh");
		list.set(1, "kamal");
		list.set(0, "rajini");
		System.out.println(list.toString());
	
		System.out.println("----indexof--");
		System.out.println(list.indexOf("kamal"));
		System.out.println("------toarray-----");
		System.out.println(list.toArray());

		
		
	}

}
