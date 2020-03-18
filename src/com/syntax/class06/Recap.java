package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		/*if hour beween 1-11--->morning
		 * 12-15--->afternoon
		 * 16-20--->evening
		 * 21-24-->nigth
		 */
    int hour=21;
    String timeOfDay;
    
    if(hour>=1 &&hour<=11) {
    	timeOfDay="Morning";
    }else if(hour>=12 && hour<=15) {
    	timeOfDay="Afternoon";
    }else if(hour>=16 && hour<=24) {	
        timeOfDay="Evening";
	}else if(hour>=21 && hour<=24) {
		timeOfDay="Nigth";
	}else {
		timeOfDay="Unknown";
	}
    	//if time of the day is not unknown-->only then I want to see the message
    	
    	if(!timeOfDay.equals("Unknown")) {
    		System.out.println("Rigth now is "+timeOfDay);
    	}
    }
}
	
