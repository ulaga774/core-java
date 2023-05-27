package com.xworkz.engine.dao;

import com.xworkz.engine.constant.nameNotUpdateException;
import com.xworkz.engine.constatnt.NoSpaceInArrayException;
import com.xworkz.engine.dao.constant.DtoNullException;
import com.xworkz.engine.dto.EngineDto;

public class EngineDaoImpl implements EngineDao{

	EngineDto[] dto_info = new EngineDto[5];

	public boolean save_data(EngineDto dto) throws DtoNullException {
		if (dto != null) {
			if (dto.getEngine_name() != null) {
				for (int i = 0; i < dto_info.length; i++) {
					if (dto_info[i] == null) {
						dto_info[i] = dto;
						System.out.println("data saved");
						return true;
					}

				}
				System.out.println("Array have no space");
			}
			System.out.println("getEngine_name is null");
			return false;
		}
		throw new DtoNullException("the dto is null check the save method");

	}

	public EngineDto[] read_all() {
		return dto_info;

	}

	public boolean update(String oldName, String updateName) throws nameNotUpdateException {
		if (oldName != null) {
			if (oldName != updateName) {
				for (int i = 0; i < dto_info.length; i++) {
					if (dto_info[i] != null) {
						if (dto_info[i].getEngine_name().equals(oldName)) {
							dto_info[i].setEngine_name(updateName);
							System.out.println("name updated");
							return true;
						}

					}
					System.out.println("dto_info[i] is null");

				}
				System.out.println("array have no space");

			}
			throw new nameNotUpdateException("name not updated check the update method , check the update method");

		}
		System.out.println("the oldName is null");
		return false;

	}
	public boolean delete(String deleteIndex) throws NoSpaceInArrayException {
		for (int i = 0; i < dto_info.length; i++) {
			if(dto_info[i] != null) {
				if(dto_info[i].getEngine_type().equals(deleteIndex)) {
					dto_info[i] = null;
					System.out.println("deleted");
					return true; 
				}
				
			}
			System.out.println("dto_info is null");
		}
		throw new NoSpaceInArrayException("check the array size, check the delete method");
		
	}

}
