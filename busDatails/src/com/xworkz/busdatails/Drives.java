package com.xworkz.busdatails;

public enum Drives {
	FRONTWHEELDRIVE("frontWheelDrive"),REARWHEELDRIVE("RearWheelDrive");
	String types;
	Drives(String types){
		this.types=types;
		System.out.println(types);
	}
	

}
