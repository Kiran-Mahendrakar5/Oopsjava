package com.xworkz.animal;

import com.xworkz.animal.dao.AnimalDao;

public class AnimalRunner {
	
	public static void main(String[] args) {
		
		AnimalDao obj = new AnimalDao();
	 obj.addAnimal("lion");
	 obj.addAnimal("tiger");
	 obj.addAnimal("cheeha");
	 obj.addAnimal("fox");
	 obj.addAnimal("rabbit");
	
	
	obj.read();
	System.out.println(".................................");
	
	
	obj.updateByIndex("cat", 3);
	
	obj.read();
	
			
		
		
		
		
		
	}

}
