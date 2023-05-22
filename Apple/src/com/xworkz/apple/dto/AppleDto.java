package com.xworkz.apple.dto;

public class AppleDto {
	private String name;
	private String color;
	private String type;
	private int price;
		
	@Override
	public String toString() {
		return "AppleDto [name=" + name + ", color=" + color + ", type=" + type + ", price=" + price + "]";
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public AppleDto(String name, String color, String type, int price) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	
	

}
