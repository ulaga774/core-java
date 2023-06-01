package com.xworkz.company.dao;

import java.util.LinkedList;

import com.xworkz.company.dto.CompanyDto;

public interface CompanyDao {

	public boolean save(CompanyDto dto);
	public LinkedList<CompanyDto> read ();
	public boolean update(String name, String type, String owner);
	public boolean find(String name, String type, String owner);
	public LinkedList<CompanyDto> delete();

}
