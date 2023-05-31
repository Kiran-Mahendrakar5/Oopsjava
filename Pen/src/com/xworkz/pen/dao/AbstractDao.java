package com.xworkz.pen.dao;

import com.xworkz.pen.dto.PenDto;

public abstract class AbstractDao {
	public abstract PenDto save(PenDto dto);
	public abstract  PenDto[] readAll();
	public abstract boolean updateNameBytype(String type,String name);
	public abstract boolean deleteIndexByName(int index);
	
	

}
