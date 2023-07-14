package com.xworkz.tablet.dto;

public class TabletDto {
	private String name;
	private String dosage;
	private String ManufacturingDate;
	private String type;
	private String CompanyName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
	public String getManufacturingDate() {
		return ManufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	@Override
	public String toString() {
		return "TabletDto [name=" + name + ", dosage=" + dosage + ", ManufacturingDate=" + ManufacturingDate + ", type="
				+ type + ", CompanyName=" + CompanyName + "]";
	}

	
	
}
