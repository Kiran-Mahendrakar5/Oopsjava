package com.xworkz.exceptionmack2;

public class ExceptionThrow {
	
	public static void secondMethod() throws ClassNotFoundException {
		int i=0;
		throw new ClassNotFoundException("class not found");
	}

}
