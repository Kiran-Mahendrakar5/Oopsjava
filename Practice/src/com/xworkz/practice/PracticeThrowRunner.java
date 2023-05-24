package com.xworkz.practice;

import java.io.FileNotFoundException;

public class PracticeThrowRunner {

	public static void main(String[] args) {
		
		try {
			//PraticeThrow.mMethod();
			PraticeThrow.yMethod();
		}
//		catch(FileNotFoundException ref) {
//			ref.printStackTrace();
//			System.out.println("file not found");
//		}
		catch(ClassNotFoundException ref1) {
			ref1.printStackTrace();
			System.out.println("class not found");
		}
		
		
	}

}
