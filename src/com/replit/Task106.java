package com.replit;

//public class Task106 {


  //    create a class named 'Main' with specific attributes.

//For you to do:

//Create two objects in which you will be assigning the following values.
//carColor='Black'
//carModelYear=2019
//carName='BMW'

//carColor='White'
//carModelYear=2018
//carName='Toyota'

//Car color is Black and car model year is 2019 and car name is BMW
//Car color is White and car model year is 2018 and car name is Toyota

class Main {
		   String carColor;
		   int carModelYear;
		   String carName;
		  public static void main(String[] args) {
		    Main mm=new Main();
		    mm.carColor="Black";
		    mm.carModelYear=2019;
		    mm.carName="BMW";
		    Main mm1=new Main();
		    mm1.carColor="White";
		    mm1.carModelYear=2018;
		    mm1.carName="Toyota";
		System.out.println("Car color is "+mm.carColor+" and car model year is "+mm.carModelYear+" and car name is "+mm.carName);

		System.out.println("Car color is "+mm1.carColor+" and car model year is "+mm1.carModelYear+" and car name is "+mm1.carName);


}
	}