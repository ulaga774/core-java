package com.xworkz.dhaba.dto;

public class FoodlistDto {
	private String name;
	private int Quantity;
	private String Quality;
	private int price;
	public FoodlistDto(String name, int quantity, String quality, int price) {
		super();
		this.name = name;
		Quantity = quantity;
		Quality = quality;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getQuality() {
		return Quality;
	}
	public void setQuality(String quality) {
		Quality = quality;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "FoodlistDto [name=" + name + ", Quantity=" + Quantity + ", Quality=" + Quality + ", price=" + price
				+ "]";
	}
	
	

}
