package com.syntax.class04;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//Create a Java program that will ask user to input city and temperature.
				//Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
				 
				 System.out.println("Please enter the city");
				 
				 String city=scan.nextLine();
				 
				 System.out.println("Please enter the temperature fahrenheit");
				 
				 int fah=scan.nextInt();
				 
				 //(F-32)*5/9=C
				 int celc=(fah-32)*5/9;
				 
				 System.out.println("the temparature is the city "+city+" is "+celc+" celsius");
				 

	}

}
