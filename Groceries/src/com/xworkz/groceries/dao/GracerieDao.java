package com.xworkz.groceries.dao;

public class GracerieDao {

	String[] ref = new String[5];// in ref 5 valves stored

	public String[] addGracerie(String obj) {
		for (int i = 0; i < ref.length; i++) {
			if (ref[i] == null) {// ref[i]checking one by one Or null valve
				ref[i] = obj; // way inisialize valve to to array index
				return ref;
			}
		}
		return ref;

	}

	public void read1() {
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
	}

	public boolean updateByIndex(String update, int inx) {
		if (update != null) {
			for (int i = 0; i < ref.length; i++) {
				if (ref != null) {
					ref[inx] = update;
					System.out.println(" not null");
					return true;
				}
			}
		}
		System.out.println("ref valve null");
		return false;

	}

	public boolean updateByName(String updatev, String newvalve) {
		if (updatev != null) {
			for (int i = 0; i < ref.length; i++) {
				if (updatev.equals(ref[i])) {
					ref[i] = newvalve;
					return true;
				}
			}
		}
		return false;

	}

	public boolean deleteByindex(int removeinx) {
		ref[removeinx] = null;
		return true;
	}

	public boolean deleteByName(String removeinx) {
		for (int i = 0; i < ref.length; i++) {
			if (removeinx.equals(ref[i])) {
				ref[i] = null;
				return true;
			}
		}
		return false;

	}

	public void read() {
		for (int i = 0; i < ref.length; i++) {
			System.out.println(ref[i]);
		}
	}

	public boolean searchMethod(String valve1) {
		for (int i = 0; i < ref.length; i++) {
			if (valve1.equals(ref[i])) {
				ref[i] = valve1;
				System.out.println("found valve");
				return true;

			}
		}
		System.out.println("not found valve");
		return false;
	}

}
