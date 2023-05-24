package com.xworkz.practice;

import java.io.FileNotFoundException;

public class PraticeThrow {

	public static void mMethod() throws FileNotFoundException {
		int i=0;
		throw new FileNotFoundException("file not found from praticeClass");
	}
	public static void yMethod() throws ClassNotFoundException {
		String[] array =new String[5];
		throw new ClassNotFoundException("class not found from praticeClass ");
	}
}
