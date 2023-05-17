package com.xworkz.gym.dto;

public class GymDto {
	
	private String name;
	private int age;
	private String charType;
	private String place ;
	private int phNumber;
	private String nickName;
	
	
	public GymDto(String name, int age, String charType, String place, int phNumber, String nickName) {
		super();
		this.name = name;
		this.age = age;
		this.charType = charType;
		this.place = place;
		this.phNumber = phNumber;
		this.nickName = nickName;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getCharType() {
		return charType;
	}


	public void setCharType(String charType) {
		this.charType = charType;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getPhNumber() {
		return phNumber;
	}


	public void setPhNumber(int phNumber) {
		this.phNumber = phNumber;
	}


	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	@Override
	public String toString() {
		return "GymDto [name=" + name + ", age=" + age + ", charType=" + charType + ", place=" + place + ", phNumber="
				+ phNumber + ", nickName=" + nickName + "]";
	}
	
	
	
	
	

}
