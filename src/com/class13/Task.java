package com.class13;

public class Task {

	public static void main(String[] args) {
		
	              //  TASK 1
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		
		String day="Sunday";
		// System.out.println(day.charAt(5)+" "+day.charAt(4)+" 
		    for(int i=day.length()-1 ; i>=0 ; i--) {//o dan baslarsa -1 yaziyoruz 
		    	//1 den baslarsa yazmiyoruz
		    System.out.print(day.charAt(i));
	        }
	         
		         
	  //   TASK 2
		             
		//Create a String and if the String is not empty perform the following:
		//if the String has an odd number of characters and has 3 or more characters, 
		//	print the character in the middle of the String.
		
		    String str1="Hellourwewr";
	        
	        int lenght=str1.length();
	        int middle=str1.length()/2;
	        
	        System.out.println();
	        if(!str1.isEmpty()) {
	            if(lenght%2!=0 && lenght>=3) {
	                System.out.println(str1.charAt(middle));
	        
	       
	        
	}
}}}
	       


