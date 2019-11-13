package com.replit;

public class Task85 {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			int sum0=0;
			for(int i=0; i< a[0].length; i++ ){
			sum0=sum0+a[0][i];}
			System.out.println(sum0);
		
			int sum1=0;
			for(int i=0; i< a[1].length; i++ ){
			sum1=sum0+a[1][i];}
			System.out.println(sum1);
			int sum2=0;
				for(int i=0; i< a[2].length; i++ ){
			sum2=sum2+a[2][i];}
			System.out.println(sum2);
			
			int sum3=0;
			for(int i=0; i< a[3].length; i++){
			  sum3=sum3+a[3][i];}
			  System.out.println(sum3);
			}
}

	

// 2.YOL
 // int sums[] = new int[nums.length];

  // for (int i = 0; i < nums.length; i++) {
 	// int rowSum = 0;
	// for (int j = 0; j < nums[i].length; j++) {
	//	rowSum += nums[i][j];
	// }
	// sums[i] = rowSum;
 //  }

 //  for(int sum : sums) {
	// System.out.println(sum);
  // }





