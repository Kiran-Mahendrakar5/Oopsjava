package com.xworkz.home.dao;

import java.util.LinkedList;

import com.xworkz.home.dto.HomeDto;

public class HomeDao implements HomeDaoInterface {

	LinkedList<HomeDto> list = new LinkedList<HomeDto>();
	private HomeDto members;

	@Override
	public boolean save(HomeDto dto) {
		if (dto != null) {
		list.add(dto);
			System.out.println("name saved");
			return true;
		}

		return false;
	}

	@Override
	public LinkedList<HomeDto> read() {
		return list;

	}

	@Override
	public boolean findName(String color) {
		if (color != null) {
			for(HomeDto fnd:list) {
				list.get(1);
				System.out.println("color found");
				return true;
				
			}
			
		}
		return false;

	}

	@Override
	public boolean update(String color) {
		if (color != null) {
			for(HomeDto str:list) {
			list.set(0, str);
			System.out.println("updated members");
			return true;
		}

	}
		System.out.println("not found");
		return false;
	}

	
}
