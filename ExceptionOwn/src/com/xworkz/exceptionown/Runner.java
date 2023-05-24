package com.xworkz.exceptionown;

import com.xworkz.exceptionown.constant.InvalidNullException;

public class Runner {
	public static void main(String[] args) {
		Exception ref = new Exception();
		
		try {
			ref.mtMethod("xcvbnm");
		}
		catch(InvalidNullException e) {
			e.printStackTrace();
		}

	}
	
}
