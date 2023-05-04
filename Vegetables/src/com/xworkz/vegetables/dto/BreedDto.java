package com.xworkz.vegetables.dto;

public class BreedDto {
	String breed;
	String colour;
	
	
	public BreedDto(String breed, String colour) {
		super();
		this.breed = breed;
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "BreedDto [breed=" + breed + ", colour=" + colour + "]";
	}
	
	
	

}
