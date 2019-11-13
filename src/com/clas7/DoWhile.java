package com.clas7;

public class DoWhile {
	public static void main(String[] args) {
		
		int num=1;//while loop
		while(num<=7) {
			System.out.println("Hello");
			num++;
		}
		
		int num1=10;//do while loop
		do {
			System.out.println("Bye");
			num1++;
		while(num1<=7) {
		
		System.out.println("*************************");
		}
}
	


        // print even numbers from 20 to 50 using do while

        int even=20;
        do {
        	System.out.println(even);
        	even+=2;
        while(even<=50) {
        
        System.out.println("------------------Second Way----------------------");
        // 2 way
        do {
        	if(even%2==0) {
        		System.out.println(even);
        	}
        	even++;
        while(even<49) {
        }
        }             
        
	

