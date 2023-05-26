package com.xworkz.engine.dao;

import java.util.Iterator;

import com.xworkz.engine.dto.EngineDto;

public class EngineDao implements InterfaceDao {
	EngineDto[] egn = new EngineDto[5];

	@Override
	public boolean save(EngineDto dto) {
		if (dto != null) {
			if (dto.getName() != null) {
				for (int i = 0; i < egn.length; i++) {
					if (egn[i] == null) {
						egn[i] = dto;
						System.out.println("name saved");
						return true;
					}
				}
				System.out.println("array dont have space");
				return false;
			}
			System.out.println("get name is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public EngineDto[] readAll() {

		return egn;
	}

	@Override
	public boolean updatenameByModel(String model, String name) {
		if (model != null && name != null) {
			for (int i = 0; i < egn.length; i++) {
				if (egn[i].getName().equals(name))
					;
				egn[i].setModel(model);
				System.out.println("name updated");
				return true;
			}
			System.out.println("array name found");
			return false;

		}
		System.out.println("model,name is null");
		return false;

	}

	@Override
	public boolean deleteName(String name) {
		if (name != null) {
			for (int i = 0; i < egn.length; i++) {
				if (egn[i].getName().equals(name)) {
					egn[i].setName(null);
					System.out.println("name delete");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public EngineDto findType(String type) {
		if (type != null) {
			for (int i = 0; i < egn.length; i++) {
				if (egn[i] != null) {
					if (egn[i].getType().equals(type)) {
					System.out.println("find succefully");
					return null;
				}

			}
			System.out.println("name not found");
			return null;
		}
		System.out.println("type is null");
		return null;
	}
		return null;

}
}
