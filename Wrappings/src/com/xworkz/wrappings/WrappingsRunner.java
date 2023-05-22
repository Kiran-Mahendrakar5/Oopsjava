package com.xworkz.wrappings;

public class WrappingsRunner {
	public static void main(String[] args) {
		
		Byte b1 = Byte.valueOf((byte)30);
		Byte b2 = Byte.valueOf((byte)40);
		byte b3 = b1;
		byte b4=b2;
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("........................");
		
		Byte b5 = (byte)45;
		System.out.println(b5);
        Byte b6  = (byte)55;	
        System.out.println(b6);
        
        byte b7 = b1.byteValue();
        System.out.println(b7);
        byte b8 = b7;
        System.out.println(b8);
		
	}

}
