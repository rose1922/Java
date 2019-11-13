package com.class12;

public class StringMiniPulationDemo2 {

	public static void main(String[] args) {
		
	/*
	 * .contains();
	 * This method searches the sequence of characters in the string.
	 * If the sequences of characters are found,
	 * then it returns true otherwise returns false.
	 */
		String sentence="It was raining";
		String sen="raining";
		System.err.println(sen.contains(sentence));
		
		System.out.println(sentence.contains("was"));
		
		// Create two Strings and initaialize them with some value.
		//Implement the following methods on those strings.
		
		/*
		  * sen.length();
		  * sen.equals()
		  *sen.contains(s);
		  *sen.toUpperCase();
		  *sen.toLowerCase();
		  *sen.equalsIgnoreCase(anotherString);
		 */
		String str1=“I am a TeacHer”;
        String str2=” teacher”;
        
        int a=str1.length();
        System.out.println(a);
        
        System.out.println(“@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@“);
        
        boolean b=str1.equals(str2)    ;    
        System.out.println(b);        
        
        System.out.println(“@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@“);
        
        System.out.println(str1.contains(“a”));
        System.out.println(str1.contains(str2));
        
        System.out.println(“@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@“);
        
        //String str1=“I am a teacher”;
        str1=str1.toUpperCase();
        System.out.println(str1);
        
        System.out.println(“@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@“);
        
        str2=str2.toLowerCase();
        System.out.println(str2);
        
        System.out.println(“@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@“);
        
        System.out.println(str1.equalsIgnoreCase(str2));
        14
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
false
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
true
false
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
I AM A TEACHER
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
teacher
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		
