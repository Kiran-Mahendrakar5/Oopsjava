package com.xworkz.acessspecifiers.vehicle;

import com.xworkz.acessspecifiers.Car;

public class Bmw extends Car{
	public static void main(String[] args) {
		
		Car ref = new Car();//non static variable for public 
		System.out.println(Car.tyres);	
		System.out.println(Car.name);
		System.out.println(ref.colour);
	}
	


}



