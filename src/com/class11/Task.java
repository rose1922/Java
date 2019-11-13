package com.class11;

public class Task {

	public static void main(String[] args) {
	/*
	 * Create an array of countries
	 * while retrieving all values from an array print
	 * capital for each country	
	 */
		String[] array= {"USA","Russia","Turkey","Spain"};
		for(int i=0; i<array.length; i++) {
			if(array[i].equals("USA")) {
				System.out.println("Washington DC");
			}else if(array[i].equals("Russia")){
				System.out.println("Moscow");
			}else if(array[i].equals("Turkey")) {
				System.out.println("Ankara");
			}else if(array[i].equals("Spain")) {
				System.out.println("Madrid");
				
				
			}}	
		System.out.println("*******************************");
			
		
		String[] countries={"USA","Afghanistan","Kazakistan","Ukrania"};
		for(String country:countries) {
			switch(country) {
			case "USA":
				System.out.println("Washington DS");
				break;
			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Kazakistan":
				System.out.println("Astana");
				break;
			case"Ukrania":
				System.out.println("Kiev");
				break;
						
			
			}
		}
		
		 }

	}


