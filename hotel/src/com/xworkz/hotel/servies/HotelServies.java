package com.xworkz.hotel.servies;

import java.util.HashMap;

import com.xworkz.hotel.dto.HotelDto;

public interface HotelServies {
	
	public boolean save(Integer id , HotelDto dto);
	public HashMap<Integer, HotelDto> read();
	public HotelDto find(Integer id);
	public HotelDto update(Integer id ,String name);
	public HotelDto delect(Integer id);

	

}
