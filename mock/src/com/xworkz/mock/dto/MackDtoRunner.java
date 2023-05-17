package com.xworkz.mock.dto;

public class MackDtoRunner {

	public static void main(String[] args) {
		MockDto dto = new MockDto();
		System.out.println(dto.name);//public
		System.out.println(dto.type);//default
		dto.setPlace("karnataka");
		System.out.println(dto.getPlace());//private
		
		

	}

}
