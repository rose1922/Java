package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		
		// print only text and not numbers
		 String str="14234Hel45645lo465456";//Hello
		 
		 System.out.println("************");
		 System.out.println(str.replaceAll("[0-9]", ""));// leave only text
		 
		 System.out.println("*****************");
		 System.out.println(str.replaceAll("[a-zA-Z]", ""));// leave only numbers
		 
		 System.out.println("*************************");
		 
		 
		 
		 String str2="Hi#$%How#$%#$4356346";
		 System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
		 System.out.println("***************");
		/// System.out.println(str2.replace("How", ""));(bunu sor)
		 
		 System.out.println(str2.replaceAll("\\w", ""));
	}

}
