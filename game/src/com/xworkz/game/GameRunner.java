package com.xworkz.game;

import com.xworkz.game.constant.DtoIsNullException;
import com.xworkz.game.constant.Found_NameNullException;
import com.xworkz.game.constant.NameNotFoundException;
import com.xworkz.game.constant.NewNameIsEqualToOldNameException;
import com.xworkz.game.dao.GameDaoImpl;
import com.xworkz.game.dto.GameDto;

public class GameRunner {

	public static void main(String[] args) {
		
		GameDto dto = new GameDto(9876541L, "single", "multiPlayer", 's', 1.29f);
		GameDto dto1 = new GameDto(6541L, "taken", "singlePlayer", 'T', 0.59f);
		GameDto dto2 = new GameDto(13L, "pubg", "multiPlayer", 'p', 8.59f);
		GameDaoImpl dao = new GameDaoImpl();
		
		try {
			dao.save_data(dto);
			dao.save_data(dto1);
			dao.save_data(dto2);
		} catch (DtoIsNullException e) {
			
			e.printStackTrace();
		}
		GameDto[] read_result = dao.read();
		for (int i = 0; i < read_result.length; i++) {
			if(read_result[i] != null) {
				System.out.println(read_result[i]);
			}
		}
		System.out.println("-----------find-----------------");
		try {
			dao.find("single");
		} catch (Found_NameNullException e) {
			
			e.printStackTrace();
		}
		System.out.println("-----------update------------");
		try {
			dao.update("single", "groupFight");
			GameDto[] update_result = dao.read();
			for (int i = 0; i < update_result.length; i++) {
				if(update_result[i] != null) {
					System.out.println(update_result[i]);
				}
			}
		} catch (NewNameIsEqualToOldNameException e) {
		
			e.printStackTrace();
		}
		System.out.println("------------delete--------");
		try {
			dao.delete("singlePlayer");
			GameDto[] delete_result = dao.read();
			for (int i = 0; i < delete_result.length; i++) {
				if(delete_result[i] != null) {
					System.out.println(delete_result[i]);
				}
			}
		} catch (NameNotFoundException e) {
			
			e.printStackTrace();
		}
		System.out.println("-----------------update2----------------");
		dao.delete2("pubg", "multiPlayer", 1L);
		GameDto[] update1_result = dao.read();
		for (int i = 0; i < update1_result.length; i++) {
			if(update1_result[i] != null) {
				System.out.println(update1_result[i]);
			}
		}
		System.out.println("-------------find2---------");
		GameDto find = dao.find2("pubg", "multiPlayer", 1L);
		System.out.println(find);

	}

}
