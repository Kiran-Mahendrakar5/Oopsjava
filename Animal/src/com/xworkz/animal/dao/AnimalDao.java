package com.xworkz.animal.dao;

public class AnimalDao {

	String[] ref = new String[5];

	public String[] addAnimal(String obj) {
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] == null) {
				ref[i] = obj;
				return ref;
			}

		}
		return ref;
	}

	public void read() {
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
	}

	public boolean updateByIndex(String ref3, int index) {
		if (index >= 0) {
			if (index < ref.length) {
				if (ref3 != null) {
					ref[index] = ref3;
				}
				System.out.println("vavle is null");
			} else {
				System.out.println("index length");

			}
		} else {
			System.out.println("index is nagitive");
		}

		return false;

	}

	public boolean updateName(String oref,String nref3) {
		if(oref!=null) {
			if(nref3!=null) {
				for(int i=0;i<=ref.length;i++) {
					if(oref.equals(ref[i])) {
						ref[i]=nref3;
						return true;
					}
				}
			{
				System.out.println("oref is not present");
			}
			
			}
			}else {
			System.out.println("nref3 is null");
		
	}
	
	  else {
		System.out.println("oref is null");
	
	}
	
	return false;
	  }
