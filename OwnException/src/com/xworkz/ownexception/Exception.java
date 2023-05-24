package com.xworkz.ownexception;

import com.xworkz.ownexception.constant.ArrayInvalid;
import com.xworkz.ownexception.constant.InvalidNullException;

public class Exception {

	public boolean myMethod(String name1) throws InvalidNullException,ArrayInvalid {
		if(name1==null) {
		String name = null;
		name.equals(name1);
	}
		//System.out.println("name1 is not null");
		throw new InvalidNullException("sdfghj");
				
}
	
	public static boolean save(String name) throws ArrayInvalid {
		String[] array = new String[6];
		if(name!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=name;
				}
				throw new ArrayInvalid("done");
				
			}
			System.out.println("array is running");
		}
		return false;
	
	}
	
		
		
		
	}
	

