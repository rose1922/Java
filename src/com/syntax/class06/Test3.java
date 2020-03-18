package com.syntax.class06;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//Using scanner class create calculator.
		//Allow user to enter 2 numbers and operator(+,-,*,/).
		//Based on operator provide the result to user.
          
		Scanner scan;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter 2 number");
		
		double num1=scan.nextDouble();
		double num2= scan.nextDouble();
		System.out.println("Please enter operator(+,-,*,/)");
		
		char operator=scan.next().charAt(0);
		double result;
		switch(operator) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
		result=num1*num2;
		  break;
		case '/':
			result=num1/num2;
			break;
		
		default:
			System.out.println("invalid operator");
			return;
		}
		System.out.println(num1+" "+operator+" "+num2+"="+result);
		
		
		
	}

}
