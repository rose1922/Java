package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		
		String str="Syntax Tecnologies";
		
		char letter=str.charAt(5);
		System.out.println(letter);
		//legth=19
		//System.out.println(str.charAt(str.length()));// StringIndexOutOfBounds
		System.out.println(str.charAt(str.length()-1));
		
		// get a substring from aString
		//Syntax
		String substr1=str.substring(0,6);
		System.out.println(substr1);
		//Tecnologies Inc
		String substr2=str.substring(7);
		System.out.println(substr2);
		

	}

}
