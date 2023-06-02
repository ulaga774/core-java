package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class WatchDto {
	
	private String brand;
	private String type;
	private String colour;
	private int price;
	private String shape;

}
