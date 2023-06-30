package com.xworkz.avatarmovie.repository;

import com.xworkz.avatarmovie.dto.AvatarDto;

public interface AvatarRepository {
	
	public boolean save(AvatarDto dto);
	public boolean read();
	public boolean update(AvatarDto dto);

}
