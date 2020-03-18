package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefinedMethods {
	
	public static void main(String[] args) {
		//built in
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		System.out.println("****************");
		
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		System.out.println(name);// name yerine scannerStrings
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
	}
	
	void myMethod() //method header
	{ //method body
		System.out.println("This is user defined method that I created");
	}
}
	
	


