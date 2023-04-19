package com.xworkz.accessmodifier;

public class Runner {
	
	public static void main(String[] args) {
		
		Bike rc= new Bike();//creating object for non static 
		
		
		
		rc.bike(); //non static 
		Bike.bikeNo();//static 
		Bike.bikeMir();//static 
		Bike.bikeSeat();//static 
		
	}

}
