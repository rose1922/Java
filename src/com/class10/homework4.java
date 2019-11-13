package com.class10;

import java.util.Scanner;//Eger 23
    //for ile yaparsan for(int i=0;i< 20;i++)

public class homework4 {

	public static void main(String[] args) {
		Scanner scan;
		int secretNumber, guessNumber;
		
		scan=new Scanner(System.in);
		secretNumber=12;
		
		do {
			System.out.println("Please guess my number from 1 to 20");
			guessNumber=scan.nextInt();
			
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
			}else if (guessNumber>secretNumber) {
				System.out.println("Your number is too large");
			}else {
				System.out.println("Congratulations you got it");
			}
		}while (guessNumber !=secretNumber);
		

	}

}
