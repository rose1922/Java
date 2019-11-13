package com.class14;

public class Task {

	public static void main(String[] args) {
		            //TASK 1
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
		String str="Whats your name? How old are you";
		
		String str1=str.replace(" ","");
		System.out.println(str1);
		
		System.out.println("***********");
		
	   //TASK2
		//Create a String that should be combination of letters, numbers and special characters.
		//Find out how many alpha characters are there in the String.
		
		String str2="#$5446Hello&**(())";
		System.out.println(str2.replaceAll("[^A-Z-a-z]", ""));
		String str3=str2.replaceAll("[^A-Z-a-z]", "");
		System.out.println(str3.length());
		
		System.out.println("***************");
		
	   //TASK3
		//You have a String a=”Is it saturday? Is it raining?
		//Do we have a Java Class today?” How would you find out how many sentences are in that String?
          
				String a="Is it saturday? Is it raining?"
						+ "Do we have a Java Class today";
		        String[]array=a.split("\\?");
		        for(int i=0; i<array.length; i++) {
		        	System.out.println(array.length);
		        	
		        	
		        	System.out.println("-------");
		        	//String str1 = "Is it saturday? Is it raining? Do we have a Java Class today?"; // String[]array=str.split(",")
		        	//String[] array = str1.split("\\?");
		        	//System.out.println(array.length);    	
		
		        }}
	}


