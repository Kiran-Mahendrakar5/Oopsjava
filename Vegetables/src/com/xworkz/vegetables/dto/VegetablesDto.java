package com.xworkz.vegetables.dto;

import com.xworkz.vegetables.constant.VegetableType;

public class VegetablesDto {
	private String name;
	private String colour;
	private String tast;
	private String vitamin;
	private VegetableType type;
	private BreedDto breed;
	
	
	public VegetablesDto(String name, String colour, String tast, String vitamin, VegetableType type, BreedDto breed) {
		super();
		this.name = name;
		this.colour = colour;
		this.tast = tast;
		this.vitamin = vitamin;
		this.type = type;
		this.breed = breed;
	}


	@Override
	public String toString() {
		return "VegetablesDto [name=" + name + ", colour=" + colour + ", tast=" + tast + ", vitamin=" + vitamin
				+ ", type=" + type + ", breed=" + breed + "]";
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


	public String getTast() {
		return tast;
	}


	public void setTast(String tast) {
		this.tast = tast;
	}


	public String getVitamin() {
		return vitamin;
	}


	public void setVitamin(String vitamin) {
		this.vitamin = vitamin;
	}


	public VegetableType getType() {
		return type;
	}


	public void setType(VegetableType type) {
		this.type = type;
	}


	public BreedDto getBreed() {
		return breed;
	}


	public void setBreed(BreedDto breed) {
		this.breed = breed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	;
	
	

}
