package com.xworkz.fruit.dto;

public class FruitDto {
	private String name;
	private String fruitcolor;
	private String type;
	private String breed;
	
	public FruitDto() {
		super();
	}

	@Override
	public String toString() {
		return "FruitDto [name=" + name + ", fruitcolor=" + fruitcolor + ", type=" + type + ", breed=" + breed + "]";
	}

	public FruitDto(String name, String fruitcolor, String type, String breed) {
		super();
		this.name = name;
		this.fruitcolor = fruitcolor;
		this.type = type;
		this.breed = breed;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFruitcolor() {
		return fruitcolor;
	}

	public void setFruitcolor(String fruitcolor) {
		this.fruitcolor = fruitcolor;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	

}
