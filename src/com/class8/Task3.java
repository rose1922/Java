package com.class8;

import java.util.Scanner;

 public class Task3 {
	public static void main(String[] args){
		//print numbers from 1 to 50 except those that are divisible by 3
		
		for(int i=1; i<=50; i++) {
			if (i%3==0) {
				continue;
			}
			
			System.out.println(i);
		}
	
		//creat a program that will be asking user the apply
		// for a credit cart 10 times.Ass soon you get an"yes"
		// from a user program should stop asking.
		String card;
		Scanner scan=new Scanner(System.in);
		for(int q=1; q<=10; q++) {
			System.out.println("Are you apply to a credit card");
			card=scan.nextLine();
			if(card.equalsIgnoreCase("Yes")){
					break;
				
		}
		
	}


/////////////////////////////////////////
            for(int i=1;   i<=3;  i++) {
            	System.out.println(i);
            	for(int y=1;  y<=3;  y++) {
            		System.out.println(y);
            	}
            }
	}
	
 }

