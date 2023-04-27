package com.xworkz.Groceries.Dao;

public class GroceryDao {

	String[] products = new String[5];

	public String[] addGrocery(String grocery) {
		if (grocery != null) {
			for (int i = 0; i < products.length; i++) {
				if (products[i] == null) {
					products[i] = grocery;
					// System.out.println("if value is null exe this");
					return products;

				}
			}

		}
		System.out.println("if value is null this will be executed");
		return products;
	}

	public boolean updateGroceryByIndex(String update, int index) {
		if (update != null) {
			for (int i = 0; i < products.length; i++) {
				if (products != null) {
					products[index] = update;
					System.out.println("the products value is not null");
					return true;
				}
			}
		}
		System.out.println("the products value is  null");
		return false;

	}

	public boolean updateGroceryByName(String updateValue, String newValue) {
		if (updateValue != null) {
			for (int i = 0; i <= products.length - 1; i++) {
				if (updateValue.equals(products[i])) {
					products[i] = newValue;
					// System.out.println("----------------------------"+"changing the execting
					// value to new");
					return true;
				}
			}

		}

		return false;
	}

	public boolean deleteByIndex(int removeIndex) {
		products[removeIndex] = null;
		return true;

	}

	public boolean deleteByName(String removeIndex) {
		for (int i = 0; i <= products.length - 1; i++) {
			if (removeIndex.equals(products[i])) {
				products[i] = null;
				return true;
			}
		}
		return false;
	}

	public void Read() {
		for (int j = 0; j < products.length; j++) {
			System.out.println(products[j]);
		}
	}
}
