package com.syntax.class04;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		//You are a loan specialist and you need to ask user what is the amount of loan is needed.
		//If loan is less than 200,000 then you would lend the money otherwise you would reject the client
		
		Scanner scan=new Scanner(System.in);
		System.out.println("what is the amount of loan is need");
		 int loan=scan.nextInt();
		 if(loan<20000) {
			 System.out.println("You would lend the money");
		 }else {
			 System.out.println("you would reject the client");
		 }
		
		//You are DMV representative and you need to ask customer their age.
		//If they are 18 and older you will issue a driver licence to them,
		//otherwise you will offer them to get a learners permit.
		 
		 System.out.println("///////////////////");
		 
		 System.out.println("how old are you?");
		 int age=scan.nextInt();
		 if(age>=18) {
			 System.out.println("you can get a driver's license");
		 }else {
			 System.out.println("you will get a permit");
		 }
		 System.out.println("------------------------------");
		 
		 
	}
}
		 


		


		
		
		

	


