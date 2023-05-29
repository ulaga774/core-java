package com.xworkz.game.dao;

import com.xworkz.game.constant.DtoIsNullException;
import com.xworkz.game.constant.Found_NameNullException;
import com.xworkz.game.constant.NameNotFoundException;
import com.xworkz.game.constant.NewNameIsEqualToOldNameException;
import com.xworkz.game.dto.GameDto;

public interface GameDao {
	public boolean save_data(GameDto dto) throws DtoIsNullException;
	public GameDto[] read();
	public boolean find(String found_name) throws Found_NameNullException;
	public boolean update(String oldName , String newName) throws NewNameIsEqualToOldNameException;
	public boolean delete(String delete_type) throws NameNotFoundException;

}
