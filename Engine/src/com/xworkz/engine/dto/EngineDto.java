package com.xworkz.engine.dto;

public class EngineDto {
	private String name;
	private String model;
	private String type;
	private int price;
	
	public EngineDto() {
		super();
	}
	@Override
	public String toString() {
		return "EngineDto [name=" + name + ", model=" + model + ", type=" + type + ", price=" + price + "]";
	}
	public EngineDto(String name, String model, String type, int price) {
		super();
		this.name = name;
		this.model = model;
		this.type = type;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
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
	
	
	

}
