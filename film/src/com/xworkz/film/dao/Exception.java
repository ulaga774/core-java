package com.xworkz.film.dao;

import com.xworkz.film.constant.DtoIsNull;
import com.xworkz.film.constant.NullExceptions;
import com.xworkz.film.dto.FilmDto;

public abstract class Exception {
	
	public abstract boolean save_data(FilmDto dto) throws DtoIsNull;
	public abstract FilmDto[] read_all();
	public abstract boolean findByName(String found_name) throws NullExceptions;
	public abstract boolean findByName(String key_name , String found_name);
	public abstract FilmDto[] updateByName(String oldName, String newName);
	

}
