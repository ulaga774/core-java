package com.xworkz.VikramMovie.Dto;

public class VikramMovieDto {
	private String hero = "kamal";
	private String director = "lockesh";
	private String villan = "vijaySethupathi";
	private long budget = 100000000L;
	private String MovieType = "action";
	
	public VikramMovieDto() {
		System.out.print("defalut construor");
		}
	
	
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getVillan() {
		return villan;
	}
	public void setVillan(String villan) {
		this.villan = villan;
	}
	public long getBudget() {
		return budget;
	}
	public void setBudget(long budget) {
		this.budget = budget;
	}
	public String getMovieType() {
		return MovieType;
	}
	public void setMovieType(String movieType) {
		MovieType = movieType;
	}
	
	
	

}
