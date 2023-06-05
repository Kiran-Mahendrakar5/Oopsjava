package com.xworkz.throwexception;

import com.xworkz.throwexception.constant.nameNullException;

public class Runner {
	public static void main(String[] args) {
		Throw ref = new Throw();
		try {
			ref.myMethod(null);
			System.out.println("hllo");
		}
		catch(nameNullException e) {
			e.printStackTrace();
			System.out.println("dfghjkl");
		}
	}

}
