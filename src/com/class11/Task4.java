package com.class11;

public class Task4 {
	public static void main(String []args) { 
		
		//task 1
		
		//Create a 2D array or integer type
		//where you will store odd and even numbers in 3 rows and 4 columns.
		//Develop a program which will identify/print the even numbers only.
		
		// tsk 2
		//Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
		//Print the sum of all numbers.
		
		// task 3
		//Create a 2D array of integer type
		//with 3 rows and 4 columns and print all values
		//of the whole array.
		
		
		int[][] array= {
		                {12,23,45,23},
		                {67,87,44,77},
		                {56,43,67,21}
		        };
		        for(int[] i:array) {
		            for(int j:i) {
		                System.out.print(j+" ");
		            }System.out.println();
		        }
		System.out.println("***************");
		
		 int[][] numbers = {
	                { 8, 7, 5, 3 },
	                { 1, 5, 6, 7 },
	                { 3, 6, 8, 1 }
	                };
	        
	        int sum=0;
	        for (int i = 0; i < numbers.length; i++) {
	            for (int j = 0; j < numbers[i].length; j++) {
	                //System.out.print(numbers[i][j] + � �);
	                
	                sum=sum+numbers[i][j];
	            }
	            System.out.println();
	        }
	        System.out.println("The sum of all elements in the array is= "+sum);
	        
	        int sum1=0;
	        for(int nums[]: numbers) {
	            for(int getNum:nums) {
	                if(getNum%2==0) {
	                    System.out.println(getNum+" Is even number");
	                }
	                sum1=sum1+getNum;
	            }
	        }
	        System.out.println();
	    }
	

	
		
	

		
}
