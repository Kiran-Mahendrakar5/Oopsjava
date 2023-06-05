package com.xworkz.ownexception;

import com.xworkz.ownexception.constant.ArrayInvalid;
import com.xworkz.ownexception.constant.InvalidNullException;

public class Runner {

	public static void main(String[] args) throws ArrayInvalid {
		
		Exception ref = new Exception();
		try {
			ref.myMethod("kiran");
			//ref.save("dfghjk");
			
		}
		catch(InvalidNullException ref1) {
			ref1.printStackTrace();
			System.out.println("Invalid Null Exception found");
		}
//		catch(ArrayInvalid ref2) {
//			ref2.printStackTrace();
//			System.out.println("Array Invalid");
//		}
		
		
	}

}
