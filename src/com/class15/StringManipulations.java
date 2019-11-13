package com.class15;

public class StringManipulations {

	public static void main(String[] args) {
		//String class comes in java lang package

		// 2 ways to creat a String
		//first way using String literal
		String str="Hello";
		
		//second way using new keyword-creating a String object
		
		String str1=new String("hello");
		System.out.println(str);
		System.out.println(str1);
		//find the of characters inside the String
		int length=str.length();
				System.out.println(length);
		// case conversion methods/functions
		
		str=str.toLowerCase().toUpperCase;//HELLO
		System.out.println(str);//HELLO
		
		
		//verify if there is any charecters in the String is Empty
		
		String myString="";// empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		String myString1=null;//no value at all it is equal to
		//String myString1;
		System.out.println(myString1.isEmpty());
		
		// how to verify existence of charracters in th string
		String a="Good evening students";
		boolean exist=a.contains("Student");
		System.out.println(exist);
		
	     System.out.println(a.starsWith("Good"));
	     System.out.println(a.endsWith("student"));
	}

}
