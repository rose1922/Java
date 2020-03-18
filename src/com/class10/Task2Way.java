  package com.class10;

public class Task2Way {

	public static void main(String[] args) {
		String[] countries={"Afganistan","Colombia","USA","Turkey","Russia"};
       
		for(int i=0; i<countries.length; i++) {	
			
			switch(countries[i]) {// switch(Afganistan)
			case"Afganistan":
				System.out.println("Kabul");
				break;
			case"Colombia":
			    System.out.println("Bogota");
			    break;
			case"USA" :
			System.out.println("Washington DC");
			    break;
			case"Turkey":
			System.out.println("Ankara");
				break;
			case"Russia":
			System.out.println("Moscow");
			
			
			}// ya da--> String capital=null;
			//           case "Afganistan":
			//            capital=null;
	}

}
}