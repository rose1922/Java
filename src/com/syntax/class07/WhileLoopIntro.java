package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		
		
		
		int time=10;
        if(time>12){
            System.out.println("Good morning");
        }
        System.out.println("------  WHILE LOOP ---------");
//      while(time<12){
//          System.out.println("Good morning");//CODE WILL EXECUTE INFINETELY
//      }
        while(time>12){
            System.out.println("Good morning");
            time++;
        }
        
        //how to print numbers from 1 to 50?
        
        int num=1;
        while(num<=50) {
            System.out.println(num);
            num++;
        }
        System.out.println("***************************");
        // how to print numbers from 20 to 30
        int num1=20;
        while(num1<=30) {
            System.out.println(num1);
            num1++;
        }
        System.out.println("***************************");
        // how to print number from 5 to 15 all in 1 line
        int num2=5;
        while(num2<=15) {
            System.out.print(num2+" ");
            num2++;
        }
        System.out.println("***************************");
        // how to print values from 10 to 1?
        int num3=10;
        
        while(num3>=1) {
            System.out.println(num3);
            num3--;
        }


System.out.println("-----------------------------");


	
		//How to print 50 to 1
		
		int x=50;
		while(x>=1) {
			System.out.println(x);
			x--;
		}
		
		//how to print odd numbers from 1 to 20
		int x1=1;
		while(x1<=20) {
			System.out.println(x1);
			x1+=2;
		}
		
		// 2 way
		int num4=1;
		while (num4<=20) {
		if(num4 %2!=0) {
			System.out.println(num4);
		}
		num4++;
		
		System.out.println("----------------------");
		//3 way
		int m=1;
		while(m<=20) {
			System.out.println(m++);
			m++;
		}

	}

	}}
