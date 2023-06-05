package com.xworkz.fruit.dao;

import com.xworkz.fruit.constant.ArrayHaveNoSpace;
import com.xworkz.fruit.constant.NameIsNullException;
import com.xworkz.fruit.dto.FruitDto;

public class FruitDao {

	FruitDto[] dtos = new FruitDto[1];

	public boolean save(FruitDto dto) throws ArrayHaveNoSpace {
		if (dto != null) {
			if (dto.getName() != null) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] == null) {
						dtos[i] = dto;
						System.out.println("name saved");
						return true;
					}
				}
				throw new ArrayHaveNoSpace("array have no space msg");

			}
			System.out.println("get name is null");
			return false;
		}
		System.out.println("dto is null");
		return false;

	}

	public FruitDto[] readAll() {
		return dtos;

	}

	public boolean updateNameByfruitcolor(String name, String fruitcolor) throws NameIsNullException {
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					dtos[i].getName().equals(name);
					dtos[i].setFruitcolor(fruitcolor);
					System.out.println("name updated");
					return true;

				}
				System.out.println("full dtos is null");

			}
			System.out.println("array have no space");
			return false;

		}
		throw new NameIsNullException("name is null msg");

	}

	public boolean deleteName(String name) {
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					dtos[i].getName().equals(name);
					dtos[i].setName(null);
					System.out.println("name delete");
					return true;
				}
				System.out.println("full dtos is null");
				return false;
			}
			System.out.println("array no space");
			return false;
		}
		System.out.println("name is null");
		return false;
	}

}
