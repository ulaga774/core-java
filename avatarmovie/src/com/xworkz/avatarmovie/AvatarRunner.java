package com.xworkz.avatarmovie;

import com.xworkz.avatarmovie.dto.AvatarDto;
import com.xworkz.avatarmovie.service.AvatarSeivice;
import com.xworkz.avatarmovie.service.AvatarServiceImpl;

public class AvatarRunner {

	public static void main(String[] args) {
		
		AvatarDto dto = new AvatarDto(5, "kiran", 23, "varma");
		
		AvatarSeivice service = new AvatarServiceImpl();
		
		service.validateAndSave(dto);
		
		System.out.println("----------read-----------------");
		service.read(); 
		
		System.out.println("----------update-------------");
		service.update(dto);

	}

}
