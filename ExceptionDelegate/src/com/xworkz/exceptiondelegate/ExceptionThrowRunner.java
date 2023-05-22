package com.xworkz.exceptiondelegate;

import java.io.FileNotFoundException;

public class ExceptionThrowRunner {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		try {
//			ExceptionThrow.throw_method();
			ExceptionThrow.throw_method1();
		}
//		catch(ClassNotFoundException csf) {
//			csf.printStackTrace();
	//	}
		catch(FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
	}

}
