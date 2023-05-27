package com.xworkz.engine;

import com.xworkz.engine.constant.nameNotUpdateException;
import com.xworkz.engine.constatnt.NoSpaceInArrayException;
import com.xworkz.engine.dao.EngineDaoImpl;
import com.xworkz.engine.dao.constant.DtoNullException;
import com.xworkz.engine.dto.EngineDto;

public class Engine_runner {

	public static void main(String[] args) {
		EngineDto dto = new EngineDto("caterPiller", "disel_2001", "four_strock",987654321L , 5000);
		EngineDto dto1 = new EngineDto("tesla_engine", "electric_2010", "electric_four_strock",321L , 55000);
		EngineDaoImpl dao = new EngineDaoImpl();
		
		try {
			dao.save_data(dto);
			dao.save_data(dto1);
		} catch (DtoNullException e) {
			
			e.printStackTrace();
		}
		
		
		EngineDto[] read_result = dao.read_all();
		for (int i = 0; i < read_result.length; i++) {
			if(read_result[i] != null) {
				System.out.println(read_result[i]);	
			}
			
		}
		System.out.println("--------delete------");
		try {
			dao.delete("electric_four_strock");
			EngineDto[] delete_result = dao.read_all();
			for (int i = 0; i < read_result.length; i++) {
				if(read_result[i] != null) {
					System.out.println(read_result[i]);	
				}
				
			}
		} catch (NoSpaceInArrayException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		System.out.println("--------------update-----------");
		try {
			dao.update("caterPiller", "agri_caterPiller");
			EngineDto[] update_result = dao.read_all();
			for (int i = 0; i < read_result.length; i++) {
				if(read_result[i] != null) {
					System.out.println(read_result[i]);	
				}
				
			}
		} catch (nameNotUpdateException e) {
			
			e.printStackTrace();
		}
		
		
		

	}

}
