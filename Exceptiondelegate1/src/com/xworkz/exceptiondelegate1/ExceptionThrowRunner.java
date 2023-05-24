package com.xworkz.exceptiondelegate1;

import java.io.FileNotFoundException;

public class ExceptionThrowRunner {
	public static void main(String[] args) {
		
		try {
			ExceptionThrow.firstMethod();
			ExceptionThrow.secondMethod();
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
			System.out.println("class not found exception done");
			
		}
		catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
			System.out.println("file not found exception setted");
		}
	}

}
