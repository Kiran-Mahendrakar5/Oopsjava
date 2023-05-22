package com.xworkz.apple.dao;

import com.xworkz.apple.dto.AppleDto;

public abstract class AbstractDao {
	
	public abstract boolean save(AppleDto dto);
	public abstract AppleDto[] readAll();
	public abstract boolean find(String findName);
	public abstract boolean updateNameByColor(String updatecolor,String updateByName);
    
}
