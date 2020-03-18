package com.syntax.class04;

import java.util.Scanner;

public class ScannerDeneme {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.print("Yasiniz kac?");
		
		int age1=input.nextInt();
		
		if(age1>13) {
			System.out.println("bu siteye girebilir");
		} if(age1>13 && age1<18) {
			System.out.println("Komik oyunlar oyunlar");
		} if(age1>18 && age1<27) {
			System.out.println("adrenalin oyunlar");
		}if(age1>27) {
			System.out.println("cok yaslisiniz");
		}else {
			System.out.println("siteye giremezsiniz");
		}
		
		
		
		
		
		
	}
	

	}


