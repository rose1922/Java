package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoops {

	public static void main(String[] args) {
//we want to ask users name 5 times and print Good Afternoon______ 5times;
		Scanner input;
		String name=null;
		int num=1;
		
		input=new Scanner(System.in);
		while(num<=5) {
		System.out.println("What is your name");
		name=input.nextLine();
		System.out.println("Good afternoon "+name);
		num++;
		}
		//TASK
		//we are playing alottery and a lucky number is 17;
		// we wnt to keep asking user any number from1-20
		//until he guess the lucky number--->congrats
		
		
		
	}
}

		




