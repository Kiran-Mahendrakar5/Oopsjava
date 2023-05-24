package com.xworkz.exceptionown;

import com.xworkz.exceptionown.constant.InvalidNullException;

public class Exception {
	
	public boolean mtMethod(String name) throws InvalidNullException {
		if(name==null) {
		String name1=null;
		name1.equals(name);
		
	}
		throw new InvalidNullException("kiran");
		
}
	
}
