package com.xworkz.customexception;

import com.xworkz.customexception.constant.ArrayInvalid;

public class CustomException {
	
	public static boolean save(String name) {
		String[]array = new String[5];
		if(name!=null) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==null) {
					array[i]=name;				}
				
			}
			throw new ArrayInvalid("kiran");
		}
		return false;
	}

}
