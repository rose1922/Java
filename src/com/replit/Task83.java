package com.replit;

public class Task83 {

	public static void main(String[] args) {
		
		//Write a program to print the sum of the elements
		//in the third row. 
		
		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
			int sum =0;
			int row =2;//bunu yazmazsan da oluyor
		  for (int i = 0; i < a[2].length; i++) {
				sum = sum + a[2][i];  }//sum dan sonra curly yi kapat
		  
		  // 2. yol
		  
		//  int row = 2;
		//	int total = 0;
		//	for (int j = 0; j < nums[row].length; j++) {
			//	total = total + nums[row][j];
			//}
			System.out.println(sum);
		  
		  

	}

}
