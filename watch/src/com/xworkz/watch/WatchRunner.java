package com.xworkz.watch;

import java.util.LinkedList;

import com.xworkz.watch.dao.WhatchDaoImpl;
import com.xworkz.watch.dto.WatchDto;

class WatchRunner {

	public static void main(String[] args) {
		WatchDto dto = new WatchDto("titan", "smartWatch", "black", 350, "round");
		WatchDto dto1 = new WatchDto("sony", "smartWatch", "black", 350, "round");
		WatchDto dto2 = new WatchDto("sonata", "smartWatch", "black", 350, "round");
		WatchDto dto3 = new WatchDto("rolax", "smartWatch", "black", 350, "round");

		WhatchDaoImpl dao = new WhatchDaoImpl();

		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		dao.save(dto3);

		LinkedList<WatchDto> readResult = dao.read();
		for (WatchDto ReadDto : readResult) {
			System.out.println(ReadDto);

		}
		System.out.println("--------------find----------");
		WatchDto findResult = dao.find("rolax");
		System.out.println(findResult);

		System.out.println("--------------update----------");
		WatchDto updateResult = dao.update("rolax", "black", "digital");
		System.out.println(updateResult);

		System.out.println("-------------delete---------");
		LinkedList<WatchDto> deleteResult = dao.delete("sonata");
		for (WatchDto Dto : deleteResult) {
			System.out.println(Dto);
		}

	}

}
