package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		
		double numberOne=10;
		double numberTwo=10;
		if(numberOne>numberTwo) {
			
			System.out.println("Number one is larger than number 2");
		}else if(numberOne<numberTwo) {
			System.out.println("Number one is smaller than number 2");
		}else {
			
			System.out.println("Number one is equal number2");
			
		}
		System.out.println("-------------------------------");
		
		//declare variable for a day and then based on the value we will pro?
		// OUTPUT
		
		int day=6;
		
		if(day==1) {
			System.out.println("it is Monday,no class today ");
			
		}else if(day==2) {
			System.out.println("it is Tuesday, we have SDLS class");
		}else if(day==3) {
			System.out.println("it is wednesday,we have SDLS class");
		}else if(day==4) {
			System.out.println("it is Thursday,we have review class");
		}else if(day==5) {
			System.out.println("it is friday,no class");
		}else if(day==6) {
			System.out.println("it is saturday.we have Java class");
		}else {
			System.out.println("Invalid weekday");
		}
		
		

	}

}
