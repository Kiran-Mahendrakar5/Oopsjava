package com.xworkz.throwexception;

import com.xworkz.throwexception.constant.nameNullException;

public class Throw {
	
	public boolean myMethod(String  name1) throws nameNullException {
		if(name1==null) {
		 name1 = null;
		 System.out.println();
		
		 throw new nameNullException("Name is null");

	}
		return false;	
		
	

}
}
