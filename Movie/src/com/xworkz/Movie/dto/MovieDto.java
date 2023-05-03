package com.xworkz.Movie.dto;

public class MovieDto {
	
	private String movieName;
	private String directorName;
	private long budget;
	private String heroName;
	private  String villanName;
	private String movieType;
	private String musicDirector;
	
	public MovieDto() {
		System.out.println("default constructor");
	}
	
	
	public MovieDto(String movieName, String directorName, long budget, String heroName, String villanName,
			String movieType, String musicDirector) {
	
		this.movieName = movieName;
		this.directorName = directorName;
		this.budget = budget;
		this.heroName = heroName;
		this.villanName = villanName;
		this.movieType = movieType;
		this.musicDirector = musicDirector;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getDirectorName() {
		return directorName;
	}


	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}


	public long getBudget() {
		return budget;
	}


	public void setBudget(long budget) {
		this.budget = budget;
	}


	public String getHeroName() {
		return heroName;
	}


	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}


	public String getVillanName() {
		return villanName;
	}


	public void setVillanName(String villanName) {
		this.villanName = villanName;
	}


	public String getMovieType() {
		return movieType;
	}


	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}


	public String getMusicDirector() {
		return musicDirector;
	}


	public void setMusicDirector(String musicDirector) {
		this.musicDirector = musicDirector;
	}


	@Override
	public String toString() {
		return "MovieDto [movieName=" + movieName + ", directorName=" + directorName + ", budget=" + budget
				+ ", heroName=" + heroName + ", villanName=" + villanName + ", movieType=" + movieType
				+ ", musicDirector=" + musicDirector + "]";
	}

}
