package com.xworkz.exceptiondelegate1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDelegate1 {
	//CHECKED EXCEPTION
	public static void myMethod() throws FileNotFoundException {
		FileInputStream ref = new FileInputStream("\"C:\\\\\\\\Users\\\\\\\\Lenovo\\\\\\\\Desktop\\\\\\\\codes\\\\\\\\Byteloo");
	}
	public static void firstMethod() throws ClassNotFoundException {
		Class.forName("khygjhgjgjyf");
	}
	//UNCHECKED EXCEPTION
	
	public static void secondMethod() {
		String[] array = new String[5];
		System.out.println(array[6]);
	}
	public static void thirdMethod() {
		String ref = null;
		ref.equals(ref);
		System.out.println(ref);
	}
	

}
