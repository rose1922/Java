package com.class16;

public class IO8 {
	
	public static void main(String[] args) {
		
		int a,b,c;
		
		a=0;
		b=1;
		for(int i=0; i<10; i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		

	}

}