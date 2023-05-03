package com.xworkz.Movie.dao;

import com.xworkz.Movie.dto.MovieDto;

public class MovieDao {

	MovieDto[] movie_info = new MovieDto[10];

	public MovieDto[] addMovie_Info(MovieDto dto) {
		if (dto != null) {
			if (dto.getMovieName() != null) {
				for (int i = 0; i < movie_info.length; i++) {
					if (movie_info[i] == null) {
						movie_info[i] = dto;
						System.out.println("if the value is null , run the loop and add the value");
						return movie_info;
					}
					System.out.println("if the value is not null ,not update");
					return movie_info;

				}
				

			}
			System.out.println("if the movieName gives is null , exe this");
			return movie_info;
			

		}
		System.out.println("if the dto is null ,check");
		return movie_info;
	}
	
	public MovieDto[] read() {
		return movie_info;
	}

}
