package com.xworkz.engine.dao;

import com.xworkz.engine.dto.EngineDto;

public interface InterfaceDao {
	public boolean save(EngineDto dto);
	public EngineDto[] readAll();
	public boolean updatenameByModel(String model,String name);
	public boolean deleteName(String name);
	public EngineDto findType(String type);

}
