package com.syntax.class12;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Write a program that reads two people’s first names and if they expecting boy or girl?
		//Based on the input suggests a name for a baby:
		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? boy
		//Suggested baby name: DANRY
		//Example Output:
		//Mom’s first name? Mary
		//Dad’s first name? Daniel
		//Boy or Girl? girl
		//Suggested baby name: MAIEL
		
		Scanner scan=new Scanner(System.in);
		System.out.println("what is moms first name");
		String name=scan.next();
		System.out.println("What is dads first name");
		String name2=scan.next();
		System.out.println("boy and girl");
		String boyGirl=input.next();
		
		if(boyGirl.equals("girl")) {
			System.out.println(name.substring(0;2));
		}
		
		
	}

}
