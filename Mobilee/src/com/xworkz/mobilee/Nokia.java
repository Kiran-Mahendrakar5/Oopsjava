package com.xworkz.mobilee;

public class Nokia implements Mobilee,Smartphone {

	@Override
	public void call() {
		System.out.println("comminucation");
		
	}

	@Override
	public void makeMassege() {
		System.out.println("notification");
		
	}

	@Override
	public void calender() {
		System.out.println("day by day");
		
	}

	@Override
	public void wifi() {
		System.out.println("internet use");
		
	}

	@Override
	public void touchScreen() {
		System.out.println("onOfflight");
		
	}

	@Override
	public void screenshot() {
		System.out.println("Click the photo");
		
	}
	

}
