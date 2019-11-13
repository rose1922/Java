package com.class12;

public class StringMiniPulationDemo {

	public static void main(String[] args) {
		
		// There are two ways to create string objects
		//1
		//String Literal
		String name="jhon";
		
		System.out.println(name);
		System.out.println("The length of nameis= "+name.length());
				 
				
				//2
				//creating String with new key word
		     String name1=new String("John1");
		     
		     /*This method returns the length of this string.
		      * The length is equal to the number
		      * of 16-bit Unicode characters in the string
		      */
		     int name1Len=name.length();
		     System.out.println("the length of name1 is= "+name1Len);
		     
		     System.out.println("*************************");
		     
		     String str1="Hello woRld";
		     System.out.println("Before:: "+str1);
		     str1=str1.toLowerCase();
		     System.out.println("After:: "+str1);
		     
		     //.equals()
		     String str2="HElLo WoRld";
		     
		     boolean isEqual=str1.equals(str2);
		     System.out.println(isEqual);
		     
		     
		     //.equalsIgnoreCase();
		     // This method does not care for capitalization and compare the
		     //content only
		     
		     
		     System.out.println(str1.equalsIgnoreCase(str2));
		     
		     // toUpperCase();
		     
		     
		     String str3="Mohammad";
		     System.out.println("Before :: "+str3);
		     str3=str3.toUpperCase();
		     System.out.println("After:: "+str3);
		     
				
		
		
	}

}
