package com.xworkz.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Practice {

	public static void myMethod() {
		int a = 0;
		int b = 10 / a;
	}
	public static void firstMethod() {
		String[] array = new String[5];
		
	}
	public static void secondMethod() {
		String name = null;
		name.equals(name);
		System.out.println(name);
	}
	//checked exception
	public static void thirdMethod() throws FileNotFoundException {
		FileInputStream ref = new FileInputStream("kiran");
	}
	public static void forthMethod() throws ClassNotFoundException {
		Class.forName("kishan");
	}

}
