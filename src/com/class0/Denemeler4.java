package com.class0;

public class Denemeler4 {
	
	public static void main(String [] args) {
		
		int [][] numberGrid = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{0}
		};
		
		for(int i=0; i<numberGrid.length; i++) {
			for(int j=0; j<numberGrid[i].length; j++) {
				System.out.print(numberGrid[i][j]);
			}
		
		System.out.println();
	}
}
}
