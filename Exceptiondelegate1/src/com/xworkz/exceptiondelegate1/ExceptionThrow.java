package com.xworkz.exceptiondelegate1;

import java.io.FileNotFoundException;

public class ExceptionThrow {
	
	public static void firstMethod() throws ClassNotFoundException {
		int a=0;
		throw new ClassNotFoundException("Class Not Found Exception");
				
	}
	public static void secondMethod() throws FileNotFoundException {
		String[] animal = new String[4];
		throw new FileNotFoundException("File Not Found Exception");
	}

}
