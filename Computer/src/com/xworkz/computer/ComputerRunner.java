package com.xworkz.computer;

import com.xworkz.computer.dao.ComputerDao;
import com.xworkz.computer.dto.ChargerType;
import com.xworkz.computer.dto.ComputerDto;

public class ComputerRunner {

	public static void main(String[] args) {
		ComputerDto dto = new ComputerDto("dell", "7490", "black", 23000, ChargerType.CTYPE);
		ComputerDao dao = new ComputerDao();

		// System.out.println(ChargerType.name);

		dao.save(dto);
		System.out.println("-------------------find by brand-------------");
		boolean brand = dao.findByBrand("dell");
		System.out.println(brand);

		ComputerDto[] ref1 = dao.readAll();
		for (int i = 0; i < ref1.length; i++) {
			System.out.println(ref1[i]);
		}

		System.out.println("-------------------find by model-------------");
		boolean model = dao.findByModel("7490");
		System.out.println(model);

		ComputerDto[] ref2 = dao.readAll();
		for (int j = 0; j < ref2.length; j++) {
			System.out.println(ref2[j]);
		}
		
		System.out.println("-------------------update -------------");
		boolean update = dao.updateModelByBrand("dell", "laditude");
		System.out.println(update);

		ComputerDto[] ref3 = dao.readAll();
		for (int q = 0; q < ref2.length; q++) {
		System.out.println(ref2[q]);
		
		}
		System.out.println("-------------------delete -------------");
		boolean delete = dao.deleteByColour("black");
		System.out.println(delete);

		ComputerDto[] colou = dao.readAll();
		for (int e = 0; e < colou.length; e++) {
		System.out.println(colou[e]);
	}
		
			
		System.out.println("------------------------------------");

		ComputerDto[] ref = dao.readAll();
		for (int d = 0; d < ref.length; d++) {
			System.out.println(ref[d]);

		}

	}

}
