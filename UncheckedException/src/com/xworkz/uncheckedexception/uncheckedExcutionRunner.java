package com.xworkz.uncheckedexception;

public class uncheckedExcutionRunner {
	public static void main(String[] args) {
		
		
		// UNCHECKED BY CAMPILER
		// ArithmeticException compiler not request to handle
		int a = 0;
		int b = 10 / a;
		
//		// ArrayIndexOutOfBoundsException
		String[] animal = new String[5];
		System.out.println(animal[6]);
		
		
		
	
	}

}
