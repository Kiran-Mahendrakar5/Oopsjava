package com.xworkz.exceptiondelegate;

import java.io.FileNotFoundException;

public class ExceptionThrow {
	public static void throw_method() throws ClassNotFoundException {
		int a=0;
		throw new ClassNotFoundException("Class Not Found Exception handle");
	}
	public static void throw_method1() throws FileNotFoundException {
		String[] animal = new String[3];
		throw new FileNotFoundException("updated File Not Found Exception" );
		
		
		
	}

}
