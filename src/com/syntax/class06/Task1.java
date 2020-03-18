package com.syntax.class06;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		//Ask user to enter their country and capture it.
		//Once values are captured print which language user speaks.
       
		Scanner scan;
		String country;
		String language;
		scan=new Scanner(System.in);
		System.out.println("Where is the country");
		country=scan.nextLine();
		
		switch(country){ 
		case "Turkey":
			language="Turkish";
			break;
		case "USA":
			language="English";
			break;
		case "Pakistan":
			language="Urdu";
			break;
		case "Germany":
			language="German";
			break;
			default:
				language="Unknown";
				}
		System.out.println("Your contry language is "+language);

	}

}
