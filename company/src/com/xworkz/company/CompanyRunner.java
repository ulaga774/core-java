package com.xworkz.company;

import java.util.LinkedList;

import com.xworkz.company.dao.CompanyDaoImpl;
import com.xworkz.company.dto.CompanyDto;

public class CompanyRunner {

	public static void main(String[] args) {

		CompanyDto dto = new CompanyDto("kd", "production", "ulaga", 12345621, 9360389212L);

		CompanyDaoImpl dao = new CompanyDaoImpl();

		dao.save(dto);

		LinkedList<CompanyDto> read_result = dao.read();
		for (CompanyDto Dtos : read_result) {
			System.out.println(read_result);
		}
		System.out.println("-------update---");

		dao.update("kd", "production", "mass");
		LinkedList<CompanyDto> update_result = dao.read();
		for (CompanyDto Dtos : update_result) {
			System.out.println(update_result);
		}
		System.out.println("------find----");
		boolean find_result = dao.find("kd", "production", "mass");
		System.out.println(find_result);
		LinkedList<CompanyDto> find_result1 = dao.read();
		for (CompanyDto Dtos : find_result1) {
			System.out.println(find_result1);
		}
		
		System.out.println("-------delete------");

		dao.delete();

	}

}
