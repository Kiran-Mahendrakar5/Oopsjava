package com.xworkz.exceptionmack2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception {
	
	public static void myMethod() {
		int a=0;
		int b=10/a;
	}
		public static void firstMethod() throws FileNotFoundException {
			FileInputStream ref = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\codes\\StringLitrals.java");
		}
	
	

}
