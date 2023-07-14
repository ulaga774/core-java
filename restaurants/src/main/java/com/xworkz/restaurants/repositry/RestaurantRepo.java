package com.xworkz.restaurants.repositry;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.restaurants.dto.RestaurantDto;

public interface RestaurantRepo {
	public boolean save(RestaurantDto dto) throws  Exception;
	public ResultSet find(RestaurantDto dto,String Name) throws ClassNotFoundException, SQLException;

}
