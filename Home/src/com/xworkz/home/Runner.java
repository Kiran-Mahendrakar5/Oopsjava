package com.xworkz.home;

import java.util.LinkedList;

import com.xworkz.home.dao.HomeDao;
import com.xworkz.home.dto.HomeDto;

public class Runner {
	public static void main(String[] args) {
		
		HomeDto dto = new HomeDto("vayuputra","yellow","duplex",4);
		HomeDto dto1 = new HomeDto("Vinayaka","orange","triplex",5);
		
		HomeDao dao = new HomeDao();
		dao.save(dto);
		dao.save(dto1);
	
		
		LinkedList<HomeDto> ref =dao.read();
		for(HomeDto ref1:ref) {
			System.out.println(ref1);
		}
		boolean find =dao.findName("Kiran");
		System.out.println(find);
		
		boolean update =dao.update("Dark");
		System.out.println(update);
		
		
		
		
		
	
		
		
	}

}
