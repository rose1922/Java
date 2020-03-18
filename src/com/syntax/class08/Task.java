package com.syntax.class08;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		//TASK 1
		//Print numbers from 1 to 50 except those that are divisible by 3
		 
		for(int i=1; i<=50;i++) {
			
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		
		// TASK 2
	    //Create a program that will be asking user to apply for a credit card 10 times.
		//As soon you get an “yes” from a user program should stop asking.
		Scanner scan=new Scanner(System.in);
		for(int i=1; i<=10;i++) {
			System.out.println("Did you apply for a credit card?");
			String answer=scan.next();
		if(answer.equals("Yes")) {
			System.out.println("Congratulations");
			break;
		
		}

	}

	}}
