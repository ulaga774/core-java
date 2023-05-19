package com.xworkz.books.dao;

import com.xworkz.books.dto.BookDto;

public abstract class AbstractDao {
	
	
	public abstract BookDto[] readAll();
	public abstract boolean save_data(BookDto dto); 
	public abstract boolean find(String findName);
	public abstract boolean update(String oldName ,String newName);
	public abstract boolean delete(String delete);
	public abstract boolean srech(String delete);
	
	
	

}
