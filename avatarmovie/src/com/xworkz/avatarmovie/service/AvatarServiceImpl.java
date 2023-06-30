package com.xworkz.avatarmovie.service;

import com.xworkz.avatarmovie.dto.AvatarDto;
import com.xworkz.avatarmovie.repository.AvatarRepository;
import com.xworkz.avatarmovie.repository.AvatarRepositoryImpl;

public class AvatarServiceImpl implements AvatarSeivice {

	AvatarRepository movie = new AvatarRepositoryImpl();

	@Override
	public boolean validateAndSave(AvatarDto dto) {
		System.out.println("validate susscefully");
		boolean save = movie.save(dto);
		System.out.println(save);
		return false;
	}

	@Override
	public boolean read() {
		boolean read = movie.read();
		System.out.println(read);
		return true;
	}

	@Override
	public boolean update(AvatarDto dto) {
		System.out.println("update susscefully");
		boolean update = movie.update(dto);
		System.out.println(update);


		return false;
	}

}
