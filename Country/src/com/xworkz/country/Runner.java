package com.xworkz.country;

import com.xworkz.country.info.Country;

public class Runner {
	public static void main(String[] args) {
		
		Country ref = new Country();
		
		ref.setname("india");
		ref.setname("norandramodi");
		ref.setNotionalAnimal("tiger");
		
		
		System.out.println(ref.getname());
		System.out.println(ref.getpm());
		
		System.out.println(ref.getNotionalAnimal());
		
	}

}
