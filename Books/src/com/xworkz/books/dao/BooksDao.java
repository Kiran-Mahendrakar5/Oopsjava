package com.xworkz.books.dao;

import com.xworkz.books.dto.BooksDto;

public class BooksDao extends AbstractDao {
	
	BooksDto[] classbook = new BooksDto[10];
	
	
	public boolean save(BooksDto dto) {
		if(dto!=null) {
			if(dto.getBrand()!=null) {
				for(int i=0;i<classbook.length;i++) {
					if(classbook[i]==null){
						classbook[i]=dto;
						System.out.println("valves in array is saved");
						return true;
						
					}
					System.out.println("index have not space");
				
					
				}
				System.out.println("checking array");
				return false;
			}
			System.out.println("getBrand is null");
			return false;
		}
		System.out.println("dto is null");
			return false;
		
		
	}


	@Override
	public  BooksDto[] readAll() {
		for(int i=0;i<classbook.length;i++) {
			if(classbook[i]!=null) {
			System.out.println(classbook[i]);
			}
		}
		return classbook;
		
	}


	@Override
	public boolean find(String findName) {
		for(int i=0;i<classbook.length;i++) {
			if(classbook[i]!=null) {
				if(classbook[i].getBrand()!=null) {
			if(classbook[i].getBrand().equals(findName)) {
				System.out.println("valve found");
				return true;
			}
		}
		return false;
		}
	}
		return false;
	
	}


	@Override
	public boolean updateNameByColor(String updatecolor, String updateName) {
		for(int i=0;i<classbook.length;i++) {
			if(classbook[i]!=null) {
				classbook[i].setName(updateName);
				System.out.println("update succefully");
				return true;
			}
		}
		System.out.println("classbook null check it");
		return false;
		
	
	}


	@Override
	public boolean deleteByname(String removename) {
		System.out.println("method is running");
		for(int i=0;i<classbook.length;i++) {
			if(removename!=null) {
				System.out.println("name is not null");
			if(removename.equals(classbook[i].getName())) {
				classbook[i].setName(null);
				System.out.println("name deleted");
			//	classbook[i]=null;
				return true;
				
		}
		}
		
		return false;
	}
		return false;
	
}
}
