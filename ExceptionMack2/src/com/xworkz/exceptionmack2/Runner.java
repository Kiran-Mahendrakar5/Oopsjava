package com.xworkz.exceptionmack2;

import java.io.FileNotFoundException;

public class Runner {
	
	public static void main(String[] args) {
		
		try {
			Exception.firstMethod();
			System.out.println("hello");
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File Not FoundException");
			
		}
	}

}
