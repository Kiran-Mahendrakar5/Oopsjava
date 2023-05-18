package com.xworkz.books.dto;

public class BooksDto {
	private String name;
	private String color;
	private String type;
	private String brand;
	private int page;
	
	
	public BooksDto() {
		System.out.println("defoult constructor");
	}


	public BooksDto(String name, String color, String type, String brand, int page) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.brand = brand;
		this.page = page;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getPage() {
		return page;
	}


	public void setPage(int page) {
		this.page = page;
	}


	@Override
	public String toString() {
		return "BooksDto [name=" + name + ", color=" + color + ", type=" + type + ", brand=" + brand + ", page=" + page
				+ "]";
	}
	
	

}
