package com.xworkz.exceptiondelegate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDelegate {
	
	// CHECKED EXCEPTION
	// FileNotFoundException
	public static void myMethod() throws FileNotFoundException  {
		FileInputStream refe = new FileInputStream("C:\\\\Users\\\\Lenovo\\\\Desktop\\\\codes\\\\Byteloop");
		
	}
	//ClassNotFoundException
	public static void firstMethod() throws ClassNotFoundException {
		Class.forName("khjhjjiij");
	}
	//UNCHECKED EXCEPTION
	
	public static void secondMethod() {
		String[] animal = new String[2];
		System.out.println(animal[5]);
	}
	public static  void thirdMethod() {
		String ref5 = null;
		ref5.equals(ref5);
		System.out.println(ref5);
		
	}
	public static void fourthMethod(String name) {
		name ="kiran";
		name.equals(name);
		System.out.println(name);
	}
	
	

}
