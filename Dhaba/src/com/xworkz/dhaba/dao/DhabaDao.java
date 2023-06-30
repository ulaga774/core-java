package com.xworkz.dhaba.dao;

import java.util.Iterator;

import com.xworkz.dhaba.dto.DhabaDto;

public class DhabaDao {

	DhabaDto[] daba = new DhabaDto[10];

	public DhabaDto[] save(DhabaDto dto) {
		if (dto != null) {
			for (int i = 0; i < daba.length; i++) {
				if (daba[i] == null) {
					daba[i] = dto;
					System.out.println("saved");
					return daba;
				}
			}
		}
		return null;

	}

	public DhabaDto[] readDhaba() {
		return daba;
	}

	public DhabaDto[] updateratingByname(int upRate, String upName) {
		if (daba != null) {
			for (int i = 0; i < daba.length; i++) {
				if (daba[i].getName().equals(upName)) {
					daba[i].setRating(upRate);
					System.out.println("updated");
					return daba;
				}

			}
		}
		return null;
	}

	public boolean deleteByName(String delname) {
		for (int i = 0; i < daba.length; i++) {
 			daba[i] = null;
			System.out.println("deleted");
			return true;
		}
		return false;
	}

	public DhabaDto[] searchBylocation(String seaLocation) {
		for (int i = 0; i < daba.length; i++) {
			if (daba[i] != null) {
				if (daba[i].getLocation().equals(seaLocation)) {
					System.out.println("searched");
					return daba;

				}
			}

		}
		return null;
	}

}
