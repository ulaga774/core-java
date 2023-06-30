package com.xworkz.dhaba;

import com.xworkz.dhaba.constant.Type;
import com.xworkz.dhaba.dao.DhabaDao;
import com.xworkz.dhaba.dto.DhabaDto;
import com.xworkz.dhaba.dto.FoodlistDto;

public class DhabaRunner {
	public static void main(String[] args) {
		
	
	FoodlistDto food = new FoodlistDto("briyani",500,"good",120);
	
	
	DhabaDto dto = new DhabaDto("chapathi","BTM",5,Type.nonveg,food);
	DhabaDto dto1 = new DhabaDto("dosa","bansankari",5,Type.veg,food);
	DhabaDao dao = new DhabaDao();
	
	dao.save(dto1);
	dao.save(dto);
	
	
	DhabaDto[] dab = dao.readDhaba();
	for(int i=0;i<dab.length;i++) {
		if(dab[i]!=null) {
			System.out.println(dab[i]);
		}
	}
	
	dao.updateratingByname(10, "chapathi");
	
	DhabaDto[] dob = dao.readDhaba();
	for(int i=0;i<dob.length;i++) {
		if(dob[i]!=null) {
			System.out.println(dob[i]);
		}
	}
	
	dao.deleteByName("chapathi");
	DhabaDto[] daob = dao.readDhaba();
	for(int i=0;i<daob.length;i++) {
		if(daob[i]!=null) {
			System.out.println(daob[i]);
		}
	}
	
	dao.searchBylocation("BTM");
	DhabaDto[] diab = dao.readDhaba();
	for(int i=0;i<diab.length;i++) {
		if(diab[i]!=null) {
			System.out.println(diab[i]);
		}
	}
	
	
	
}
}