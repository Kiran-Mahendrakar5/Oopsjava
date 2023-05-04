package com.xworkz.vegetables;


import com.xworkz.vegetables.constant.VegetableType;
import com.xworkz.vegetables.dao.VegetablesDao;
import com.xworkz.vegetables.dto.BreedDto;
import com.xworkz.vegetables.dto.VegetablesDto;

public class VegetablesRunner {

	public static void main(String[] args) {
		VegetablesDao dao = new VegetablesDao();

		BreedDto singlebreed = new BreedDto("monoBreed", "pink");
		VegetablesDto dto = new VegetablesDto("Carrot", "orage", "sweet", "vitaminB", VegetableType.WITHSEEDVEGETABLE,
				singlebreed);
		
		 
		

		dao.saveVegetables(dto);
		System.out.println(dao.saveVegetables(dto));
		
		

		VegetablesDto[] veg1 = dao.readAll();
		for (int i = 0; i < veg1.length; i++) {
          if(veg1[i]!=null) {
			System.out.println(veg1[i]);
		
         }
		}
		
		
		dao.DeleteByname("Carrot");//equalsIgnoreCase
		
		VegetablesDto[] veg2 = dao.readAll();
		for (int i = 0; i < veg2.length; i++) {
          if(veg2[i]!=null) {
			System.out.println(veg2[i]);
			
         }
		}
		
		boolean ref = dao.findByname("Carrot");
		System.out.println(ref);
		
		
	}	
		
		
}
		
		
		

	


	










