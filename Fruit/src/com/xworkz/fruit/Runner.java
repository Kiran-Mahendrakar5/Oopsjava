package com.xworkz.fruit;

import com.xworkz.fruit.constant.ArrayHaveNoSpace;
import com.xworkz.fruit.constant.NameIsNullException;
import com.xworkz.fruit.dao.FruitDao;
import com.xworkz.fruit.dto.FruitDto;

public class Runner {
	public static void main(String[] args) {
		
		FruitDto dto = new FruitDto("Apple","red", "withSeed", "normal");
		FruitDto dto1 = new FruitDto("orange","ogn", "seedLess", "cross");
		FruitDao dao = new FruitDao();
		
		try {
			dao.save(dto);
			dao.save(dto1);
		} catch (ArrayHaveNoSpace e) {
			e.printStackTrace();
		}
		
		System.out.println("......................");
		try {
			dao.updateNameByfruitcolor(null, "green");
		} catch (NameIsNullException e) {
			e.printStackTrace();
		}
		System.out.println(".......................");
		dao.deleteName("Apple");
		System.out.println("......................");
		FruitDto[] ref =dao.readAll();
		for(int i=0;i<ref.length;i++) {
		if(ref[i]!=null) {
			System.out.println(ref[i]);
		}
		
		}
		
	}

}
