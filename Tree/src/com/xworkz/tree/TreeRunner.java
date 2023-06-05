package com.xworkz.tree;

import com.xworkz.tree.constant.ArrayDontHaveEmptySpaceException;
import com.xworkz.tree.constant.DtoNullException;
import com.xworkz.tree.constant.GetNameIsNotNullException;
import com.xworkz.tree.constant.NameNullException;
import com.xworkz.tree.dao.TreeDao;
import com.xworkz.tree.dto.TreeDto;

public class TreeRunner {
	public static void main(String[] args)  {
		
		TreeDto dto = new TreeDto("mangoTree", 2000, 1500, 10);//0
		TreeDto dto1 = new TreeDto("Apple Tree", 3000, 1800, 50);//1
		TreeDao dao = new TreeDao();
		
		try {
			dao.save(dto);
     		dao.save(dto1);
     		System.out.println("..............................");
     		dao.UpdateFruitsbyName("mangoTree", 500);
     		//dao.UpdateFruitsbyName(null, 500);for NameNullException
     		System.out.println(".................................");
     		try {
				dao.DeleteName("mangoTree");
			} catch (GetNameIsNotNullException e) {
				e.printStackTrace();
			}

     		
     		
			
		} catch (ArrayDontHaveEmptySpaceException e) {
			e.printStackTrace();
		}
		catch(DtoNullException e) {
			e.printStackTrace();
		} catch (NameNullException e) {
			e.printStackTrace();
		}
		TreeDto[] ref = dao.readAll();
		for (int i = 0; i < ref.length; i++) {
			if(ref[i]!=null) {
			System.out.println(ref[i]);
		}
		}
		
		
	}
	

}
