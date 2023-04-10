package com.xworkz.agreegation;

public class Runner {
	
	public static void main(String[] args) {
		
		Doctor surgeon = new Doctor();
		surgeon.name = "Salan";
		surgeon.branch = "Ent";
		surgeon.salary = 75000;
		surgeon.isDoctorWearApron = true;
		
		System.out.println(surgeon.name);
		System.out.println(surgeon.branch);
		System.out.println(surgeon.salary);
		System.out.println(surgeon.isDoctorWearApron);
		
		
		Patients covid = new Patients();
		covid.name = "manu";
		covid.age = 78;
		covid.weight = 90;
		covid.disease = "Corona";
		
		System.out.println(covid.name);
		System.out.println(covid.age);
		System.out.println(covid.weight);
		System.out.println(covid.disease);
		
		
		Employees nurse = new Employees();
		nurse.name = "Ramya";
		nurse.work = "Caring";
		nurse.salary = 30000;
		nurse.gradution = "Nersing";
		nurse.age = 25;
		
		System.out.println(nurse.name);
		System.out.println(nurse.work);
		System.out.println(nurse.salary);
		System.out.println(nurse.gradution);
		System.out.println(nurse.age);
		
		
		
		
		Treatment vaccine = new Treatment();
		vaccine.diseaseName = "Antibiotics";
		vaccine.tablets = "Delo";
		vaccine.tablet = 50;
		vaccine.injection = "Covishild";
		vaccine.bloodReport = 'A';
		
		System.out.println(vaccine.diseaseName);
		System.out.println(vaccine.tablets);
		System.out.println(vaccine.tablet);
		System.out.println(vaccine.injection);
		System.out.println(vaccine.bloodReport);
		
		
		Hospital ramaiya = new Hospital();
		ramaiya.name = "Msramaiya";
		ramaiya.noOfBeds = 567788;
		ramaiya.noOfOxygen = 658777;
		ramaiya.noOfDoctor = 5000;
		ramaiya.noOfNurse = 10000;
		
		System.out.println(ramaiya.name);
		System.out.println(ramaiya.noOfBeds);
		System.out.println(ramaiya.noOfOxygen);
		System.out.println(ramaiya.noOfDoctor);
		System.out.println(ramaiya.noOfNurse);
		
		
		
		
				
		
	}

}
