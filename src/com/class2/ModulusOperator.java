package com.class2;

public class ModulusOperator {
	public static void main(String[] args) {
		
		float num1=12.5f;
		float num2=3.5f;
		float div=num1/num2;
		System.out.println(div);
		
		int number1=13;
		int number2=14;
		int divOfIntegers=number1/number2;
		System.out.println(divOfIntegers);
		
		double d=12;
		System.out.println(d);
		
		//int i=12.5 connot convert from double
		
		//modulus gives remaining of the division;
		int a=12;
		int b=2;
		int remainder=a%b;// 0(bolumunden kalan)
		System.out.println(remainder);
		
		//any arithmetic operation in Java will follow precedence rule
		
	//parantesis,	division/multiplication,modulus, addition/subtruction
		
		
		int myNumber1=(8+8)*2;
		System.out.println(myNumber1);
		int myNumber2=8+8%2;
		System.out.println(myNumber2);
		

	}

}
