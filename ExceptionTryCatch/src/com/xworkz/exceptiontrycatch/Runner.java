package com.xworkz.exceptiontrycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Runner {
	public static void main(String[] args) {
//		int a=0;
//		int b=10/a;
		
//		String[]array = new String[5];
//		System.out.println(array[6]);
		
//		String name=null;
//		name.equals(name);
//		System.out.println(name);
		
	
			
			try {
				//FileInputStream ref1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\codes\\StringLitrals.java");
				Class.forName("dfghjkwertyui");
				System.out.println("hello");
			} 
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
	
//	catch (FileNotFoundException e) {
//			e.printStackTrace();
	System.out.println("file not found");
//		}
//		
	
	}

}
