package com.class26;

public class FullTime extends Employee{
		
		int bonus;
		
		public void getPaid() {//overriding
			
			System.out.println("Full time Employee gets paid "+salary+" and bonus "+bonus);
		}
	}


