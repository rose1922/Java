package com.class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		String[] actualNames= {"Jhon","Smith","Alex","Tanaz"};
		Arrays.sort(actualNames);
		
		String[] expectedNames= {"Smith","jhon","Alex","Tanaz"};
		// To sort the elements of an Array
		Arrays.sort(expectedNames);
		
		System.out.println(Arrays.toString(actualNames);
		String actual=Arrays.toString(actualNames);
		
		Arrays.parallelSort(expectedNames);
		
		String firstName="Zom";
		String firstName2"Ali";
		
		String firstName3="Ali";
		String firstName4="Zom";
		
		String actl=firstName+firstName2;
		String expt=firstName3+firstName4;
		System.out.println(actl);
		System.out.println(expt);
		
		int[] numbers= {123,34,15,66,99};
		
		for(int i:numbers) {
			System.out.println(i+" ");
			
		}
		System.out.println();
		System.out.println();

	}

}
