package com.xworkz.gym.dao;

import com.xworkz.gym.dto.GymDto;

public class GymDao {
	
	GymDto[] gym_info = new GymDto[5];
	
	public boolean save_info(GymDto dto_info) {
		for(int i = 0;i<gym_info.length;i++) {
			if(gym_info[i] ==null) {
				gym_info[i] =dto_info;
				System.out.println("if the gym_info value is null add the value");
				return true;
				
			}
		}
		return false;
	}
	public GymDto[] readAll() {
		return gym_info;
	}
	
	public GymDto[] find(String name , int number) {
		for(int i = 0;i<gym_info.length;i++) {
			
			System.out.println("found");
			return gym_info;
		}
		return gym_info;
		
	}
	

}
