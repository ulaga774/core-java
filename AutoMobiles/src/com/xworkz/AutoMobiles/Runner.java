package com.xworkz.AutoMobiles;

import com.xworkz.AutoMobiles.Dao.AutoMobilesDao;

public interface Runner {
	public static void main(String[] args) {
		AutoMobilesDao auto = new AutoMobilesDao();
		auto.addBikeNames("hero");
		auto.addBikeNames("honda");
		auto.addBikeNames("tvs");
		auto.addBikeNames("ninja");
		auto.addBikeNames("ktm");
		
		auto.updateByIndex("duke", 4);
		auto.updateByName("tvs", "TVS");
		auto.deleteByIndex(0);
		auto.deleteByName("honda");
		boolean result1 =auto.searchMethod("ninja");
		System.out.println(result1);
		
		String[] result = auto.read();
		for(int j = 0;j<result.length;j++) {
			System.out.println(result[j]);
		}
	}

}
