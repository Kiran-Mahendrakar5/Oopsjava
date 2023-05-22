package com.xworkz.apple.dao;

import com.xworkz.apple.dto.AppleDto;

public class AppleDao extends AbstractDao {
	
	AppleDto[] fruit = new AppleDto[10];
	
	public boolean save(AppleDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null) {
				for(int i=0;i<fruit.length;i++) {
					if(fruit[i]==null) {
						fruit[i]=dto;
						System.out.println("value saved");
						return true;
						
					}
					System.out.println("index have not space");
					
					
					
				}
				System.out.println("array checking one by one");
				return false;
			}
			System.out.println("get name is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public AppleDto[] readAll() {
		for(int i=0;i<fruit.length;i++) {
			System.out.println(fruit[i]);
		}
		return fruit;
	}

	@Override
	public boolean find(String findName) {
		for(int i=0;i<fruit.length;i++){
			if(fruit[i]!=null) {
				if(fruit[i].getName()!=null) {
			if(fruit[i].getName().equals(findName)) {
				System.out.println("value saved");
				return true;
			}
				}
			}
		}
		return false;
		
	}

	@Override
	public boolean updateNameByColor(String updatecolor, String updateByName) {
		for(int i=0;i<fruit.length;i++) {
			if(fruit[i]!=null) {
				if(fruit[i].getName().equals(updatecolor)) {
				//	if(fruit[i] == updateByColor) {//for int
				fruit[i].setName(updateByName);
				System.out.println("valve saved successfully");
				return true;
			}
		}
			System.out.println("not-------- update");
		return false;
	}
		System.out.println("not update");
		return false;
}

}
