package com.xworkz.family;

import com.xworkz.family.data.FamilyData;

public class Ruuner {
	public static void main(String[] args) {
		FamilyData details = new FamilyData("jointFamily",5,"sathish","seema",2);//one refrence
		System.out.println(details);
	                                                                             //FALSE BECOUSE REFRENCE NAME DIFFERENT
		FamilyData details1 = new FamilyData("jointFamily",5,"sathish","seema",2);//second refrence
		System.out.println(details.equal(details1));
	}

}
