package com.syntaxclass05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		/*Take age input from a user and than based on the age print output
		 * if age from 0-3-->you are baby
		 * if age from 4-5-->you are kid
		 * if age from 6-12--.you are child
		 * if age from 13-19--> you are teenager
		 * if age from 20-64-->you are an adult
		 * if age is more or equal to 65-->you are a senior
		 */
    //1- let's declare all variables
		int age;
		Scanner scan;//to import ctrl+shift+o
		
		// 2.capture values
		scan=new Scanner(System.in);
		System.out.println("Please enter you are age");
		age=scan.nextInt();
		
		//3. perform verification
        if (age>0) {
        	  if(age<3) {
              System.out.println("You are a baby");
              }else if (age >=3 && age <=5) {
              System.out.println("You are a kid");
              }else if (age >=6 && age <=12) {
              System.out.println("You are a child");
              }else if (age>=13 && age <=19) {
               System.out.println("You are a teenager");
              }else if (age>=20 && age <65) {
              System.out.println("You are an adult");
              }else {
             System.out.println("Youa are enjoyng your life");
              }
        }else { 
        	System.out.println("Please enter valid age");
        }
    }
	}
	

		
		
	


