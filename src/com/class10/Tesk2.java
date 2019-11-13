package com.class10;

public class Tesk2 {
	public static void main(String [] args) {
		
		//Create an array of countries.
		  //While retrieving all values from an array print capital for each country.
		String[] countries= {"TURKEY";"USA","ITALY"};
		
		for( int i=0; i< countries.length; i++) {
			if(countries[i].equals("TURKEY")) {
				System.out.println("Ankara");
				
			}else if(countries[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if(countries[i].equals("ITALY")) {
				System.out.println("Roma");
			}
		}
		
	}
}


