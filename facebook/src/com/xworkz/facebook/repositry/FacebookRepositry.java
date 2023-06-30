package com.xworkz.facebook.repositry;

import java.sql.Date;

import com.xworkz.facebook.dto.FaceBookDto;

public interface FacebookRepositry {

	public boolean save(FaceBookDto dto) throws Exception;

	public boolean read(FaceBookDto dto) throws Exception;

	public boolean updateBYEmail(String email, String lastName) throws Exception;

	public boolean readBYEmail(String email) throws Exception;

	public boolean updateBYId(Integer id, String lastName) throws Exception;

	public boolean deleteById(Integer id) throws Exception;
	
	public boolean update(String fristName,String lastName,Date DOB,String email
			,Long phoneNumber,String gender,String password) throws Exception;

}
