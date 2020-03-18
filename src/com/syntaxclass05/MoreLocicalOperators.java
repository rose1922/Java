package com.syntaxclass05;

public class MoreLocicalOperators {

	public static void main(String[] args) {
		/*We have total 7 days in a week
		 * if day is 2,3--->SDLC class
		 * if day 6,7 -->Java Class 
		 * if day 1,6 -->off day
		 * if day4-->review class
		 */
		int  day=6;
		day=7;
		
		if(day==2 && day==3) {
			System.out.println("Today is SDLC class");
		}else if(day==6 && day==7) {
			System.out.println("Today is Java class");
		}else if(day==1 && day==5) {
			System.out.println("Today is nuo class,it is day off");
		}else if(day==4) {
			System.out.println("Today is review class with Elion");
		}else {
			System.out.println("Invalid day");
		}
		System.out.println("-------using String-------");
        
		String day1 = "Saturday";
		if (day1.contentEquals("Thuesday") || day1.equals("Wed")) {
			System.out.println("SDLC Class");
		} else if (day1.equals("Saturday") || day1.equals("Sunday")) {
			System.out.println("JAVA Class");
		} else if (day1.equals("monday") || day1.equals("Friday")) {
			System.out.println("review Class");
		}else {
			System.out.println("Invalid day");
		}
	}
}
    		
	


