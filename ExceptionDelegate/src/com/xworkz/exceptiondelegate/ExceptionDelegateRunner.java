package com.xworkz.exceptiondelegate;

import java.io.FileNotFoundException;

public class ExceptionDelegateRunner {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
	//	 ExceptionDelegate.secondMethod();

		// NullPointerException
		//ExceptionDelegate.thirdMethod();

		// noNullPointerException
//		ExceptionDelegate.fourthMethod("kiran");
//		System.out.println("no null");

		try {
			// ExceptionDelegate.myMethod();
			ExceptionDelegate.firstMethod();
		}
//		 catch(FileNotFoundException ref1) {
//		 System.out.println("File Not Found Exception handled");
//
//		 }
		catch (ClassNotFoundException ref2) {
			ref2.printStackTrace();
			System.out.println("Class Not Found Exception handled");
		}
	}

}
