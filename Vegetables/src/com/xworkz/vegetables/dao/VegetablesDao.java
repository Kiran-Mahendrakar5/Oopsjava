package com.xworkz.vegetables.dao;

import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesDao {
	
	VegetablesDto[] salad = new VegetablesDto[10];
	
	public boolean saveVegetables(VegetablesDto veg ) {
		for(int i=0; i<salad.length;i++) {
			if(salad[i]==null) {
				salad[i]=veg;
			
				return true;
				
			}
		}
		return false;
	}
	public VegetablesDto[] readAll() {
	return salad;
	}
	
	
	public boolean DeleteByname(String name  ) {
			for(int i=0;i<salad.length;i++) {
		if(salad[i].getName().equalsIgnoreCase(name)) {
				salad[i].setName(null);
				System.out.println("true");
				return true;
	}
			}		
			
				
			
			return false;

			}
public boolean findByname(String name) {
	
		for(int i=0;i<salad.length;i++) {
			//if(salad[i]!=null) {
			//if(salad[i].getName().equals(name)) {
			//salad[i]=name;
				System.out.println("name found");
				return true;
			}
		
	
	
	
		
		
	
		return false;
	
}
}



