package com.xworkz.pen;


import com.xworkz.pen.dao.PenDao;
import com.xworkz.pen.dto.PenDto;

public class Runner {
	public static void main(String[] args) {
		
		PenDto dto = new PenDto("cello", "parkar",300, "ink");
		PenDto dto1 = new PenDto("butterflow", "classmate",50, "ballPen");
		PenDao dao = new PenDao();
		
		dao.save(dto);
		dao.save(dto1);
		System.out.println("...................");
		boolean update = dao.updateNameBytype("ink", "plane");
		System.out.println(update);
		System.out.println("........................");
		boolean ref2 = dao.deleteIndexByName(1);
		System.out.println(ref2);
		
	

		
		PenDto[] ref = dao.readAll();
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] != null) {
				System.out.println(ref[i]);
			}
			
			}
	}

}
