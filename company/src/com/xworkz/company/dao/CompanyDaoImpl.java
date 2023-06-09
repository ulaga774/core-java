package com.xworkz.company.dao;

import java.util.LinkedList;

import com.xworkz.company.dto.CompanyDto;

public class CompanyDaoImpl implements CompanyDao {

	LinkedList<CompanyDto> list = new LinkedList<CompanyDto>();

	public boolean save(CompanyDto dto) {
		if (dto != null) {
			list.add(dto);
			System.out.println("data saved");
			return true;
		}
		System.out.println("dto is null ,  check the save method");
		return false;

	}

	public LinkedList<CompanyDto> read() {
		return list;
	}

	public boolean update(String name, String type, String owner) {

		for (CompanyDto Dtos : list) {
			if (list != null) {
				if (list.get(0).getCompanyName().equals(name)) {
					if (list.get(0).getCompanyType().equals(type)) {
						list.set(0, Dtos).setCompanyOwner(owner);
						
						System.out.println("name updated");
						return true;
					}
					
				}
		
			}
			

		}
		System.out.println("11");
		return false;

	}

	public boolean find(String name, String type, String owner) {
		if (name != null) {
			
			for (CompanyDto Dto : list) {
				if (list.get(0).getCompanyName().equals(name)) {
					if (list.get(0).getCompanyType().equals(type)) {
						if (list.get(0).getCompanyOwner().equals(owner)) {
							System.out.println("name found");
							return true;
						}
						System.out.println("5");

					}
					System.out.println("4");
				}
				System.out.println("3");

			}
			System.out.println("2");

		}
		System.out.println("1");
		return false;
	}

	public LinkedList<CompanyDto> delete() {

		list.remove(0);

		System.out.println("deleted");

		return list;

	}

}
