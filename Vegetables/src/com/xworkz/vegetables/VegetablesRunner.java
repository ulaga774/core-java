package com.xworkz.vegetables;

import com.xworkz.vegetables.constants.VegetablesType;
import com.xworkz.vegetables.dao.VegetablesDao;
import com.xworkz.vegetables.dto.VegetablesDto;
import com.xworkz.vegetables.dto.nutrientsDto;

public class VegetablesRunner {

	public static void main(String[] args) {
		
		nutrientsDto nutri_dto = new nutrientsDto("whey", 54);
		VegetablesDto vege_dto = new VegetablesDto("vit c", 10000, VegetablesType.SEEDLESS, "tomota", nutri_dto);
		VegetablesDao vege_dao = new VegetablesDao();
		vege_dao.save_data(vege_dto);
		
		
		
		System.out.println("--------------find by name-----------------");
		boolean find_result = vege_dao.findByName("whey");
		System.out.println(find_result);
		
		VegetablesDto[] result = vege_dao.readAll();
		for(int i =0;i<result.length;i++) {
		//	if(result[i] != null) {
			System.out.println(result[i]);
		//	}
		}
//			System.out.println("--------------delete by name-----------------");
//			boolean delete_result =	vege_dao.deleteByName("vit c");
//			System.out.println(delete_result);
//			
//			VegetablesDto[] result1 = vege_dao.readAll();
//			for(int j = 0;j<result1.length;j++) {
//				System.out.println(result1[j]);
//			}
			
			System.out.println("--------------update  by name-----------------");
			boolean update_result = vege_dao.updateNameByVitamins("vit c", "onion");
			System.out.println(update_result);
			
			VegetablesDto[] result2 = vege_dao.readAll();
			for(int u = 0 ;u<result2.length;u++) {
				System.out.println(result2[u]);
			}
			
		}
	

	}


