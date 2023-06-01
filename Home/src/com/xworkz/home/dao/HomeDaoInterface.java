package com.xworkz.home.dao;

import java.util.LinkedList;

import com.xworkz.home.dto.HomeDto;

public interface HomeDaoInterface {
	
	public boolean save(HomeDto dto);
	public LinkedList<HomeDto> read();
	public boolean findName(String color);
	public boolean update(String color);
	

}
