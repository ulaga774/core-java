package com.xworkz.books.dao;

import com.xworkz.books.dto.BookDto;

public class BookDaoTwo extends AbstractDao {

	BookDto[] dto_array = new BookDto[5];

	public boolean save_data(BookDto dto) {
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

	@Override
	public BookDto[] readAll() {
		for (int i = 0; i < dto_array.length; i++) {
			if (dto_array[i] != null) {
				System.out.println(dto_array[i]);
			}
		}
		return dto_array;

	}

	@Override
	public boolean find(String findName) {
		for (int i = 0; i < dto_array.length; i++) {
			if (dto_array[i].getAuther().equals(findName)) {
				System.out.println("value found");
				return true;
			}
		}
		return false;

	}

	@Override
	public boolean update(String oldName, String newName) {
		for (int j = 0; j < dto_array.length; j++) {
			if (dto_array[j] != null) {
				if (dto_array[j].getAuther().equals(oldName)) {
					dto_array[j].setAuther(newName);
					System.out.println("update the new Authername");
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
			dto_array[y].setColour(delete);
			return true;
		}
		return false;
	}

	@Override
	public boolean srech(String delete) {
		
		return false;
	}
	

}
