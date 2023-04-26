package com.xworkz.house;

import com.xworkz.dao.HouseDao;

public class HouseRunner {
	public static void main(String[] args) {
		
		HouseDao bird = new HouseDao();

	bird.saveString("peacock");
	bird.saveString("parrot");
	bird.saveString("pigeon");
	bird.saveString("duck");
	bird.saveString("hen");
	
	
	
	
	
	}
}



