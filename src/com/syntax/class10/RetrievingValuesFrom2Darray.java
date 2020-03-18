package com.syntax.class10;

public class RetrievingValuesFrom2Darray {

	public static void main(String[] args) {
		
		String[][] month= {
	    		{"Januaray","February","December","Hi","Hello"},
	    		{"March","April","May"},
	    		{"June","July","August","Monkey"},
	    		{"September","October","November"}
		         };
		
		int rows=month.length;//how many arrays
		
		System.out.println(rows);
		int firstArray=month[0].length;//how many element first row
		System.out.println(firstArray);
		
		System.out.println("================================================");
		
		for(int i=0;i<month.length;i++) {//iterates over rows
			
			for(int j=0;j<month[i].length;j++) {//iterates over columns
				System.out.print(month[i][j]+" ");
			}
			System.out.println();
		}
	}
}

