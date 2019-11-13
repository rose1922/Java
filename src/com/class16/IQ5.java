package com.class16;

import java.lang.reflect.Array;

public class IQ5 {

	public static void main(String[] args) {
		String given="Welcome to the Java class";
		/*to reverse String
		 * split();
		 * Step1: split-->array of String
		 * Step2: use for loop and use decrement to prints values
		 */
		String reversed="";
		String [] str= given.split("\\s");
		for(int j=str.length-1 ; j>0; j--) {//  j>=0; j-=2 yi dene
			// System.out.println(str[j]);
			reversed=reversed+str[j]+" ";
		}
		System.out.println(reversed);
		
		// Write a java program to reverse String?
		//toCharArray();charAt();
		
		String given1="Today is Java Class";
		String replaced1="";
		char []charArray=given1.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
		
		////////////////
		System.out.println("Using charAt");
		String Word3="I love Java";
		String reversed2="";
		for(int i=Word3.length()-1; i>=0; i--) {
			reversed2=reversed2+Word3.charAt(i);
			
		}////// kontrol et
		
		
		

	}

}
