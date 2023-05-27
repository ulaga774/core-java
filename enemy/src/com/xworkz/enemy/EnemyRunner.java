package com.xworkz.enemy;

import com.sun.jdi.ByteValue;

public class EnemyRunner {

	public static void main(String[] args) {
		System.out.println("-------byte--------");
		Byte a = Byte.valueOf((byte) 1);
		Byte b = Byte.valueOf((byte) 2);
		Byte c = (byte) 3;
		Byte d = (byte) 4;
		Byte e = a.byteValue();
		System.out.println(e);
		Byte f = a;
		System.out.println(f);
		System.out.println("---------short------------");
		Short a1 = Short.valueOf((short) 1);
		Short b2 = Short.valueOf((short) 2);
		Short c2 = (short) 3;
		Short d2 = (short) 4;
		Short e2 = d2.shortValue();
		System.out.println(e2);
		Short f2 = d2;
		System.out.println(f2);
		System.out.println("--------------int-----------");
		Integer a3 = Integer.valueOf(1);
		Integer b3 = Integer.valueOf(2);
		Integer c3 = 3;
		Integer d3 = 4;
		Integer e3 = c3.intValue();
		System.out.println(e3);
		Integer f3 = c3;
		System.out.println(f3);
		System.out.println("-------------long--------");
		Long a4 = Long.valueOf(1l);
		Long b4 = Long.valueOf(2l);
		Long c4 = 3l;
		Long d4 = 4l;
		Long e4 = b4.longValue();
		System.out.println(e4);
		Long f4 = b4;
		System.out.println(f4);
		System.out.println("-----------float------------");
		Float a5 = Float.valueOf(11.1f);
		Float b5 = Float.valueOf(2.2f);
		Float c5 = 3.3f;
		Float d5 = 4.4f;
		Float e5 = b5.floatValue();
		System.out.println(e5);
		Float f5 = b5;
		System.out.println(f5);
		System.out.println("-----------double------------");
		Double a6 = Double.valueOf(11.1d);
		Double b6 = Double.valueOf(23.2d);
		Double c6 = 3.3d;
		Double d6 = 4.4d;
		Double e6 = b6.doubleValue();
		System.out.println(e6);
		Double f6 = b6;
		System.out.println(f6);
		System.out.println("-----------Character------------");
		Character a7 = Character.valueOf('a');
		Character b7 = Character.valueOf('c');
		Character c7 = 'c';
		Character d7 = 'd';
		Character e7 = b7.charValue();
		System.out.println(e7);
		Character f7 = b7;
		System.out.println(f7);
		System.out.println("-----------boolean------------");
		Boolean a8 = Boolean.valueOf(false);
		Boolean b8 = Boolean.valueOf(true);
		Boolean c8 = false;
		Boolean d8 = true;
		Boolean e8 = b8.booleanValue();
		System.out.println(e8);
		Boolean f8 = b8;
		System.out.println(f8);

	}
	

}
