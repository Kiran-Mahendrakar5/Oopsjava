package com.xworkz.exception;

import com.xworkz.exception.constant.InvadildException;
import com.xworkz.exception.constant.InvalidNullException;
import com.xworkz.exception.constant.noSpaceInArray;

public class ExceptionRunner {

	public static void main(String[] args) throws InvadildException {
		
		Exception ref = new Exception();
		try {
			ref.myMethod("kiran");
			//ref.save("kishan");
			//ref.myMethod();
		
		
		} catch (InvadildException e) {
			
			e.printStackTrace();
		//}
//		catch(InvalidNullException ec) {
//			ec.printStackTrace();
//	}
//		catch(noSpaceInArray ref2) {
//			ref2.printStackTrace();
//		}
		System.out.println("out bound running");	
	

	}
	}
}
