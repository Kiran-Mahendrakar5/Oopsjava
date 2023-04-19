package com.xworkz.acessspecifiers;

public class Car {
	
	//Static variables:-
	
	static String name = "mercedes";
	private static String lastName = "Benz";
	static int tyres = 4;
	static int mirror = 2;
	
	// Non Static variables:-
	public String colour = "white";
	private String seatType = "Leather" ;
	int price = 10000000;
	protected String tyreColour = "Black";
	
	
	public static void giveLook() {
		System.out.println("public A S");
		System.out.println("name");
		System.out.println("private A S ");
		System.out.println("lastName");
    }
	public static void giveComfortTravel() {
		System.out.println("seatType");
	}
	public static void giveStength() {
		System.out.println("price");
	}
	
	
	
	

}
