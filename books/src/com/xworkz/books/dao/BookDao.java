package com.xworkz.books.dao;

import com.xworkz.books.dto.BookDto;

public class BookDao extends AbstractDao {

	BookDto[] dto_array = new BookDto[5];

	public boolean save_data(BookDto dto) {
		if (dto != null) {
			if (dto.getBook_name() != null) {
				for (int i = 0; i < dto_array.length; i++) {
					if (dto_array[i] == null) {
						dto_array[i] = dto;
						System.out.println("add the value to array");
						return true;
					}
					System.out.println("check the loop,no sapce in perticular index");
				}
				System.out.println("the array is not have enough space ");
				return false;

			}
			System.out.println("getbook_name is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}
	public BookDto[] readAll() {
		return dto_array;
	}
	
	public boolean find(String findName) {
		for(int i =0;i<dto_array.length;i++) {
			if(dto_array[i]!=null) {
				if(dto_array[i].getBook_name().equals(findName)) {
					System.out.println("value found");
					return true;
				
			}
			
			}
		}
		return false;
	}
	@Override
	public boolean update(String oldName, String newName) {
		for(int j=0;j<dto_array.length;j++) {
			if(dto_array[j] !=null) {
				if(dto_array[j].getBook_name().equals(oldName)) {
					dto_array[j].setBook_name(newName);
					System.out.println("update the new name");
					return true;
						
					}
				}
			}
		System.out.println("check the update process");
		return false;
	}
	@Override
	public boolean delete(String delete) {
		for(int y = 0;y<dto_array.length;y++) {
		//	dto_array[y].setColour(null);
			dto_array[y] = null;
			return true;
		}
		
		return false;
	}
	
	
}
