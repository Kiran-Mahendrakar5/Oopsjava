package com.xworkz.apple;

import com.xworkz.apple.dao.AppleDao;
import com.xworkz.apple.dto.AppleDto;

public class AppleRunner {
	public static void main(String[] args) {
		
		AppleDto dto = new AppleDto("Simla","red","withSeed",100);
//		AppleDto dto1 = new AppleDto("greenApple","green","seedLess",200);
//		AppleDto dto2 = new AppleDto("varun","green","seedLess",200);
		AppleDao dao = new AppleDao();
		dao.save(dto);
		//dao.save(dto1);
		System.out.println("-------update dto_-------------");
		dao.updateNameByColor("simla", "salem");
		System.out.println("---------update dto1-----------");
		dao.updateNameByColor("varun", "whiteApple");
		System.out.println("..................................");
		dao.find("Simla");
		dao.find("greenApple");
		System.out.println(".................................");
	
	
		
		
		
		AppleDto[] fruit = dao.readAll();
		for(int i=0;i<fruit.length;i++) {
			if(fruit[i]!=null) {
			System.out.println(fruit[i]);
		}
		
		
		}
		
	}

}
