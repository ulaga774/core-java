package com.xworkz.AutoMobiles.Dao;

public class AutoMobilesDao {

	String[] bike = new String[5];

	public String[] addBikeNames(String bikeNames) {
		for (int i = 0; i< bike.length; i++) {
			if (bike[i] == null) {
				bike[i] = bikeNames;
				System.out.println("if the bike value is null add add values");
				return bike;
			}
		}
		System.out.println("if the bike value is not null add add values");
		return bike;
	}

	public String[] read() {
		return bike;

	}

	public boolean updateByIndex(String newBikeName, int index) {
		if (bike != null) {
			bike[index] = newBikeName;
			System.out.println("update it succesfully");
			return true;
		}
		return false;
	}

	public boolean updateByName(String oldName, String newName) {
		for (int d = 0; d < bike.length; d++) {
			if (oldName.equals(bike[d])) {
				bike[d] = newName;
				return true;

			}
		}
		return false;
	}

	public boolean deleteByIndex(int index) {
		if (bike != null) {
			bike[index] = null;
			System.out.println("remove the value");
			return true;
		}
		System.out.println("if value is null do this");
		return false;

	}

	public boolean deleteByName(String bikeName) {
		for (int i = 0; i < bike.length; i++) {
			if (bikeName.equals(bike[i])) {
				bike[i] = null;
				return true;

			}
		}
		return false;
	}

	public boolean searchMethod(String bikename1) {
		for (int i = 0; i < bike.length; i++) {
			if (bikename1.equals(bike[i])) {
				bike[i] = bikename1;
				System.out.println("value was found");
				return true;

			}
		}
		System.out.println("value was not found");
		return false;

	}

}
