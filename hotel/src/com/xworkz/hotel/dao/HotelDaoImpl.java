package com.xworkz.hotel.dao;

import java.util.HashMap;

import com.xworkz.hotel.dto.HotelDto;

public class HotelDaoImpl implements HotelDao {

	HashMap<Integer, HotelDto> map = new HashMap<Integer, HotelDto>();

	@Override
	public boolean save(Integer id, HotelDto dto) {
		map.put(id, dto);
		System.out.println("saved");
		return false;
	}

	public HashMap<Integer, HotelDto> read() {
		System.out.println("read");

		return map;

	}

	@Override
	public HotelDto find(Integer id) {

		return map.get(id);
	}

	@Override
	public HotelDto update(Integer id, String name) {
		HotelDto dto =map.get(id);
		dto.setHotelName(name);
		return dto;
	}

	@Override
	public HotelDto delect(Integer id) {
		HotelDto dto = map.remove(id);
		return dto;
	}

}
