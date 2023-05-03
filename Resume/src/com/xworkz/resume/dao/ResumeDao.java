package com.xworkz.resume.dao;

import com.xworkz.resume.dto.ResumeDto;

public class ResumeDao {

	ResumeDto[] bio = new ResumeDto[10];

	public boolean saveResume(ResumeDto details) {

		if (details != null) {
			if (details.getName() != null && details.getEmail() != null) {
				if (bio != null) {
					for (int i = 0; i < bio.length; i++) {
						if (bio[i] == null) {
							bio[i] = details;
							System.out.println("bio saved successfully");
							return true;
						}
						System.out.println("bio not null contiues loop");
					}
					System.out.println("no bio found");
					return false;
				}
				System.out.println("bio null");
				return false;

			}
			System.out.println("name && email is null");
			return false;

		}
		System.out.println("detailes is null");
		return false;
	}

	public ResumeDto[] readAll() {
		return bio;
	}



public ResumeDto findByName(String name) {
	if (name != null) {
		for (int i = 0; i < bio.length; i++) {
			if (bio[i]!=null) {
				if(bio[i].getName().equals(name)) {
				System.out.println("name found");
				return bio[i];
				
			}
			System.out.println("name not found ");
		}
		System.out.println("name is null");
		return null;
		
	}System.out.println("name not found");
	return null;
}
	System.out.println("null name");
return null;
}


public ResumeDto findByEmail(String email) {
	if (email != null) {
		for (int i = 0; i < bio.length; i++) {
			if (bio[i]!=null) {
				if(bio[i].getEmail().equals(email)) {
				System.out.println("email found");
				return bio[i];
				
			}
			System.out.println("email not found ");
		}
		System.out.println("email is null");
		return null;
		
	}System.out.println("email not found");
	return null;
}
	System.out.println("null email");
return null;
}


public boolean updateDegreeByName(String name, String degree ) {
	if(name!=null&&name.length()>=5) {
		if(degree!=null) {
			for(int i=0;i<bio.length;i++) {
				if(bio[i]!=null) {
					bio[i].getName().equals(name);
					bio[i].setDegree(degree);
					System.out.println("degree is update");
					return true;
					
				}
				System.out.println("degree null");
			}
			System.out.println("degree not update");
			return false;
		}
		System.out.println("degree is null");
		return false;
	}
	System.out.println("name is null");
	return false;
		
}

public boolean updatePhoneNumberByEmail(String email, int phoneNumber ) {
	if(email!=null&&email.length()>=5) {
		if(phoneNumber!=0) {
			for(int i=0;i<bio.length;i++) {
				if(bio[i]!=null) {
					bio[i].getEmail().equals(email);
					bio[i].setPhoneNumber(phoneNumber);
					System.out.println("phoneNumber is update");
					return true;
					
				}
				System.out.println("phoneNumber null");
			}
			System.out.println("phoneNumber not update");
			return false;
		}
		System.out.println("phoneNumber is null");
		return false;
	}
	System.out.println("email is null");
	return false;
	
	
}
}





























				
				
			
				
				
				
				
				
				
				
				
				
