package com.xworkz.mobile;


import com.xworkz.mobile.dao.MobileDao;
import com.xworkz.mobile.dto.MobileDto;

public class MobileRunner {
	public static void main(String[] args) {
		

	
	MobileDto dto = new MobileDto("Apple","gold","screentouch",30000);
	MobileDto dto1 = new MobileDto("sumsung","black","keypad",15000);
	
	
	MobileDao dao = new MobileDao();
	dao.save(dto);
	dao.find("Apple");
	dao.updateNameByColor("Apple", "silver");
	

	MobileDto[] android = dao.readAll();
	for(int i=0;i<android.length;i++) {
		if(android[i]!=null) {
			System.out.println(android[i]);
			
		}
	
	
	
	}
	

	}
}

