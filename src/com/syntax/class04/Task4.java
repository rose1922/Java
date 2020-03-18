package com.syntax.class04;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		   //  Create a Java program that will ask if user has a credit card or not.
		    // If you user does not have a credit card then offer them.
		    //  If they do have one ask what is balance on the card?
			//	If balance of the card is larger than 1000,  
			//tell them to pay off immediately, otherwise you can tell them that they can spend more.
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Do you have a credit card? true or false");
		
		boolean card=input.nextBoolean();
		
		if (card) {
			System.out.println("What is the balance on your card");
			int balance=input.nextInt();
			if (balance>1000){
				System.out.println("Please payy off your balance");
				
			}else {
				System.out.println("You can spend more money");
			}
		}else {
			System.out.println("Would you like to apply for credit card");
		}
		
		//Write a program to ask user to enter numbers of worked years and annual salary.
		//If user worked for more or equals to 5 years than user is eligible for the bonus,
		//otherwise he is not. Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
		
		System.out.println("---------------");
		
		System.out.println("how long year work");

		
	}

}

		

