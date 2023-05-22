 package com.xworkz.mobile.dao;

import com.xworkz.mobile.dto.AbstractDao;
import com.xworkz.mobile.dto.MobileDto;

public class MobileDao extends AbstractDao {
	
MobileDto[] android = new MobileDto[10];
public boolean save(MobileDto dto) {
	if(dto!=null) {
		if(dto.getName()!=null) {
			for(int i=0;i<android.length;i++) {
				if(android[i]==null) {
					android[i]=dto;
					System.out.println("valve saved");
					return true;
				
				}
				System.out.println("not having space");
			}
			System.out.println("checking array one by one");
			return false;
		}
		System.out.println("getName is null");
		return false;
	}
	System.out.println("dto is null");
	return false;
}


	public MobileDto[] readAll() {
		for(int i=0;i<android.length;i++) {
			System.out.println(android[i]);
		}
		return android;
		
	}
	@Override
public boolean find(String findName ) {
		for(int i=0;i<android.length;i++) {
			if(android[i]!=null) {
			if(android[i].getName()!=null) {
			if(android[i].getName().equals(findName)) {
				System.out.println("valve is saved");
				return true;
			}	
			return false;
			}
		}
		}
	}
	@Override
	public boolean updateNameByColor(String updatecolor, String updateName) {
		for(int i=0;i<android.length;i++) {
			if(android[i]!=null);
			android[i].setName(updateName);
			System.out.println("update succefully");
			return true;
		}
		
		
		
		return false;
	}
}

	
	


