package com.xworkz.practice;

import java.io.FileNotFoundException;

public class Runner {
	public static void main(String[] args) throws ClassNotFoundException {
//		Practice.myMethod();
//		Practice.firstMethod();
//		Practice.secondMethod();
		
		try {
			//Practice.thirdMethod();
			Practice.forthMethod();
		}
//		catch(FileNotFoundException e) {
//			System.out.println("file not found");
//		}
		catch(ClassNotFoundException e1) {
			e1.printStackTrace();
			System.out.println("class not found");
		}
	}

}
