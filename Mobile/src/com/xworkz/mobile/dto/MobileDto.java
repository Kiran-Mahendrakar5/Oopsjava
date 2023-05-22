package com.xworkz.mobile.dto;

public class MobileDto {
	private String name;
	private String colour;
	private String type;
	private int price;
	
	
	public MobileDto(String name, String colour, String type, int price) {
		super();
		this.name = name;
		this.colour = colour;
		this.type = type;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "MobileDto [name=" + name + ", colour=" + colour + ", type=" + type + ", price=" + price + "]";
	}
	
	
	
	
	

}
 