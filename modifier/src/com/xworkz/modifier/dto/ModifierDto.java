package com.xworkz.modifier.dto;

public class ModifierDto {
	
	public String name = "kiran" ;
	private static  String type ="good";
	protected int number = 1234;
	float ratio = 56.47f;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public static void main(String[] args) {
		System.out.println(type);
		
		
	}
	
	

}
