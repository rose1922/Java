package com.syntax.class08;

public class LoopsMoreReview {

	public static void main(String[] args) {
		// to print number from 50 to 1
		
		for(int i=50;i>=1;i--) {
			System.out.println(i);
		}
		//print odd numbers between 20 and 50
		
		for(int i=20; i<=50;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		//2 yol
		
		for(int i=21;i<=50;i+=2) {
			System.out.println(i);
		}
		//what is the output
		
		int total=2;
		for(int k=1;k<4;k++) {
			total=total*k;
		}
		System.out.println("Final total "+total);
		
      //write a program to calculate sum of odds and sum even numbers
	 // 1 to 99
		int sum=0;
		for(int a=1; a<=99;a+=2) {
			sum=sum+a;
		}
		System.out.println("Odd numbers "+sum);
		
		int sum1=0;
		for(int b=1; b<=99;b++) {
			if(b%2==1) {
				sum1=sum1+b;
			}
		}
		System.out.println("Even numbers "+sum1);
			}
		}
		
		
	


