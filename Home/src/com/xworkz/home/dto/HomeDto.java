package com.xworkz.home.dto;

public class HomeDto {
	
	private String name;
	private String color;
	private String type;
	private int members;
	
	public HomeDto() {
		super();
		
	}

	@Override
	public String toString() {
		return "HomeDto [name=" + name + ", color=" + color + ", type=" + type + ", members=" + members + "]";
	}

	public HomeDto(String name, String color, String type, int members) {
		super();
		this.name = name;
		this.color = color;
		this.type = type;
		this.members = members;
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

	public int getMembers() {
		return members;
	}

	public void setMembers(int members) {
		this.members = members;
	}
	
	
	
	

}
