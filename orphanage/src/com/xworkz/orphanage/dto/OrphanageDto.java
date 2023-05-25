package com.xworkz.orphanage.dto;

public class OrphanageDto {
	
	private String orphanageName;
	private int noOfChild;
	private String orphanageMembers;
	private String orphanageType;
	private long phone_number;
	
	public OrphanageDto(String orphanageName, int noOfChild, String orphanageMembers, String orphanageType,
			long phone_number) {
		super();
		this.orphanageName = orphanageName;
		this.noOfChild = noOfChild;
		this.orphanageMembers = orphanageMembers;
		this.orphanageType = orphanageType;
		this.phone_number = phone_number;
	}

	public String getOrphanageName() {
		return orphanageName;
	}

	public void setOrphanageName(String orphanageName) {
		this.orphanageName = orphanageName;
	}

	public int getNoOfChild() {
		return noOfChild;
	}

	public void setNoOfChild(int noOfChild) {
		this.noOfChild = noOfChild;
	}

	public String getOrphanageMembers() {
		return orphanageMembers;
	}

	public void setOrphanageMembers(String orphanageMembers) {
		this.orphanageMembers = orphanageMembers;
	}

	public String getOrphanageType() {
		return orphanageType;
	}

	public void setOrphanageType(String orphanageType) {
		this.orphanageType = orphanageType;
	}

	public long getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "OrphanageDto [orphanageName=" + orphanageName + ", noOfChild=" + noOfChild + ", orphanageMembers="
				+ orphanageMembers + ", orphanageType=" + orphanageType + ", phone_number=" + phone_number + "]";
	}
	
	
	
	

}
