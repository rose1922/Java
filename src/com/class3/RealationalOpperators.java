package com.class3;

public class RealationalOpperators {
	
	public static void main(String[] args) {
		
		int num1=20;
		int num2=19;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println("***************");
		
		
		
		double d=1.99;
		double d1=2.99;
		
		
		boolean b5=d>d1;
		System.out.println(b5);//false
		
		
		
		boolean b1=d<d1;//true
		boolean b2=d==d1;//false
		boolean b3=d!=d1;//true
		
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		System.out.println("#####################");
		int a=90;
		int b=30;
		//if number a is bigger than number b
		//i want to print a is larger than b
		
		if (a>b) {
			System.out.println("a is larger than b");
			
		} else {
			System.out.println("a is a smaller than b");
		}
			
		int expectedHours=15;
		int actualHours=2;
		//if expected hours are more than actual-> you will succeed
		//otherwisw, please study more
		
		if(expectedHours>actualHours) {
			System.out.println("you will succeed");
		}else {
			System.out.println("please study more");
		}
		double teaPrice=4.99;
		double allowedPrice=3.99;
		teaPrice-=2;//2.99=4.99-2
		//if price is more that I can afford Iwill not buy
		//if price is less or matches what I can afford then Iwill buy tea
		
		if(allowedPrice>=teaPrice) {
			System.out.println("I will buy tea");
			System.out.println("And Iwill enjoy buy tea");
		}else {
			System.out.println("I cannot afford,I need to study more");
			System.out.println("I will go back to study more ");
			
			
		}
		
			
			
			
		
		
		
			
			
		
		}		
		
	}
	
	
	
		


