package com.xworkz.books.dto;

public class BookDto {
	private String book_name;
	private int price;
	private String type;
	private String auther;
	private String colour;
	
	public BookDto() {
		System.out.println("default constructor");
	}

	public BookDto(String book_name, int price, String type, String auther, String colour) {
		
		this.book_name = book_name;
		this.price = price;
		this.type = type;
		this.auther = auther;
		this.colour = colour;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	
	public String toString() {
		return "BookDto [book_name=" + book_name + ", price=" + price + ", type=" + type + ", auther=" + auther
				+ ", colour=" + colour + "]";
	}
	
	

}
