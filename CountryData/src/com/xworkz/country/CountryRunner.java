package com.xworkz.country;

import com.xworkz.countrydata.CountryData;

public class CountryRunner {
	
	public static void main(String[] args) {
		
		
		CountryData ref = new CountryData();
		
		ref.setnoOfStates(28);
		ref.setnotionalfood("raggiball");
		ref.setnotinalfruit("mango");
		ref.setnotionalanimal("Tiger");
		ref.setnotinalbird("peacock");
		ref.setnotinaltree("banyan");
		ref.setnotinalflower("Lotas");
		ref.setnotinalgame("hakky");
		
		
		System.out.println(ref.getnoOfStates());
		System.out.println(ref.getnotionalfood());
		System.out.println(ref.getnotinalfruit());
		System.out.println(ref.getnotionalanimal());
		System.out.println(ref.getnotinalbird());
		System.out.println(ref.getnotinaltree());
		System.out.println(ref.getnotinalflower());
		System.out.println(ref.getnotinalgame());
		
		
	}

}
