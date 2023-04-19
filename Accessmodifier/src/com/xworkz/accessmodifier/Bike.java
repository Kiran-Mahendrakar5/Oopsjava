package com.xworkz.accessmodifier;

public class Bike {
	
	private  String bikeName = "Ktm";//non static 
	private static String registration = "Bangalore";
	private static int mirror = 2;
	private static int seat  = 2;
	
	public  void bike() {//non static
		System.out.println("print bike name");
		System.out.println(bikeName);
	}
	public static void bikeNo() {
		System.out.println("print number");
		System.out.println("registration");
	}
	public static void bikeMir() {
		System.out.println("concave and convex");
		System.out.println(mirror);
	}
	public static void bikeSeat() {
		System.out.println("frot and back");
		System.out.println(seat);
	}

}
