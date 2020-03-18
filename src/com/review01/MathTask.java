package com.review01;

public class MathTask {

	public static void main(String[] args) {
		
		// you dont 
		
		int result=9/10;//0.9
				System.out.println("The result is "+result);
				
		int mod=29%10;
		System.out.println("The reminder of division is "+mod);
		
		double doubleResult=20/10;
		System.out.println("The doubleResult of division is "+doubleResult);
        
		int intNumber=25;//type conversion
		double doubleNumber=intNumber;
		
		System.out.println("the double number is "+doubleNumber);
		
		
		//19 is between -128and 127
		int numberInt=19;
		byte numberByte=(byte)numberInt;//buyugu kucuge cevirirken paranteze aliyoruz
		System.out.println("the byte value is "+numberByte);
		
		//260 is bigger than 256
		numberByte=80;
		numberInt=numberByte;
		System.out.println("The int value is  "+numberInt);
		
		
		
	}

}
