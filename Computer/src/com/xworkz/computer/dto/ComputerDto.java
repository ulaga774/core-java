package com.xworkz.computer.dto;

public class ComputerDto {
	private String brand;
	private String model;
	private String colour;
	private int price;
	private ChargerType charger;

	public ComputerDto(String brand, String model, String colour, int price, ChargerType charger) {
		super();
		this.brand = brand;
		this.model = model;
		this.colour = colour;
		this.price = price;
		this.charger = charger;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public ChargerType getCharger() {
		return charger;
	}

	public void setCharger(ChargerType charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "ComputerDto [brand=" + brand + ", model=" + model + ", colour=" + colour + ", price=" + price
				+ ", charger=" + charger + "]";
	}

}
