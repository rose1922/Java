package com.class0;

public class Denemeler6 {

	public static void main(String[] args) {

		//String s = "anka4;%^&r*89a9";

		// for (int i = 0; i < s.length(); i++)

		//System.out.println(s.replaceAll("[^A-Z-a-z]", ""));
		
		System.out.println("***********************");
		int[][] a = {
		                {5,2,3,7},
		                {1,5,1,1},
		                {8,3,1,2}
		            };
		            int firstlargest=0;
		            int secondlargest=0;
		    for(int i=0;i<a.length;i++){
		      for(int j=0;j<a.length;j++){
		        if(a[i][j]>secondlargest||a[i][j]<firstlargest){
		          secondlargest=a[i][j];
		        }
		      }
		    }System.out.println(secondlargest);
	}
}
