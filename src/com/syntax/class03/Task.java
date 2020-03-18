package com.syntax.class03;

public class Task {
	
	public static void main(String [] args) {
		//task1
		
		//create a Java program and name it Double Comparison.
		//Declare 2 double values and if value of first variable is higher then the second,
		//print “Double value __ is larger than __ .” Otherwise print...
		
		double num=98.9;
		double num1=69.34;
		
		if(num>num1) {
			System.out.println("Double value "+num+" is larger than "+num1);
		}else {
			System.out.println("num is not larger than num1");
		}
		
		//task 2
		
	  //  Create a Java program and name it Temperature Check.
		//Create variable to store temperature.
		//Your program should check if temperature is below 32 then it should print
		//“Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“
		
		int temp=40;
		int freezeTemp=32;
		
		if(temp<freezeTemp) {
			System.out.println("Water will freeze with tempereture");
		}else {
			
			System.out.println("Water will not freez with tempereture");
		}
		
		System.out.println("-----------------------------------");
		
		boolean flag=false;
		
		if(flag) {
			System.out.println("Hello");
		}else {
			System.out.println("Bye");
		}
		
		
		
	}

}
