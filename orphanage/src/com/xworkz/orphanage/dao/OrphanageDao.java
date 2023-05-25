package com.xworkz.orphanage.dao;



import com.xworkz.orphanage.constant.ArrayHaveNoSpaceException;
import com.xworkz.orphanage.constant.DtoIsNullException;
import com.xworkz.orphanage.constant.getOrphanageNameIsNotEqualToOldNameException;
import com.xworkz.orphanage.constant.getOrphanageTypeIsNull;
import com.xworkz.orphanage.constant.nameNotFoundException;
import com.xworkz.orphanage.dto.OrphanageDto;

public class OrphanageDao {

	OrphanageDto[] dto_list = new OrphanageDto[1];

	public boolean save_data(OrphanageDto dto) throws DtoIsNullException, ArrayHaveNoSpaceException {
		if (dto != null) {
			if (dto.getOrphanageName() != null) {
				for (int i = 0; i < dto_list.length; i++) {
					if (dto_list[i] == null) {
						dto_list[i] = dto;
						System.out.println("data saved");
						return true;
					}

				}
				throw new ArrayHaveNoSpaceException("check the save method , there is no sapce");

			}
			System.out.println("getOrphanageName is null");
			return false;
		}
		throw new DtoIsNullException("check the save method , dto is null");

	}

	public OrphanageDto[] read_all() {

		return dto_list;

	}

	public boolean findByName(String findName) throws nameNotFoundException {
		for (int i = 0; i < dto_list.length; i++) {
			if (dto_list[i] != null) {
				if (dto_list[i].getOrphanageName().equals(findName)) {
					System.out.println("name found");
					return true;

				}
				throw new nameNotFoundException("name not find , check the find method");

			}

		}
		return false;

	}

	public boolean updateByName(String oldName, String newName) throws getOrphanageNameIsNotEqualToOldNameException {
		if (oldName != null)
			;

		{
			for (int i = 0; i < dto_list.length; i++) {
				if (dto_list[i] != null) {
					if (dto_list[i].getOrphanageName().equals(oldName)) {
						dto_list[i].setOrphanageName(newName);
						System.out.println("name updated");
						return true;

					}
					throw new getOrphanageNameIsNotEqualToOldNameException("check the update method");

				}

			}

		}
		return false;
	}

	public boolean delete(String name) throws getOrphanageTypeIsNull {
		for (int i = 0; i < dto_list.length; i++) {
			if (dto_list[i] != null) {
				dto_list[i].setOrphanageType(name);
				if (dto_list[i].getOrphanageType() == null) {
					System.out.println("name is deleted");
					return true;
				}
				throw new getOrphanageTypeIsNull(" the the delete method");

			}

		}
		return false;
	}

}
