package com.xworkz.dao;

public class HouseDao {

	String[] bird = new String[20];

	public String[] saveString(String str) {

		if (str != null && str.length() > 3) {
			for (int i = 0; i < bird.length; i++) {

				if (bird[i] == null) {

					bird[i] = str;
					System.out.println(bird[i]);
					return bird;
				}

			}
		}
		System.out.println("not excututed");
		return bird;
	}

	public void read() {
		for (int i = 0; i < bird.length; i++) {
			System.out.println(bird[i]);
		}
	}
}
