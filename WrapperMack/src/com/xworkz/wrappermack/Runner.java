package com.xworkz.wrappermack;

public class Runner {
	public static void main(String[] args) {
		
		Byte a= Byte.valueOf((byte)(10));
		Byte b= Byte.valueOf((byte)(20));
		byte c=a;
		byte d=b;
		System.out.println(c);
		System.out.println(d);
		
		Byte e=(byte)30;
		Byte f=(byte)40;
		System.out.println(e);
		System.out.println(f);
		
		
		byte g=a.byteValue();
		byte h=g;
		System.out.println(g);
		System.out.println(h);
		
	}

}
