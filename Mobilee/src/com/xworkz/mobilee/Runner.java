package com.xworkz.mobilee;

public class Runner {
	public static void main(String[] args) {
		//tight coupling
		Nokia nka = new Nokia();
		nka.call();
		nka.makeMassege();
		nka.calender();
		nka.wifi();
		nka.screenshot();
		nka.touchScreen();
		System.out.println("..........................");
		//loose coupling
		Mobilee ref = new Nokia();
	
		ref.call();
		ref.makeMassege();
		ref.calender();
		System.out.println("............................");
		Smartphone ref1 = new Nokia();
		ref1.wifi();
		ref1.screenshot();
		ref1.touchScreen();
		
	}

}
