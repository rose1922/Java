 package com.syntax.class09;

public class Task {
	public static void main(String []args) {
      // TASK 1
		//Print the following pattern:
		//	55555
		//	4444
		//	333
		//	22
		//	1 
		
		for(int i=5; i>=1;i--) {
			for(int y=1; y<=i;y++) {
				System.out.print(i);//bi de y yi dene
			}
			System.out.println();
		}
		System.out.println("********************");
	 // TASK 2
		//	Print the following pattern:
		//	  *
		//	  **
        //    ***
        //    ****
       //     *****
        //    ****
       //     ***
       //     **
        //    *
		
		for (int i = 1; i <= 5; i++) {
			for (int y = 1; y <=i; y++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		for (int i = 5; i >= 1; i--) {
			for (int y = 1; y <=i; y++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}
}


		
	
	
			


