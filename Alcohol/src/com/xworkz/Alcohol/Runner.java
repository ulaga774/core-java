package com.xworkz.Alcohol;

import com.xworkz.Alcohol.Dao.AlcoholDao;

public class Runner {

	public static void main(String[] args) {
	
		AlcoholDao alch = new AlcoholDao();
		alch.addAlchohol("Old Munk");
		alch.addAlchohol("DSP Black");
		alch.addAlchohol("MC Brandy");
		alch.addAlchohol("Vodka");
		
		String[] obj = alch.read();
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
	}

}
