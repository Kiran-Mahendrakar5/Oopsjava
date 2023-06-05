package com.xworkz.wrapper1;

public class Runner {

	public static void main(String[] args) {
	Byte a = Byte.valueOf((byte)(1));
	Byte b = Byte.valueOf((byte)(2));
	byte c =a;
	byte d=b;
	System.out.println(c);
	System.out.println(d);
	
	Byte e = (byte)3;
	Byte f = (byte)4;
	System.out.println(e);
	System.out.println(f);
	
	byte g =a.byteValue();
	byte h=g;
	System.out.println(g);
	System.out.println(h);
	
	
	
	Boolean ref1 = Boolean.valueOf(true);
	Boolean ref2 = Boolean.valueOf(false);
	boolean ref3=ref1;
	boolean ref4=ref2;
	System.out.println(ref1);
	System.out.println(ref2);
	Boolean ref5 = (boolean)(true);
	Boolean ref6 = (boolean)(false);
	System.out.println(ref5);
	System.out.println(ref6);
	boolean ref7=ref1.booleanValue();
	boolean ref8=ref7;
	System.out.println(ref7);
	System.out.println(ref8);
	


	}

}
