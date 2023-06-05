package com.xworkz.exceptionmack;
import java.io.FileInputStream;

public class ExceptionMackRunner {
	
	public static void main(String[] args) {
//		int a=0;
//		int b=10/a;
		
		
		
		try {
			FileInputStream ref = new FileInputStream("C:ppp\\Users\\Lenovo\\Desktop\\codes\\StringLitrals.java");
			System.out.println("hello");
		}
		catch(Exception ref) {
			ref.printStackTrace();
			System.out.println("file not found");
			
		}
	}

}
