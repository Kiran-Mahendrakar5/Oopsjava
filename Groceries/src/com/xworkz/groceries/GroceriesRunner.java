package com.xworkz.groceries;

import com.xworkz.groceries.dao.GracerieDao;

public class GroceriesRunner {
	
	public static void main(String[] args) {
		
		GracerieDao obj1 = new GracerieDao();
		
		
		obj1.addGracerie("ragi");
	    obj1.addGracerie("wheet");
		obj1.addGracerie("oats");
		obj1.addGracerie("rice");
		obj1.addGracerie("corn");
		
		obj1.read();
		System.out.println(".....................................................");
		obj1.updateByIndex("food", 4);
		obj1.read();
		
		
		System.out.println(".................old and new....................................");
		obj1.updateByName("ragi", "jeeraRice");
		obj1.read();
		
		System.out.println("....removeinx..");
		obj1.deleteByindex(1);
		obj1.read();
		
		System.out.println("....removeinx..");
		obj1.deleteByName("oats");
		obj1.read();
		
		System.out.println(".....remove name....");//found valve
		obj1.searchMethod("rice");
		obj1.read();
		
//		System.out.println(".....search name....");
//		obj1.searchMethod("fish");// not found valve
//		obj1.read();
		
		
		
		
		
		
		
	}
	

}
