package com.xworkz.film;

import com.xworkz.film.constant.DtoIsNull;
import com.xworkz.film.constant.NullExceptions;
import com.xworkz.film.dao.FilmDao;
import com.xworkz.film.dto.FilmDto;

public class FilmRunner {

	public static void main(String[] args) {
		FilmDto dto = new FilmDto("history", "before1947_junkoFaruto", 8.9f, 1000, 177777l);
		FilmDao dao = new FilmDao();
		try {
			dao.save_data(dto);
		} catch (DtoIsNull e) {

			e.printStackTrace();
		}
		System.out.println("---------------------read_method---------------------");
		FilmDto[] read_result = dao.read_all();
		for (int i = 0; i < read_result.length; i++) {
			if (read_result[i] != null) {
				System.out.println(read_result[i]);

			}
		}
		System.out.println("-------------find method-----------------------");
		try {
			dao.findByName("history");
		} catch (NullExceptions e) {
//			System.out.println("-------------by methodOverloading----------------");
//			boolean find_result = dao.findByName("history", "before1947_junkoFaruto");
//			System.out.println(find_result);
			e.printStackTrace();
		}
		System.out.println("-------------findMethod by methodOverloading-------------");
		boolean find_result = dao.findByName("history", "before1947_junkoFaruto");
		System.out.println(find_result);
		System.out.println("------------update by name-----------------");
		dao.updateByName("history", "oruKadhalMayakum");
		FilmDto[] read_result1 = dao.read_all();
		for (int i = 0; i < read_result.length; i++) {
			if (read_result[i] != null) {
				System.out.println(read_result[i]);

			}
		}
	}
}
