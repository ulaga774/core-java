package com.xworkz.engine.dao;

import com.xworkz.engine.constant.nameNotUpdateException;
import com.xworkz.engine.constatnt.NoSpaceInArrayException;
import com.xworkz.engine.dao.constant.DtoNullException;
import com.xworkz.engine.dto.EngineDto;

public interface EngineDao{
	public boolean save_data(EngineDto dto) throws DtoNullException;
	public EngineDto[] read_all();
	public boolean update(String oldName, String updateName) throws nameNotUpdateException;
	public boolean delete(String deleteIndex) throws NoSpaceInArrayException;

}
