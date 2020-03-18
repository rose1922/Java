package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Ayse";
		String lastName="Oz";
		char grade='B';
		String city="Stafford";
		String state="Texas";
		long phoneNumber=5206669095l;
		
		//String city="Chantilly"-->error saying duplic 
		city="Chantilly";
		
		phoneNumber=3456789765l;
		
		//System.out.println(city);
		System.out.println("My name is "+name+" and my last name is "+lastName+"." );
        System.out.println("I live in city of "+city+" state "+state+"and my phone number is "+phoneNumber+"!");
	}

}
