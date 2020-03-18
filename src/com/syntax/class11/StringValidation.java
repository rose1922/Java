package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		
		String str1="Welcome syntax students";
		String str2="Welcome Syntax students";
		
		//to compare 2 string
		
		System.out.println("------equals() equalsIgnoreCase() Function------");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home -Syntax Teechnologies";
		String actual="Home -Syntax Teechnologies ";
		
		if(actual.contentEquals(expected)) {
			System.out.println("Test case pass.Title are matched");
		}else {
			System.out.println("Test case fails.Title are NOT matched");
		}
		
		System.out.println("----------First Trim And Compare--------");
		
		if(actual.trim().equals(expected)) {
			System.out.println("Test case pass.Title are matched");
		}else {
			System.out.println("Test case fails.Title are NOT matched");
		}
		
		String browser="Chrome";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		// OR
		
		if(browser.toLowerCase().contentEquals("chrome"));
		System.out.println("Test executed on chrome browser");
	    }
		

	}


