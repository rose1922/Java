package com.class8;

import java.util.Scanner;

public class carsamba {
	public static void main(String [] args) {
		boolean workDay=true;
		int day=1;
		while(workDay ) { 
		if(day==6 || day==7) {
			workDay=false;
			System.out.println("I do not need a day of anymore");
		}else {
			System.out.println("I need a day off");
		}
		day++;
		}
		
		Scanner scan=new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		 name=scan.nextLine();
		 int s=0;
		 while(s<3) {
		System.out.println("Hello "+name);
		s++;
		 }
		 System.out.println("*******************************");
		 
		 for(int i=1; i<=5; i++) {
			if(i==3 || i==4) {
			continue;
			}
			System.out.println(i);
			}
		 }
	}
	


