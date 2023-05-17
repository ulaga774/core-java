package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constants.VegetablesType;

public class VegetablesDto {
	private String vitamins;
	private int price;
	private VegetablesType types;
	private String name;
	private nutrientsDto nutrient;
	
	public VegetablesDto(String vitamins, int price, VegetablesType types, String name, nutrientsDto nutrient) {
		super();
		this.vitamins = vitamins;
		this.price = price;
		this.types = types;
		this.name = name;
		this.nutrient = nutrient;
	}

	public String getVitamins() {
		return vitamins;
	}

	public void setVitamins(String vitamins) {
		this.vitamins = vitamins;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public VegetablesType getTypes() {
		return types;
	}

	public void setTypes(VegetablesType types) {
		this.types = types;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public nutrientsDto getNutrient() {
		return nutrient;
	}

	public void setNutrient(nutrientsDto nutrient) {
		this.nutrient = nutrient;
	}

	@Override
	public String toString() {
		return "VegetablesDto [vitamins=" + vitamins + ", price=" + price + ", types=" + types + ", name=" + name
				+ ", nutrient=" + nutrient + "]";
	}
	
	

}
