package com.xworkz.oopspragramming;

public class Runner extends Laptop {
	
	public static void main(String[] args) {
		Laptop brand = new Laptop();
		brand.forWork();
		brand.gaming();
		brand.entertainment();
		
		Dell one = new Dell();
		one.meeting();
		one.email();
		
		Lenovo two = new Lenovo();
		two.performence();
		two.touchPad();
		
		Macbook three = new Macbook();
		three.givelook();
		three.virus();
		
		System.out.println(brand.name);
		System.out.println(brand.quality);
		System.out.println(brand.colour);
		System.out.println(brand.price);
		System.out.println(brand.ramspace);
		System.out.println(one.colour);
		System.out.println(one.price);
		System.out.println(two.havingFingerPrint);
		System.out.println(two.rating);
		System.out.println(three.colour);
		System.out.println(three.price);
		System.out.println(three.havingSymbol);
		
		
	}

}
