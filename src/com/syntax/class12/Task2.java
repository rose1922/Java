package com.syntax.class12;

public class Task2 {

	public static void main(String[] args) {
		
		//Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		String day="Bugun hava cok guzel";
		String [] arr=day.split(" ");
        for(int i=0; i<arr.length;i++) {
            
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.println("---------------------");
		//Create a String that should be combination of letters, numbers and special characters.
            //Find out how many alpha characters are there in the String.
            String str="Today is 230#$ very hot";
            str=str.replaceAll("[^A-Za-z]", "");
            System.out.println(str.length());


		//You have a String a=“Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?


	

}
}