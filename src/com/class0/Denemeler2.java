package com.class0;

public class Denemeler2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5 ; i++) {
			
			for(int j=4; j>=i ;j--) {
				System.out.print(".");
						
			}
			for(int k=1; k<=i ; k++) {
				
			System.out.print(i);
		}
			System.out.println();

	}
		System.out.println("*****************");
		
		for(int i=1; i<=5 ;  i++) {
			
			for(int k=4; k>=i; k--) {
				
				System.out.println(" ");
			}
			for(int j=1 ; j<=i; j++) {
				System.out.println("*");
			}
			if(i!=1) {
				for(int h=2; h<=i; h++) {
					System.out.println("*");
					
				}
			}
			System.out.println();
		}
		System.out.println("*********************");
		for(int floor =1; floor<=4 ;floor++) {
			for(int room=1; room<=6; room++) {
				System.out.print(floor +"."+room+ " ");
			}
			System.out.println();
		}
		System.out.println("*************************");
		
		for(int row=1; row<=4; row++) {
			System.out.print("Floor "+ row +"-->");
			for(int col=1;col<=6; col++) {
				System.out.print(floor+"."+ room +" ");
				System.out.print(col +" ");
			}
			System.out.println();
		}
		
		
		
	}
}
			
		
			
			
			
			
			
			
			