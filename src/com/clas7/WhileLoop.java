package com.clas7;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String [] args) {
		
		  
     int time=8;
    
    if(time<12) {
        System.out.println("Good morning");// code executes 1
    }
     while (time<12) {// while condition is true
         System.out.println("Good morning");
         time++;
     }
     // i want to print GA 5 times
     
     int i=-1;
     
     while(i<4)
     {
    	 System.out.println("Good afternoon");
    	 i++;
     }
     System.out.println("Outside of while loop");
     ///
     
     
	    
	  	 

    System.out.println("****************************");

    /*You need ask user to pay for coffee
     * You need to keep asking user to pay for it untill
     * entered price is equal=5;
     * After user paid then say "Enjoy your coffee!"
     */
     Scanner scan= new Scanner(System.in);
     
     int price=5;
     while(price<=5) {
     System.out.println(" Please pay for coffee");
      price=scan.nextInt();
     price++;
     }
     System.out.println(" Thanks you and enjoy your coffee");
}
}