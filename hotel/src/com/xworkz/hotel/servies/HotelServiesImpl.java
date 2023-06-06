package com.xworkz.hotel.servies;

import java.util.HashMap;

import com.xworkz.hotel.dao.HotelDao;
import com.xworkz.hotel.dao.HotelDaoImpl;
import com.xworkz.hotel.dto.HotelDto;

public class HotelServiesImpl implements HotelServies {

	private HotelDao dao = new HotelDaoImpl();

	@Override
	public boolean save(Integer id, HotelDto dto) {
		if (dto != null) {
			if (dto.getHotelName() != null && dto.getHotelName().length() >= 5) {
				if (dto.getLocation() != null && dto.getLocation().length() >= 6) {
					if (dto.getContactNumber() != 0 && dto.getContactNumber() >= 1000000L) {
						if (dto.getNoOfRooms() != 0 && dto.getNoOfRooms() >= 10) {
							System.out.println("valid successfully");
							dao.save(id, dto);
							return true;

						}
						System.out.println("getNoOfRooms is 0");
						return false;

					}
					System.out.println("getContactNumber is 0");
					return false;
				}
				System.out.println("getLocation is null or give more than 6 char");
				return false;
			}
			System.out.println("getHotelName is null or valid the length");
			return false;

		}
		System.out.println("if dto is null");
		return false;
	}

	public HashMap<Integer, HotelDto> read() {
		System.out.println("read all------");
		return dao.read();

	}

	@Override
	public HotelDto find(Integer id) {
		if (id != 0) {
			System.out.println("valid successfully");
			return dao.find(id);
		}
		System.out.println("------if id is 0,check find ---------");
		return null;
	}

	@Override
	public HotelDto update(Integer id, String name) {
		if (id != 0) {
			if (name != null) {
				System.out.println("valid successfully");
				
				return dao.update(id, name);

			}
			System.out.println("name is null ");
			return null;
		}
		System.out.println("id is 0");
		return null;
	}

	@Override
	public HotelDto delect(Integer id) {
		if(id != null) {
			return dao.delect(id);
		}
		return null;
	}

}
