package com.xworkz.watch.dao;

import java.util.LinkedList;

import com.xworkz.watch.dto.WatchDto;

public interface WatchDao {
	
	public boolean save(WatchDto dto);
	public LinkedList<WatchDto> read();
	public WatchDto find(String findBrand);
	public WatchDto update(String brand, String colour, String updateType);
	public LinkedList<WatchDto> delete(String delete);

}
