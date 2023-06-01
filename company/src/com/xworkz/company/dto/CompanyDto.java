package com.xworkz.company.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString


public class CompanyDto {
	
	private String companyName;
	private String companyType;
	private String companyOwner;
	private int noOfWorks;
	private long contactNumber;
	

}
