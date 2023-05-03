package com.xworkz.Movie;

import com.xworkz.Movie.dao.MovieDao;
import com.xworkz.Movie.dto.MovieDto;

public class MovieCreater{

	public static void main(String[] args) {
		MovieDto dto = new MovieDto("vikram", "lokesh", 1000000L, "kamal", "vs", "crime", "ani");
		MovieDao dao = new MovieDao();
		MovieDto dto1 = new MovieDto("vikram", "lokesh", 1000000L, "kamal", "vs", "crime", "ani");
		MovieDto dto2 = new MovieDto(null, "lokesh", 1000000L, "kamal", "vs", "crime", "ani");
		
		
		
		
		
		dao.addMovie_Info(dto);
		System.out.println("-------------------test-------------------");
		dao.addMovie_Info(dto1);
		System.out.println("-------------------test-------------------");
		dao.addMovie_Info(dto2);
		System.out.println("-------------------............-------------------");
		
		
		
		
		dao.read();
		
		
		MovieDto[] result = dao.read();
		for(int i =0 ;i<result.length;i++) {
			if(result[i]!=null) {
				System.out.println("..................validation for remove null.............");
			System.out.println(result[i]);
		}
		
		}
	}

}
