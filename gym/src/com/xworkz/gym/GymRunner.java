package com.xworkz.gym;

import com.xworkz.gym.dao.GymDao;
import com.xworkz.gym.dto.GymDto;

public class GymRunner {

	public static void main(String[] args) {
		GymDao dao = new GymDao();
		GymDto dto = new GymDto("tamil", 24, "good", "tamilNadu", 12345, "motta");
		GymDto dto1 = new GymDto("tamil", 20, "nice", "chennai", 56, "ajith");
		
		dao.save_info(dto);
		dao.save_info(dto1);
		
		
		GymDto[] result = dao.readAll();
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		System.out.println("-----------------------------------------------");
	GymDto[] result1 =dao.find("tamil", 56);
	//for(int f = 0;f<result1.length;f++) {
		System.out.println(result1);
	//}
		
		GymDto[] result0 = dao.readAll();
		for(int j = 0;j<result0.length;j++) {
			System.out.println(result0[j]);
		}
		
		
		
	

	}

}
