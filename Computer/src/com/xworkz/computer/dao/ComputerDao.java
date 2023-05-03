package com.xworkz.computer.dao;

import com.xworkz.computer.dto.ComputerDto;

public class ComputerDao {

	ComputerDto[] dto1 = new ComputerDto[5];

	public ComputerDto[] save(ComputerDto dto) {
		if (dto != null) {
			for (int i = 0; i < dto1.length; i++) {
				if (dto1[i] == null) {
					dto1[i] = dto;
					System.out.println("if the dto1 value is null , add the values");
					return dto1;

				}

			}
			System.out.println("run the loop ");

		}
		System.out.println("if the dto value is not  null ,check the value");
		return dto1;

	}

	public ComputerDto[] readAll() {
		return dto1;
	}

	public boolean findByBrand(String findBrand) {
		if (findBrand != null) {
			for (int i = 0; i < dto1.length; i++) {
				if (dto1[i].getBrand().equals(findBrand)) {

					System.out.println("brand found");
					return true;

				}
				System.out.println("brand not found");
				return false;

			}
			System.out.println("not run the loop and check the condition");
			return false;
		}
		return false;
	}

	public boolean findByModel(String findModel) {
		for (int i = 0; i < dto1.length; i++) {
			if (dto1[i].getModel().equals(findModel)) {

				System.out.println("Model found");
				return true;

			}
			System.out.println("Model not found");
			return false;

		}
		System.out.println("not run the loop and check the condition");
		return false;

	}

	public boolean updateModelByBrand(String brand, String model) {
		if (brand != null) {
			for (int i = 0; i < dto1.length; i++) {
				if (dto1[i] != null) {
					if (dto1[i].getBrand().equals(brand)) {
						dto1[i].setModel(model);
						System.out.println("check the brand and update");
						return true;

					}
					System.out.println("not update");
					return true;

				}
				System.out.println("not run the loop and check the condition");
				return false;
			}

		}
		System.out.println("dto1 value id null ,exe this");
		return false;
	}

	public boolean deleteByColour(String deleteColour) {
		for (int i = 0; i < dto1.length; i++) {
			if (dto1[i].getColour().equals(deleteColour)) {
				dto1[i] = null;
				System.out.println("delete by colour");
				return true;

			}
		}
		System.out.println("not run the loop and check the condition");
		return false;

	}

}
