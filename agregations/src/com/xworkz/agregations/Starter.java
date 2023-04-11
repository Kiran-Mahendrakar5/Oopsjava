package com.xworkz.agregations;

public class Starter {
	
	public static void main(String[] args) {
		
		Worker laborer = new Worker();
		laborer.id = "Kiran";
		laborer.salary = 50000;
		laborer.commision = 25000;
		
		Location direction = new Location();
		direction.homeName = "Vayuputra";
		direction.street = "Silk board";
		direction.homeNumber = 123;
		direction.distict = "Chitradurga";
		
		System.out.println(laborer);
		
		
		
	}

}
