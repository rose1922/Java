package InterviewQuestion;

import java.util.Scanner;

public class QuestionPrime {

	public static void main(String[] args) {
		
		
//Write a java program to check whether a given number is prime or not?
		Scanner scan=new Scanner(System.in);
		
		int num;

		System.out.println("Please enter a number?");
		num=scan.nextInt();
		int i=2;
		while(i<num) {
		if(num%i==0) {
			System.out.println("The number "+num+" is not a prime number");
			break;
		}  i++;
		}if(num==i) {
			System.out.println("The number "+num+" is a prime number");
		}
}}