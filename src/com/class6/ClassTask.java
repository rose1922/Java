package com.class6;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		/*ask user to enter the moth they were born
		 * based on the month define the season
		 * if user is born in Jan,feb,dec-->winter
		 * if mar,apr,may-->spring
		 * if jun,jul,aug-->summer
		 * if sep,oct,nov-->fall
		 * otherwise-->unknown
		 * at the end of the program
		 * "you were born in_______"
		 */
		String month;
		Scanner scan=new Scanner(System.in) ;
		month=scan.nextLine();
		System.out.println("Month of born");
		String season;
		season=scan.nextLine();
		
		if(month.equals("January")|| month.equals("February")||month.equals("December")){
			season="Winter";
			
		}else if (month.equals("March") || month.equals("April")||month.equals("May")){
		
		season="Spring";
		
	    }else if (month.equals("September") || month.equals("October") || month.equals("Nowember")){
		season="Summer";
		else {
			month="Unknown";
		}
		System.out.println("You are born in " +moth);
		System.out.println(month);


		
			
	  	    
		
	}

}
