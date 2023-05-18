package com.xworkz.wrapper;

public class WrapperRunner {
	
	public static void main(String[] args) {
		
		
		//manula wrapping
		Byte ref = Byte.valueOf((byte)10);
		Byte ref1 = Byte.valueOf((byte)20);
		byte a1= ref;
		byte b1=ref1;
		System.out.println(a1);
		System.out.println(b1);
		
		System.out.println("...........................");
		
		//giving to compiler
		Byte ref2 = (byte)30;
		System.out.println(ref2);
		Byte ref4 = (byte)40;
		System.out.println(ref4);
		
		System.out.println(".............................");
		
		//manually getting data
		byte a = ref.byteValue();
		System.out.println(a);
		//automatically getting data
		byte b = a;
		System.out.println(b);
		
		System.out.println("..............................");
		
		
		System.out.println("SHORT");
		
		Short sh = Short.valueOf((short)11);
		Short sh1 = Short.valueOf((short)12);
		short sh3=sh;
		System.out.println(sh3);
		short sh4=sh1;
		System.out.println(sh4);
		
		System.out.println(".........................");
	
		Short sh5 = (short)13;
		System.out.println(sh5);
		Short sh6 = (short)14;
		System.out.println(sh6);
		
		System.out.println(".........manual@automatic..................");
		//manually getting data
		short s7 = sh.shortValue();
		System.out.println(s7);
		//automatically getting data
		short s8 =s7;
		System.out.println(s8);
		
		
		System.out.println("......................INT.................");
		Integer in1 = Integer.valueOf(15678);
		Integer in2 = Integer.valueOf(15679);
		int in3 =in1;
		System.out.println(in3);
		int in4 = in2;
		System.out.println(in4);
		
		System.out.println("...................................");
		Integer in5 = (Integer)15670;
		System.out.println(in5);
		Integer in6 = (Integer)15671;
		System.out.println(in6);
		
		System.out.println(".........manual@automatic.................");
		//manually getting data
		int in7 = in1.intValue();
		System.out.println(in7);
		//automatically getting data
		int in8 = in7;
		System.out.println(in8);
		
		System.out.println(".............LONG..................");
		Long lo1 = Long.valueOf(17463738L);
		Long lo2 = Long.valueOf(4547676L);
		long lo3 = lo1;
		System.out.println(lo3);
		long lo4 = lo2;
		System.out.println(lo4);
		System.out.println(".................................");
		
		Long lo5 = (Long)757656L;
		System.out.println(lo5);
		Long lo6 = (Long)876765L;
		System.out.println(lo6);
		
		System.out.println(".........manual@automatic.................");
		//manually getting data
		long lo7 = lo1.longValue();
		System.out.println(lo7);
		long lo8 = lo7;
		System.out.println(lo8);
		
		System.out.println("...........FLOAT..................");
		Float fl1 = Float.valueOf(75.78f);
		Float fl2 = Float.valueOf(67.98f);
		float fl3 = fl1;
		System.out.println(fl3);
		float fl4 =fl2;
		System.out.println(fl4);
		
		//giving to compiler
		Float fl5 = (float)45.67f;
		System.out.println(fl5);
		Float fl6 = (float)66.89f;
		System.out.println(fl6);
		
		System.out.println("..................manual&automic............");
		//manually getting data
		long fl7 = fl1.longValue();
		System.out.println(fl7);
		long fl8 = fl7;
		System.out.println(fl8);
		
		System.out.println("................DOUBLE......................");
		Double dou1 = Double.valueOf(4.6d);
		Double dou2 = Double.valueOf(6.8d);
		double dol3 =dou1;
		System.out.println(dol3);
		double dol4 = dou2;
		System.out.println(dol4);
		
		System.out.println(".....................................");
		Double dol5 =(double)5.7d;
		System.out.println(dol5);
		Double dol6 = (double)6.9d;
		System.out.println(dol6);
		
		System.out.println("..................manual&automic............");
		//manually getting data
		double dol7 =dou1.doubleValue();
		System.out.println(dol7);
		double dol8=dol7;
		System.out.println(dol8);
		
		System.out.println("...............CHARACTER.................");
		Character ch1 = Character.valueOf('A');
		Character ch2 = Character.valueOf('B');
		char ch3 = ch1;
		System.out.println(ch3);
		char ch4 = ch2;
		System.out.println(ch4);
		
		System.out.println(".......................................");
		
		Character ch5 = (char)'D';
		System.out.println(ch5);
		Character ch6 = (char)'E';
		System.out.println(ch6);
		
		System.out.println("..................manual&automic............");
		//manually getting data
		char ch7 = ch1.charValue();
		System.out.println(ch7);
		char ch8 = ch7;
		System.out.println(ch8);
		
		System.out.println(".............BOOLEAN....................");
		Boolean bo1 = Boolean.valueOf(true);
		Boolean bo2 = Boolean.valueOf(false);
		boolean bo3 = bo1;
		System.out.println(bo3);
		boolean bo4 = bo2;
		System.out.println(bo4);
		System.out.println("................................");
		
		Boolean bo5 = (boolean)true;
		System.out.println(bo5);
		Boolean bo6 = (boolean)false;
		System.out.println(bo6);
		
		System.out.println("................manual&automic..............");
	    boolean bo7 = bo1.booleanValue();
	    System.out.println(bo7);
	    boolean bo8 = bo7;
	    System.out.println(bo8);
	    
	}
}
