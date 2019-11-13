package com.class6;

import java.util.Scanner;

public class Alistirma {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter a day number");
		int day=input.nextInt();
		if (day>=1 && day<=5) {
			System.out.println("it is a weekday");
			
		}else if (day>=6 && day<=7) {
			System.out.println("It is a weekend");
			
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("Please enter your height in fit");
		
		int h=7;
		if(h<5) {
			System.out.println("short");
			
		}else if (h>=5 && h<6) {
			System.out.println("medium");
			
		}else {
			System.out.println("6 feet and over");
		
		}
	}

}
