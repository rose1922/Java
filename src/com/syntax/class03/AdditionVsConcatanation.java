package com.syntax.class03;

public class AdditionVsConcatanation {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String x="Hello";
		String y="Bye";
		
		System.out.println(a+b+x+y);//30HelloBye
		System.out.println(a+x+b+y);//10HelloBye
		System.out.println(x+y+a+b);//
		System.out.println(x+y+(a+b));
		
		//1020HelloBye
		System.out.println(a+""+b+x+y);
	}

}
