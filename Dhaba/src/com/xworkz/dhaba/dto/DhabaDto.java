package com.xworkz.dhaba.dto;

import com.xworkz.dhaba.constant.Type;

public class DhabaDto {
	private String name;
	private String location;
	private int rating;
	private Type type;
	private FoodlistDto list;
	public DhabaDto(String name, String location, int rating, Type type, FoodlistDto list) {
		super();
		this.name = name;
		this.location = location;
		this.rating = rating;
		this.type = type;
		this.list = list;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public FoodlistDto getList() {
		return list;
	}
	public void setList(FoodlistDto list) {
		this.list = list;
	}
	
public String toString() {
	return "DhabaDto [ Name=" + name + ",location=" + location + ",Rating" + rating + ",Type=" + type + ",Foodlist" + list + "]";
}
	
	
	

}
