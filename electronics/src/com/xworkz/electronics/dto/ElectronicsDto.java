package com.xworkz.electronics.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ElectronicsDto {

	private String name;
	private int price;
	private long serialNumber;
	private float date;
	private int warranty;

}
