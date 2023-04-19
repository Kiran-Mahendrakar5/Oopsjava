package com.xworkz.acessspecifiers;

public class Runner {
	
	public static void main(String[] args) {
		Car.giveLook();
		Car.giveComfortTravel();//public method
		Car.giveStength();
		Car.giveHappiness();
		
		System.out.println(Car.tyres);//protected access with in same package
		System.out.println(Car.mirror);
		
		Car veh = new Car();
		System.out.println( veh.tyreColour);//non static variable for protected
	    System.out.println(veh.price);
	    veh.makesTravel();//private for non static 
	}
	

}
