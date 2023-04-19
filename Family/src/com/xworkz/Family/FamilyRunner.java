package com.xworkz.Family;

import com.xworkz.Family.Data.FamilyData;

public class FamilyRunner {
	
	public static void main(String[] args) {
		FamilyData data = new FamilyData( 4,"JCB Kumar", "madesh",2,"ruggedTypes");
		
		System.out.println(data);
	
		FamilyData data1 = new FamilyData( 4,"JCB Kumar", "madesh",2,"ruggedTypes");
		
		System.out.println(data.equals(data1));
	}

}
