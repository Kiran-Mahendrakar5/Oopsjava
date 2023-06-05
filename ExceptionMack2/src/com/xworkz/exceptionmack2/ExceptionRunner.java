package com.xworkz.exceptionmack2;

public class ExceptionRunner {
	public static void main(String[] args) {
		try {
		ExceptionThrow.secondMethod();
	}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

}
}
