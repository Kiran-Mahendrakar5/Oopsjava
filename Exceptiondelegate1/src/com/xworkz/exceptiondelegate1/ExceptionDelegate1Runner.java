package com.xworkz.exceptiondelegate1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDelegate1Runner {
	
	public static void main(String[] args) throws ClassNotFoundException {
//		ArrayIndexOutOfBoundsException
		ExceptionDelegate1.secondMethod();
		
//		NullPointerException
		ExceptionDelegate1.thirdMethod();
		
		
		try {
			ExceptionDelegate1.myMethod();
			ExceptionDelegate1.firstMethod();
		}
		catch(FileNotFoundException ref) {
			System.out.println("File Not Found Exception");
		}
		catch(ClassNotFoundException refe2) {
			System.out.println("Class Not Found Exception");
			refe2.printStackTrace();
		}
		
	}

}
