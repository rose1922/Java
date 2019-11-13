package com.replit;

public class Task88 {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
		
		//Write a program that will print the sum of all elements in column with index 1 in
		//a 2-D int array. 
		
		int sum=0;
		
		  for(int i=0; i<a.length; i++){
		    for(int j=0; j<a[i].length; j++){
		      if(j==1){
		      sum=sum+a[i][j];
		      }
		    }
		  }
		  System.out.println(sum);
		
		
		

	}

}
