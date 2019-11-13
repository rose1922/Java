package com.class11;

public class Text1 {

	public static void main(String[] args) {
 // 1. task
//create an array of cars and store 6 elements into it.
//Using 2 different loops print all values from the array
String[] cars = { "Honda", "Toyota", "Nissan", "Ford", "Tesla", "Cyrsler" };
     for (String names : cars) {
            System.out.println(names);
        }
	}

          //2. task
         // Create an array on integers and calculate 
           //the sum of all elements in an array




  int sum=0;
  int [] num= {2,3,4,5};
  for (int a=0 ; a<num.length ; a++) {
  sum+=num[a];
  }
  System.out.println(sum);

            // 3.task
           //Create an array of countries.While retrieving all values
           //from an array print capital for each country
            //(use 2 different loops)


String[] country= {"Germany", "USA", "Canada", "Turkey"};
        
        for(String c:country) {
            switch(c) {
            case "Germany":
                System.out.println("Berlin");
                break;
            case "USA":
                System.out.println("Washington DC");
                break;
            case "Canada":
                System.out.println("Ottowa");
                break;
            case "Turkey":
                System.out.println("Ankara");
                break;
            }
        }
        }