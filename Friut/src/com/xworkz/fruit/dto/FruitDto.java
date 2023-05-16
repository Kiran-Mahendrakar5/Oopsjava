package com.xworkz.fruit.dto;

import com.xworkz.fruit.NutritionDto;
import com.xworkz.fruit.constant.FruitType;

public class FruitDto {
	private String name;
	private String colour;
	private FruitType type;
	private NutritionDto nutri;
	
	
	@Override
	public String toString() {
		return "FruitDto [name=" + name + ", colour=" + colour + ", type=" + type + ", nutri=" + nutri + "]";
	}


	public FruitDto(String name, String colour, FruitType type, NutritionDto nutri) {
		super();
		this.name = name;
		this.colour = colour;
		this.type = type;
		this.nutri = nutri;
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


	public FruitType getType() {
		return type;
	}


	public void setType(FruitType type) {
		this.type = type;
	}


	public NutritionDto getNutri() {
		return nutri;
	}


	public void setNutri(NutritionDto nutri) {
		this.nutri = nutri;
	}
	
	
	
	
	
	
	
	
	
	

}
