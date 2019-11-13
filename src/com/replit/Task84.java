package com.replit;

public class Task84 {

	public static void main(String[] args) {
		
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		
	//should be 8
	  int big=0;
	     
	        for (int j = 0; j < a.length; j++) {
	            for (int i = 0; i < a[j].length; i++) {
	                if (a[j][i] > big) {
	                    big = a[j][i];
	                }
	            }
	        }
	        System.out.println(big);
		
		}}
   // 2. Yol


 // int maxValue = numbers[0][0];
  //for (int j = 0; j < numbers.length; j++) {
  //  for (int i = 0; i < numbers[j].length; i++) {
      //  if (numbers[j][i] > maxValue) {
       //     maxValue = numbers[j][i];
    //    }
//   }
 // }
  //System.out.println(maxValue);


		

	


