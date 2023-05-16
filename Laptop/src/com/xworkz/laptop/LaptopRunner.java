package com.xworkz.laptop;

public class LaptopRunner {
	
	public static void main(String[] args) {
		
		
		Dell lapi = new Dell();
		Hp lapi1  = new Hp();
		Lenovo lapi2 = new Lenovo ();
		
		System.out.println("..............Dell..................");
		lapi.havingKeyboard();
		lapi.havingGames();
		lapi.havingFingerPrint();
		lapi.havingSpeakers();
		lapi.havingBasePanel();
		lapi.havingCamera();
		lapi.giveStorage();
		
		System.out.println(".............Hp...............");
		lapi1.havingKeyboard();
		lapi1.havingGames();
		lapi1.havingFingerPrint();
		lapi1.havingSpeakers();
		lapi1.havingBasePanel();
		lapi1.havingCamera();
		lapi1.giveStorage();
		
		
		System.out.println("..............Lenovo...........");
		lapi2.havingKeyboard();
		lapi2.havingGames();
		lapi2.havingFingerPrint();
		lapi2.havingSpeakers();
		lapi2.havingBasePanel();
		lapi2.havingCamera();
		lapi2.giveStorage();
		
		
		
		
		
	}

}
