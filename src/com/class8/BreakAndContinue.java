package com.class8;

public class BreakAndContinue {
	public static void main(String [] args) {
		
		for(int i=0 ; i<10; i++) {
			if(i==2) { 
				break;
			}
			System.out.println(i);
		}
		System.out.println("I am outsideof the loop");
		
		//continue-it will skip CURRENT iteration
		
		for(int i=1;  i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I am outside of the loop");
		System.out.println("****************************************");
		
		//  i want to print nums from 1 to 20 except 5,6,7
		
		for(int a=1; a<=20; a++) {
			if(a==5 || a==6 || a==7) {
				continue;
			}
		System.out.println(a);
	}
		for (int c=0; c<10; c++) {
             if(c==7) {
            	 break;
             }
             System.out.println(c);
		}
		System.out.println("I am outsideof the loop");
		System.out.println("************************");
	for(int d=1; d<=20; d++) {
		if(d>=5 && d<=17 ) {
			continue;
		}
		System.out.println(d);
	}
	}       		 

}