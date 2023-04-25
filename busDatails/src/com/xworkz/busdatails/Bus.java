package com.xworkz.busdatails;

public class Bus {
	static int noOfTyres;
	static int noOfDoors;
	static int noOfMirror;
	static int noOfGears;
	public int speedMeter;
	public String engineName;
	private short noOfSeat;
	private String busName;
	protected static long engineserialNumber;
	protected static int busNumber;
	Drives drivesTypes;
	
	

	
	public Bus(int speedMeter,String engineName,short noOfSeat,String busName,long engineserialNumber,int busNumber ) {
		this.speedMeter=speedMeter;
		this.engineName=engineName;
		this.noOfSeat=noOfSeat;
		this.busName=busName;
		this.engineserialNumber=engineserialNumber;
		this.busNumber=busNumber;
		
	}
	public String givecomfortTraveling() {
		System.out.println("private with non static");
		System.out.println(noOfSeat);
		System.out.println(busName);
		return "make transport";
	}
	static {
		noOfTyres=4;
		noOfDoors=2;
		noOfMirror=3;
		noOfGears=6;
	}
	public static void giveComfortable() {
		System.out.println("defoult with non static");
		System.out.println(Bus.noOfTyres);
		System.out.println(Bus.noOfDoors);
		System.out.println(Bus.noOfMirror);
		System.out.println(Bus.noOfGears);
	}
	public static void schoolTransport() {
		System.out.println("give protection from rain");
		
	}
	public static void provideTelevision() {
		System.out.println("make entertainment");
	
	}
	public static void  makeTourism() {
		System.out.println("make happy");
	}
	
	
}
