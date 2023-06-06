package com.xworkz.hotel.dto;

import com.xworkz.hotel.constant.hotelType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString

public class HotelDto {
	
	private String hotelName;
	private hotelType type;
	private String location;
	private long contactNumber;
	private int noOfRooms;
	

}
