package com.xworkz.Groceries;

import com.xworkz.Groceries.Dao.GroceryDao;

public class GroceryRunner {

	public static void main(String[] args) {
		GroceryDao ref = new GroceryDao();
		ref.addGrocery("Rice");
		ref.addGrocery("Oil");
		ref.addGrocery("Meat");
		ref.addGrocery("Dairy");
		ref.addGrocery("Eggs");
		System.out.println("----------------------------"+"update a new value by index");
		ref.updateGroceryByIndex("salt", 3);
		ref.Read();
//		ref.updateGroceryByIndex("food", 20); // test check
//		ref.Read();
		System.out.println("----------------------------"+"changing the before value to new value");
		ref.updateGroceryByName("Eggs", "suger");
		ref.Read();
		System.out.println("----------------------------"+"remove the before value by index");
		ref.deleteByIndex(1);
		ref.Read();
		System.out.println("----------------------------"+"remove the before value by name");
		ref.deleteByName("Rice");
		ref.Read();

	}

}
