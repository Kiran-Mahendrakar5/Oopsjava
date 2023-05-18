package com.xworkz.books.dao;

import com.xworkz.books.dto.BooksDto;

public abstract class AbstractDao {
	
	public abstract boolean save(BooksDto dto);
	public abstract BooksDto[] readAll();
	public abstract boolean find(String findName);
	public abstract boolean updateNameByColor(String updatecolor,String updateName);
    public abstract boolean deleteByname(String removename);
	

}
