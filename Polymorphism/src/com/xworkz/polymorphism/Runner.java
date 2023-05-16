package com.xworkz.polymorphism;

public class Runner {
	public static void main(String[] args) {
		
	
	
	Vehicle veh = new Vehicle();
	veh.travel();
	veh.ride();
	
	Bike bik = new Bike();
	bik.travel();
	bik.ride();

}
}