package com.xworkz.checkedexception;

import java.io.FileInputStream;

public class checkedRunner {
	public static void main(String[] args) {
		
		
		try
		{
//			FileInputStream refrence = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\codes\\Byteloop.java");
//			FileInputStream refrence1 = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\codes\\Byteloop");//campilarmayfindmaynotfind
	   
		//	ClassNotFoundException
			Class.forName ("fffygffg");
	
			System.out.println("hello");
			
			
			System.out.println("welcome");
		}
		
//		catch
//		(Exception ref) {
//			
//		ref.printStackTrace();
//			System.out.println("not found file");
//			
//			System.out.println("runnering");
//			
//		}
		
			catch
			(ClassNotFoundException cnf) {
				cnf.printStackTrace();
				System.out.println("ClassNotFoundException Handled");
		}
		
	}

}
