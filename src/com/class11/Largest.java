 package com.class11;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		 System.out.println("Please enter the number...");
		 
	        int number=scan.nextInt();
	        boolean is=true;
	        int a=2;
	        for(a=2;a<number;a++) {
	            if(number%a==0) {
	                is=false;
	                break;
	            }
	                
	        }
	        if(is) {
	           System.out.println("YES");
	        }else
	            System.out.println("NO");


		
		
		
		
		
	}
		

}
