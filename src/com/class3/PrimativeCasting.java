package com.class3;

public class PrimativeCasting {
	public static void main(String[] args) {
	//FYI - for your information	
		double d=12;
		System.out.println(d);
		
		//int i=12.0; compile time error
		//widwning or automatic or implicid casting
		
		byte b=127;
		int i=b;
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//narrowing or explicit or manual casting
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);
	
		
		int num4=789;
		byte b2=(byte)num4;
		System.out.println(b1);
		
	}

}
