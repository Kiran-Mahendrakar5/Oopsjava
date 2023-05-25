package com.xworkz.tree.dao;

import com.xworkz.tree.constant.ArrayHaveEmptySpace;
import com.xworkz.tree.constant.DtoNullException;
import com.xworkz.tree.constant.GetNameIsNotNull;
import com.xworkz.tree.constant.NameNullException;
import com.xworkz.tree.dto.TreeDto;

public class TreeDao {

	TreeDto[] dtos = new TreeDto[2];

	public boolean save(TreeDto dto) throws ArrayHaveEmptySpace, DtoNullException {
		if (dto != null) {
			if (dto.getName() != null) {
				for (int i = 0; i < dtos.length; i++) {
					if (dtos[i] == null) {
						dtos[i] = dto;
						System.out.println("name saved");
						return true;
					}
				}
				throw new ArrayHaveEmptySpace("array have no space");

			}
			System.out.println("get name is null");
			return false;
		}
		throw new DtoNullException("dto is null ");

	}

	public TreeDto[] readAll() {
		return dtos;
	}

	public boolean UpdateFruitsbyName(String name, int fruits) throws NameNullException {
		if (name != null) {
			for (int i = 0; i < dtos.length; i++) {
				if (dtos[i] != null) {
					dtos[i].getName().equals(name);
					dtos[i].setFruits(fruits);
					System.out.println("name updated");
					return true;

				}
				System.out.println("full dtos null");
				return false;
			}
			System.out.println("array have no space");
			return false;
		}
		throw new NameNullException("name is null");

	}

	public boolean DeleteName(String name) throws GetNameIsNotNull {
		for (int i = 0; i < dtos.length; i++) {
			if (dtos[i] != null) {
				dtos[i].setName(name);
				if (dtos[i].getName() == null) {
					System.out.println("name deleted");
					return true;
				}
				throw new GetNameIsNotNull("name is not null msg");
			}
			System.out.println("dtos is null");
			return false;

		}
		System.out.println("array have no space");
		return false;
	}
}
