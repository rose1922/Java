package com.class12;

public class StringMiniPulationDemo3 {

	public static void main(String[] args) {
		
		/*
		 * This method checks whether a String is empty or not'
		 * This method returns true if the given string
		 * 
		 */
		String str="";
		System.out.println("Is this string empty= "+str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty= "+str.isEmpty());
		
		System.out.println();
		
		// if(!str.Empty()){
		
		//
		
		System.out.println("****************************");
		/*
		 * This method appends one String
		 */
           String  str3="Hello ";
           String  str4="World";
           String  str5="People";
           
           System.out.println(str3+str4+str5);
           System.out.println(str3.concat(str4).concat(str5));
           
           System.out.println("***************************");
           /*
            * This method returns a copy of the string
            * 
            */
           String str6="How are you?";
           System.out.println(str6.trim());
           
           System.out.println("*************************");
           /*
            * This method returns the cracacter located at the 
            * 
            */
            String str7="We have be done early today";
            System.out.println(str7.charAt(3));
            
            
            System.out.println("********************************");
            
            /*
             * This method returns the index
             * 
             * 
             * 
             */
            String str8="We might mnot be done early";
            System.out.println(str8.indexOf('m'));
            System.out.println(str8.indexOf('z', 0));
            
            
	}

}
