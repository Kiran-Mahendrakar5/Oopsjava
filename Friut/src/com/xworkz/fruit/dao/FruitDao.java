package com.xworkz.fruit.dao;

import com.xworkz.fruit.dto.FruitDto;

public class FruitDao {
	
	FruitDto[] pall = new FruitDto[10];
	
	public boolean saveFriut(FruitDto frui) {
		for(int i=0;i<pall.length;i++) {
			if(pall[i]==null);
			pall[i]=frui;
			return true;
			
		}
		
		return false;
		
	}
	public FruitDto[] readAll() {
		return pall;
	}
	
	public boolean findByName(String name) {
		for(int i=0;i<pall.length;i++) {
			System.out.println("name found");
			return true;
		}
		return false;
	}
	
	public boolean deleteByName(String name) {
		for(int i=0; i<pall.length;i++) {
			if(pall[i].getName().equals(name)) {
				pall[i].setName(null);
				System.out.println("true");
				return true;
			}
		}
		
		
		
		
		return false;
		
	}
	
	
	

}
