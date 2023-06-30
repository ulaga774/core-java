package com.xworkz.facebook;

import java.sql.Date;

import com.xworkz.facebook.dto.FaceBookDto;
import com.xworkz.facebook.service.FacebookService;
import com.xworkz.facebook.service.FacebookServiceImpl;

public class FaceBookRunner {
	public static void main(String[] args) throws Exception {

		FaceBookDto dto = new FaceBookDto(5, "varun", "kumar", new Date(2001, 2, 2), "varun@gmail.com", 652345678432L, "male",
				"varun007tamil");

		FacebookService service = new FacebookServiceImpl();
		System.out.println("---------save-------");
		 service.validateAndsave(dto);
		System.out.println("-------update--------------");

		System.out.println("------read all----");
		service.read(dto);
		System.out.println("--------updatebyemail-----");
		service.updateBYEmail("ulaga@gmail.com", "hotstar");
		
		System.out.println("--------read by email------");
		service.readBYEmail("varun@gmail.com");
		
		System.out.println("--------updateBYId-----");
		service.updateBYId(2, "varma");
		
		System.out.println("----------deleteByID---------");
		service.deleteById(2);
		
		System.out.println("---------update-------------");
		service.update("kiran", "kumar",  new Date(2001, 2, 2), "kiran@gmail.com", 1234L, "male", "kiran007tamil");
		

	}
}
