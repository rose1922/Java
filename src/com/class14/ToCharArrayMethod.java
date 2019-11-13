package com.class14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		String str="Syntax";// String den char a cevirdi
		
		str.toCharArray();
		System.out.println(str.toCharArray());
		
		char[] array=str.toCharArray();
		
		for(char i:array) {
			System.out.println(i);
		}
		
		

	}

}
