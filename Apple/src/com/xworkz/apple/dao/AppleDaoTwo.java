 package com.xworkz.apple.dao;

import com.xworkz.apple.dto.AppleDto;

public class AppleDaoTwo extends AbstractDao {
	
	AppleDto[] iphone = new AppleDto[10];
	
	public boolean save(AppleDto dto) {
		if(dto!=null) {
			if(dto.getName()!=null) {
				for(int i=0;i<iphone.length;i++) {
					if(iphone[i]==null) {
						iphone[i]=dto;
						System.out.println("value saved");
						return true;
					}
					System.out.println("index not having space");
					
					
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
		for(int i=0;i<iphone.length;i++) {
			if(iphone[i]!=null) {
			System.out.println(iphone[i]);
		}
		}
		return iphone;
	}

	@Override
	public boolean find(String findName) {
		for(int i=0;i<iphone.length;i++) {
			if(iphone[i]!=null) {
			if(iphone[i].getName()!=null) {
				if(iphone[i].getName().equals(findName)) {
					System.out.println("valve saved successfully");
					return true;
					
				}
			}	
			}
		}
		return false;
	}

	@Override
	public boolean updateNameByColor(String updatecolor, String updateByName) {
		for(int i=0;i<iphone.length;i++) {
			if(iphone[i]!=null) {
				iphone[i].setName(updateByName);
				System.out.println("update done");
				return true;
			}
		}
		return false;
	}

}
