package com.xworkz.fruit;

import com.xworkz.fruit.constant.FruitType;
import com.xworkz.fruit.dao.FruitDao;
import com.xworkz.fruit.dto.FruitDto;



public class FruitRuuner {
	
	public static void main(String[] args) {
	
		FruitDao dao = new FruitDao();
		
		NutritionDto nutri = new NutritionDto("apple", "red");
		
		FruitDto dto = new FruitDto("orange", "darkOrange", FruitType.SEED, nutri);
		
		
		
		dao.saveFriut(dto);
		System.out.println(dao.saveFriut(dto));
		
		
		FruitDto[] juice= dao.readAll();//dao is there in dao class
		for(int i=0;i<juice.length;i++) {
			if(juice[i]!=null)
			System.out.println(juice[i]);
			
		}
		boolean ref = dao.findByName("orange");
		//System.out.println(dao.findByName("orange"));
		System.out.println(ref);
		
		dao.deleteByName("orange");
		FruitDto[] juice1= dao.readAll();
		for(int i=0;i<juice1.length;i++) {
			if(juice[i]!=null) {
			System.out.println(juice[i]);
			
			
		}
		
		
		
		
	}

	}
	}


