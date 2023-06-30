package com.xworkz.avatarmovie.service;

import com.xworkz.avatarmovie.dto.AvatarDto;

public interface AvatarSeivice {
	
	public boolean validateAndSave(AvatarDto dto);
	
	public boolean read();
	
	public boolean update(AvatarDto dto);

}
