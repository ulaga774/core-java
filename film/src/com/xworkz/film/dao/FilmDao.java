package com.xworkz.film.dao;

import com.xworkz.film.constant.DtoIsNull;
import com.xworkz.film.constant.NullExceptions;
import com.xworkz.film.dto.FilmDto;

public class FilmDao extends Exception {

	FilmDto[] film_Info = new FilmDto[5];

	public boolean save_data(FilmDto dto) throws DtoIsNull {

		if (dto != null) {
			if (dto.getFilm_name() != null) {
				for (int i = 0; i < film_Info.length; i++) {
					if (film_Info[i] == null) {
						film_Info[i] = dto;
						System.out.println("if the the value is null , save the data");
						return true;
					}
				}
			}
		}
		throw new DtoIsNull("check the save data method ");

	}

	public FilmDto[] read_all() {
		return film_Info;

	}

	public boolean findByName(String found_name) throws NullExceptions {
		if (found_name != null) {
			for (int i = 0; i < film_Info.length; i++) {
				if (film_Info[i] != null) {
					if (film_Info[i].equals(found_name)) {

					}
				}

			}

		}
		throw new NullExceptions("check the findByName ,there is a null pointer exception ");

	}

	@Override
	public boolean findByName(String key_name, String found_name) {
		if (found_name != null) {
			for (int i = 0; i < film_Info.length; i++) {
				if (film_Info[i] != null) {
					if (film_Info[i].getType().equals(key_name)) {
						if (film_Info[i].getFilm_name().equals(found_name)) {
							System.out.println("name found");
							return true;

						}

					}
				}

			}

		}

		return false;
	}

	public FilmDto[] updateByName(String oldName, String newName) {
		if (oldName != null) {
			for (int i = 0; i < film_Info.length; i++) {
				if (film_Info[i] != null) {
					if (film_Info[i].getType().equals(oldName)) {
						film_Info[i].setFilm_name(newName);
						return film_Info;

					}

				}
			}
		}
		return film_Info;

	}

}
