package com.xworkz.hotel;

import java.util.HashMap;

import com.xworkz.hotel.constant.hotelType;
import com.xworkz.hotel.dto.HotelDto;
import com.xworkz.hotel.servies.HotelServies;
import com.xworkz.hotel.servies.HotelServiesImpl;

public class HotelRunner {

	public static void main(String[] args) {
		HotelDto dto = new HotelDto("RitzCarlton", hotelType.AC, "tamilNadu", 2000000000L, 15);
		HotelDto dto1 = new HotelDto("Marriott", hotelType.NON_AC, "kerala", 3000000000L, 45);
		HotelDto dto2 = new HotelDto("Hyatt", hotelType.AC, "karnataka", 4000000000L, 25);

		HotelServies service = new HotelServiesImpl();
		service.save(1, dto);
		service.save(2, dto1);
		service.save(3, dto2);
		
		
		HashMap<Integer, HotelDto> readresult = service.read();
		System.out.println(readresult);
		System.out.println("-------------find--------");
		HotelDto find = service.find(1);
		System.out.println(find);
		System.out.println("-------------update--------");
		HotelDto update = service.update(2, "ulaga");
		System.out.println(update);
		System.out.println("-----------delete-----");
		HotelDto delete = service.delect(3);
		System.out.println(delete);
		

	}

}
