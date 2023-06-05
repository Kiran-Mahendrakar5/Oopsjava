package com.xworkz.exception;

import com.xworkz.exception.constant.InvadildException;
import com.xworkz.exception.constant.InvalidNullException;
import com.xworkz.exception.constant.noSpaceInArray;

public class Exception {
		public boolean myMethod(String name) throws InvadildException{
			if(name == null) {     //if(name!=null)pasitive
				String name1 = null;
				name1.equals(name);
				return true;
				
			}
			throw new InvadildException("invalid exception");
	
			
	}
		public boolean save(String name) throws InvalidNullException {
			String[] array = new String[5];
			if(name==null) {
				for(int i=0;i<array.length;i++) {
					if(array[i]==null) {
						array[i]=name;
						System.out.println("name saved");
						return true;
					}
					
				}
			}
			
			throw new InvalidNullException("throwed");
			
		}
		
		public boolean myMethod() throws noSpaceInArray {
			String[] out = new String[5];
		//System.out.println(out[6]);
			throw new noSpaceInArray("no space");
			}
		
		
		
		

}
