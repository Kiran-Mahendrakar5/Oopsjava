package com.xworkz.myexcuption;

import com.xworkz.myexcuption.constant.InvalideNullExcuption;

public class myExcuption {

	public boolean myMethod(String name) throws InvalideNullExcuption {
		if(name==null) {
		String name1 =null;
		name1.equals(name);
		
	}
		throw new InvalideNullExcuption("kiran");

	}
}
