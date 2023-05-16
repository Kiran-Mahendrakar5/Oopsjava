package com.xworkz.fruit;

public class NutritionDto {
String name;
String colour;


public NutritionDto(String name, String colour) {
	super();
	this.name = name;
	this.colour = colour;
}


@Override
public String toString() {
	return "NutritionDto [name=" + name + ", colour=" + colour + "]";
}
	
	
}
