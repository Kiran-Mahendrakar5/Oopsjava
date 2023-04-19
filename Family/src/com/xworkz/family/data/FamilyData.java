package com.xworkz.family.data;

public class FamilyData {
	public String familyName;
	public int noOfFamilyMembers;
	public String fatherName;
	public String motherName;
	public int noOfChildren;
	
	//calling constructor
	public FamilyData(String familyName,int noOfFamilyMembers,String fatherName,String motherName,int noOfChildren) {
		this.familyName=familyName;
		this.noOfFamilyMembers=noOfFamilyMembers;
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.noOfChildren=noOfChildren;
		
	
	}
	public String toString() {
	return"familyName"+familyName+"familyMembers="+noOfFamilyMembers+"Head="+ fatherName+"world="+motherName+"childreans="+noOfChildren;

	}
	public boolean equal(FamilyData details1) {
	if(this.familyName.equals(familyName)&& this.noOfFamilyMembers==details1.noOfFamilyMembers && this.fatherName.equals(fatherName)&&this.motherName.equals(motherName)&& this.noOfChildren==details1.noOfChildren)	{
		return true;
	}
	else {
		return false;
	}

	}
}

