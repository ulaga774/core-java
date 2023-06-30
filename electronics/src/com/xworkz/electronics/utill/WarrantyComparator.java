package com.xworkz.electronics.utill;

import java.util.Comparator;

import com.xworkz.electronics.dto.ElectronicsDto;

public class WarrantyComparator implements Comparator<ElectronicsDto> {

	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if (o1.getWarranty() < o2.getWarranty()) {

			return 1;
		}
		
		return -1;
	}

}