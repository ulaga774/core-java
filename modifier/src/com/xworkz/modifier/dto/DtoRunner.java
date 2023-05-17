package com.xworkz.modifier.dto;

public class DtoRunner {

	public static void main(String[] args) {
		ModifierDto dto = new ModifierDto();
		System.out.println(dto.ratio);
		System.out.println(dto.number);
		
		dto.setType("nice");
		System.out.println(dto.getType());
		
		
		

	}

}
