package com.xworkz.Family.Data;

public class FamilyData {
	public int noOfFamilyMumber;
	public String fatherName;
	public String brotherName;
	public int noOfChildren;
	public String familyCharacter;
	
	public FamilyData(int noOfFamilyMumber,String fatherName,String brotherName,int noOfChildren,String familyCharacter) {
		
		this.noOfFamilyMumber=noOfFamilyMumber;
		this.fatherName=fatherName;
		this.brotherName=brotherName;
		this.noOfChildren=noOfChildren;
		this.familyCharacter=familyCharacter;
		
	}
	public String IdiotFamily() {
		return"ulaga";
	}
	
	public String toString() {
		return"noOfFamilyMumber /" + noOfFamilyMumber +"   :fatherName /" + fatherName +"  :brotherName /"
					+brotherName+"  :noOfChildren/"+noOfChildren+"   :familyCharacter/"+familyCharacter;
	}
	
	public boolean equals(FamilyData data1) {
		if(this.fatherName.equals(fatherName) && this.brotherName.equals(brotherName) && this.noOfChildren==data1.noOfChildren) {
			return true;
		}
		
		
		else{
			return false;
		}
		
		
	}
}
