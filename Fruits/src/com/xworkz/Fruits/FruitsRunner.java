package com.xworkz.Fruits;

import com.xworkz.FruitsRunner.Dao.FruitsDao;

public class FruitsRunner {
 public static void main(String[] args) {
	 
	 FruitsDao dao = new FruitsDao();
	 
	 
	 dao.SaveString("orange");
	 dao.SaveString("Apple");
	 dao.SaveString("Mango");
	 dao.SaveString("Goa");
	 dao.SaveString("Bannana");
	 System.out.println(".................................by index changing...........");
     dao.UpdateByIndex("Avacado",3);
     dao.read();
     System.out.println(".................................by name changing...........");
	 dao.UpdateByName("Mango","Puspa");
	 dao.read();
	 System.out.println(".................................remove value by index...........");
	 dao.DeleteByIndex(4);
	 dao.read();
	 System.out.println(".................................remove value by String name...........");
	 dao.DeleteByName("Puspa");
	 dao.read();
	 System.out.println(".................................searching the name...........");
	 dao.read();
	 boolean result = dao.SearchName("Apple");
	 System.out.println(result);
	 
	
	
	 
 }
}





