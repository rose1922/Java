package com.class18;

public class BuiltAndUserDefinedMethods {
	
	public static void main(String[] args) {
		
		// built in
		String str="Hello";
		str=str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
		
		BuiltAndUserDefinedMethods obj=new BuiltAndUserDefinedMethods();
		obj.myMethod();
		
		
		
		
		void myMethod() {
			System.out.println("This is user defined method that I created");
		}
	}

}
