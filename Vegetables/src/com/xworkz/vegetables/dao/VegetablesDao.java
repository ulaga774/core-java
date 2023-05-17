package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesDao {

	VegetablesDto[] vege_Info = new VegetablesDto[5];

	public boolean save_data(VegetablesDto dto) {
		for (int i = 0; i < vege_Info.length; i++) {
			if (vege_Info[i] == null) {
				vege_Info[i] = dto;
				System.out.println("if the vege_Info value is null add add it ");
				return true;

			}
		}
		System.out.println("check the loop ");
		return false;

	}

	public VegetablesDto[] readAll() {
		return vege_Info;
	}

	public boolean findByName(String findName) {
		for (int i = 0; i < vege_Info.length; i++) {
			if (vege_Info[i] != null) {
				// if (vege_Info[i].equals(findName)) {
				System.out.println("check the value sucess ");
				return true;

				// }
			}
		}
		System.out.println("check the loop");
		return false;
	}

//	public boolean deleteByName(String deleteNmae) {
//		for(int i =0;i<vege_Info.length;i++) {
//			//if(vege_Info[i].equals(deleteNmae)) {
//				vege_Info[i].setVitamins(null);
//				System.out.println("if the value found .....change to null");
//				return true;
//			}
//		System.out.println("check the condition");
//		return false;
//		}
	public boolean updateNameByVitamins(String updateVita, String updateName) {
		for (int i = 0; i < vege_Info.length; i++) {
			if (vege_Info[i] != null) {

				// if(vege_Info[i].getName().equals(updateVita)) {
				vege_Info[i].setName(updateName);
				System.out.println("update successfully");
				return true;

			}
			System.out.println("vege_info is null .check it");
			return false;
			// }
		}
		System.out.println("check all coditions");
		return false;
	}
}
