package com.xworkz.engine;

import com.xworkz.engine.dao.EngineDao;
import com.xworkz.engine.dto.EngineDto;

public class Runner {
	public static void main(String[] args) {

		EngineDto dto = new EngineDto("Boxer Engine", "2022k", "black", 12000);
		EngineDto dto1 = new EngineDto("en Engine", "2023k", "Grey", 14000);
		EngineDao dao =new EngineDao();
		
		dao.save(dto);
		Boolean ref1 = dao.updatenameByModel("2222k", "Boxer Engine");
		System.out.println(ref1);
		dao.deleteName("Boxer Engine");
		dao.findType("black");
		
		EngineDto[] ref=dao.readAll();
			for(int i=0;i<ref.length;i++) {
				if(ref[i]!=null) {
				System.out.println(ref[i]);
		}

	}
}
}