package com.xworkz.pen.dto;

public class PenDto {
	private String name;
	private String brand;
	private int price;
	private String type;
	@Override
	public String toString() {
		return "PenDto [name=" + name + ", brand=" + brand + ", price=" + price + ", type=" + type + "]";
	}
	public PenDto(String name, String brand, int price, String type) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
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
	
	
	

}
