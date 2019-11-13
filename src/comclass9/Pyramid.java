package comclass9;

public class Pyramid {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/* 1
		 * 22
		 * 333
		 * 4444
		 * 55555
		 * 666666
		 * 7777777
		 * 88888888
		 * 999999999
		 */
for (int d = 1; d <= 9; d++) {
			
			for(int z=0; z<d; z++) {
				
				System.out.print(d); }
			
		System.out.println();
		 
		  
}
 
	
	
	//
	//Print the following pattern:
	//	55555
	//	4444
	//	333
	//	22
	//	1  
	
	for (int d = 5; d >= 1; d--) {
		
		for(int z=1; z<=d; z++) {
			
			System.out.print(d); }
		
	System.out.println();

	
	//print the following pattern
	
	//*
	//**
	//***
	//****
	//*****
	//****
	//***
	//**
	//*
	
	for (int i = 1; i <= 5; i++) {

		for (int j = 1; j <= i; j++) {

			System.out.print("* ");
		}
		System.out.println("   ");
	}
	for (int i = 5; i >= 0; i--) {

		for (int j = 1; j <= i; j++) {

			System.out.print("* ");
		}
		System.out.println("   ");
	}
	
	}
	}
}
