package com.xworkz.books.dao;

import com.xworkz.books.dto.BooksDto;

public class BooksDaoTwo extends AbstractDao {

	BooksDto[] classtwo = new BooksDto[10];

	public boolean save(BooksDto dto) {
		for (int i = 0; i < classtwo.length; i++) {
			if (classtwo[i] == null) {
				classtwo[i] = dto;
				System.out.println("valves in array is saved");
				return true;

			}
			System.out.println("index have not space");

		}

		System.out.println("checking array");
		return false;

	}

	@Override
	public BooksDto[] readAll() {
		for(int i=0;i<classtwo.length;i++) {
			System.out.println(classtwo[i]);
		
	}
		 return classtwo ;
	}

	@Override
	public boolean find(String findName) {
		for(int i=0;i<classtwo.length;i++) {
			if(classtwo[i]!=null) {
				if(classtwo[i].getColor()!=null) {
			if(classtwo[i].getColor().equals(findName)) {
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
		for(int i=0;i<classtwo.length;i++) {
			if(classtwo[i]!=null) {
				classtwo[i].setName(updateName);
				System.out.println("update succefully");
		return false;
	}

}
		return false;
	}

	@Override
	public boolean deleteByname(String removename) {
		System.out.println("method is running");
		for(int i=0;i<classtwo.length;i++) {
			if(removename!=null) {
				System.out.println("name is not null");
				if(classtwo[i]!=null) {
			if(removename.equals(classtwo[i].getType())) {
				classtwo[i].setType(null);
				System.out.println("name deleted");
				//classtwo[i]=null;
				return true;
				
			
	}
			}
		}
		return false;
		}
		return false;
}
}

