  package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		//TASK1
		//Create an array of animals and store 6 elements into it.
		//Using 2 different loops print all elements from the array.
		
		String[] animals= {"dog","cat","rubbit","horse","donkey","lamb"};
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println("_________________");
		//second way
		
		for(String animal:animals) {
			System.out.println(animal);
		}
		System.out.println("-----------------------");
		
		//TASK2
		//Create an array on integers and calculate the sum of all integer elements in an array.

		int [] numbers={9,8,5,7,5};
		
		int total=0;
		for (int i=0; i<numbers.length; i++) {
			total += numbers[i];
		}
		System.out.println(total);
		
		//DIGER YOLLAR
	      // System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);
		//for (int num:nums) {
		//sum+=num;
		//System.out.println(sum)
	    
		System.out.println("=========================================");
		//TASK3
		//Create an array of countries.
		//While retrieving all values from an array print capital for each country. (use 2 different loops).
     
		String[] countries = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
		for (int y = 0; y < countries.length; y++) {
		            switch(countries[y]) {
		            
		            case "USA":
		                System.out.println("The capital is Washington DC");
		                break;
		            case "Poland":
		                System.out.println("The capital is Warsaw");
		                break;
		            case "Ukraine":
		                System.out.println("The capital is Kiev");
		                break;
		            case "Turkey":
		                System.out.println("The capital is Ankara");
		                break;
		            case "Spain":
		                System.out.println("The capital is Madrid");
		                break;
		            }
		            
		        }
	




		

	}

}
