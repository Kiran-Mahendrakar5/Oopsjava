package com.xworkz.exception;

import java.io.FileInputStream;

public class exceptionRunner {

	public static void main(String[] args) {
		// UNCHECKED BY CAMPILER
		// ArithmeticException compiler not request to handle
//		int a = 0;
//		int b = 10 / a;

		// ArrayIndexOutOfBoundsException
//		String[] animal = new String[5];
//		System.out.println(animal[6]);

		// ArrayIndexOutOfBoundsException
//		String[] animals = {"Lion","tiger","rabbit","deer"};
//		System.out.println(animals[6]);

		// null point exception
//		String ref = null;
//		ref.equals("kiran");
//		System.out.println(ref);
		// CHECKED BY CAMPILER

		try {
		FileInputStream refrence = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\codes\\StringLitrals.java");//campilarfind
		//FileInputStream refrence1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\codes\\StringLitrals");//campilarmayfindmaynotfind
			
			System.out.println("hello");
			
			System.out.println("welcome");
		}

		catch (Exception ref) {
			System.out.println("file not found");
		}

	}

}
