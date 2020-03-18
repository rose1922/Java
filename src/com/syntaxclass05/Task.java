package com.syntaxclass05;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
    //TASK 1
  //Prompt the user to enter person heights in inches.
		//Person should be classified as one of the following:
    //short (under 60 inch)
  //medium(between 60 -72 inch)
  //tall (over 72 inch)
		
		Scanner scan=new Scanner(System.in);
		
	
		System.out.println("enter your heights in inches");
		
	int heigth=scan.nextInt();
	if(heigth>0 && heigth<=60) {
		System.out.println("You are short");
	}else if(heigth>=61 && heigth<=72) {
		System.out.println("You are medium");
	}else if(heigth>72) {
		System.out.println("You are tall");
	}else {
		System.out.println("Invalid heigth");
	}
		
	
		
		

	}

}
