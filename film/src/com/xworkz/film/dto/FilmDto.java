package com.xworkz.film.dto;

public class FilmDto {
	
	private String type;
	private String film_name;
	private float imdb_rating;
	private int budget;
	private long boxOfice;
	
	public FilmDto(String type, String film_name, float imdb_rating, int budget, long boxOfice) {
		super();
		this.type = type;
		this.film_name = film_name;
		this.imdb_rating = imdb_rating;
		this.budget = budget;
		this.boxOfice = boxOfice;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFilm_name() {
		return film_name;
	}

	public void setFilm_name(String film_name) {
		this.film_name = film_name;
	}

	public float getImdb_rating() {
		return imdb_rating;
	}

	public void setImdb_rating(float imdb_rating) {
		this.imdb_rating = imdb_rating;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public long getBoxOfice() {
		return boxOfice;
	}

	public void setBoxOfice(long boxOfice) {
		this.boxOfice = boxOfice;
	}

	@Override
	public String toString() {
		return "FilmDto [type=" + type + ", film_name=" + film_name + ", imdb_rating=" + imdb_rating + ", budget="
				+ budget + ", boxOfice=" + boxOfice + "]";
	}
	
	
	
	
	

}
