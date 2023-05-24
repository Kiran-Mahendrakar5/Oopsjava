package com.xworkz.newexception;

import com.xworkz.newexception.constant.ArrayInvalidException;

public class NewException {
	
	public boolean save(String name) throws ArrayInvalidException {
		String[] array = new String[5];
		if(name!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=name;
					System.out.println("name saved");
					return true;
				}
			}
			throw new ArrayInvalidException("kiran");
			
			
		}
		
		
	}
}

	


