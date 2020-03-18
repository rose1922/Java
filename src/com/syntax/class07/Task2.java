package com.syntax.class07;

import java.util.Scanner;

public class Task2 {
	//TASK
			//we are playing alottery and a lucky number is 17;
			// we wnt to keep asking user any number from1-20
			//until he guess the lucky number--->congrats

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int number;
		int luckyNumber=17;
		
		do {
			System.out.println("Please enter any number from 1 to 20");
			number=scan.nextInt();
		}while(number!=luckyNumber);
		System.out.println("You got it!!!!!!");
	

	}

}
