package com.xworkz.Alcohol.Dao;



public class AlcoholDao{
	
	String[] alchohol = new String[4];
	
	public String[] addAlchohol(String alchoholism) {
		for(int i=0;i<alchohol.length;i++) {
		if(alchohol[i]==null) {	
		alchohol[i]=alchoholism;
		return alchohol;
	}
		}
		return alchohol;
	}
	public String[] read() {
	return alchohol;
	}
	
	

}
