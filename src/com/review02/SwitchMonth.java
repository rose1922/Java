package com.review02;

import java.util.Scanner;

public class SwitchMonth {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
​
		System.out.println("Enter a number for the month:");
		int month = scan.nextInt();
​
 	//	System.out.println("The month you entered is " + month);
​
		String monthString ="";
​
		switch (month) {
		case 1:
			monthString = "January";
			break;
		case 2:
			monthString = "February";
			break;
		case 3:
			monthString = "March";
			break;
		case 4:
			monthString = "April";
//			break; //If we comment the break, the next lines will be executed
		case 5:
			monthString = "May";
			break;
		case 6:
			monthString = "June";
			break;
		case 7:
			monthString = "July";
			break;
		case 8:
			monthString = "August";
			break;
		case 9:
			monthString = "September";
			break;
		case 10:
			monthString = "October";
			break;
		case 11:
			monthString = "November";
			break;
		case 12:
			monthString = "December";
			break;
		default:
			monthString = "Invalid";
			break;//optional
		}
​
		System.out.println("The month is " + monthString);
​
	}

  
}
