package com.xworkz.game.dao;

import com.xworkz.game.constant.DtoIsNullException;
import com.xworkz.game.constant.Found_NameNullException;
import com.xworkz.game.constant.NameNotFoundException;
import com.xworkz.game.constant.NewNameIsEqualToOldNameException;
import com.xworkz.game.dto.GameDto;

public class GameDaoImpl implements GameDao {

	GameDto[] dto_info = new GameDto[3];

	public boolean save_data(GameDto dto) throws DtoIsNullException {
		if (dto != null) {
			if (dto.getGame_Name() != null) {
				if (dto.getGame_Name().length() <= 10) {
					for (int i = 0; i < dto_info.length; i++) {
						if (dto_info[i] == null) {
							dto_info[i] = dto;
							System.out.println("data saved");
							return true;
						}

					}
					System.out.println("no space in the array");
				}
				System.out.println("get name is lessthan 10 char");
			}
			System.out.println("the get name is null");
			return false;

		}
		throw new DtoIsNullException("the dto is null , check the save method");
	}

	public GameDto[] read() {

		return dto_info;
	}

	public boolean find(String found_name) throws Found_NameNullException {
		if (found_name != null) {
			for (int i = 0; i < dto_info.length; i++) {
				if (dto_info[i] != null) {
					if (dto_info[i].getGame_Name() != null) {
						if (dto_info[i].getGame_Name().equals(found_name)) {
							System.out.println("name found");
							return true;

						}
						System.out.println("found _name and get_name is not equal");
					}
					System.out.println("gat name is null");

				}
				System.out.println("dto_info is null");
			}
			System.out.println("no space in array");
		}
		throw new Found_NameNullException("the finded is null ,check the find method");

	}

	public boolean update(String oldName, String newName) throws NewNameIsEqualToOldNameException {
		if (oldName != null) {
			if (newName != oldName) {
				for (int i = 0; i < dto_info.length; i++) {
					if (dto_info[i] != null) {
						if (dto_info[i].getGame_Name().equals(oldName)) {
							dto_info[i].setGame_Type(newName);
							System.out.println("name updated");
							return true;
						}

					}
				}
			}
			throw new NewNameIsEqualToOldNameException("check the update method,the updated is equal");
		}
		System.out.println("oldName is null");
		return false;

	}

	public boolean delete(String delete_type) throws NameNotFoundException {
		if (delete_type != null) {
			for (int i = 0; i < dto_info.length; i++) {
				if (dto_info[i] != null) {
					if (dto_info[i].getGame_Type().equals(delete_type)) {
						dto_info[i] = null;
						System.out.println("deleted");
						return true;
					}
				}

			}
			throw new NameNotFoundException("the delete name is not found"  );
		}
		System.out.println("delete_type is null");
		return false;

	}
	public boolean delete2(String name,String type ,Long downloads) {
		for (int i = 0; i < dto_info.length; i++) {
			if(dto_info[i] != null) {
				if(dto_info[i].getGame_Name().equals(name)) {
					if(dto_info[i].getGame_Type().equals(type)) {
						dto_info[i].setNoOfDownloads(downloads);
						System.out.println("name updated");
						return true;
					}
				}
			}
		}
		return false;
		
	}
	public GameDto find2(String found_name ,String found_type,Long found_downloads) {
		for (int i = 0; i < dto_info.length; i++) {
			if(dto_info[i] != null) {
				if(dto_info[i].getGame_Name().equals(found_name)) {
					if(dto_info[i].getGame_Type().equals(found_type)) {
						if(dto_info[i].getNoOfDownloads().equals(found_downloads)) {
							System.out.println("found the name ....in find2");
							return dto_info[i];
						}
					}
				}
			}
		}
		return null;
		
	}

}
