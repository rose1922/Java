package com.review01;

public class IfElseDemo {

	public static void main(String[] args) {
		
		boolean tired=true;
		
		if(tired) {
			System.out.println("Go to sleep");
			System.out.println("Dont forget to wake up");
		}else {
			System.out.println("Study more");
			System.out.println("Continue studying");
		}
		System.out.println("Lets print the bigger number");
		int number1=5;
		int number2=10;
		if(number1>number2) {
			System.out.println("number1 is bigger,the value is "+number1);
		
		}else if(number2>number1) {
			System.out.println("number2 is bigger, the value is "+number2);
		}
		
		System.out.println("Lets do it Bayramguls way");
		if(number1>number2) {
			
			System.out.println("number1 is bigger the value is "+number1);
		}
		if(number2>number1) {
			System.out.println("number2 is bigger the value is "+number2);
			
		}else {
			System.out.println("number1 and number2 are equal,the value is "+number1);
		}
		
		

	}

}
