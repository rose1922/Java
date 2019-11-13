package class5;

public class LocigalOr {
	public static void main(String[] args) {
		//7 days aweek
		//if day is 2 or 4--> SDLC CLASS
		//if day 6 or 7-->Java class
		//if day 1 or 5-->No class
		//if day =3-->review class
		//
		
		int day=6;
		// false OR false-->false
		if (day==2 || day==4 ) {
			System.out.println("SDLC Class");
		//true OR false-->true	
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		//false OR false-->false	
		}else if (day==1 || day==5) {
			System.out.println("No Class");
		}else if(day==3) {
			System.out.println("Reviw class");
		}else 
		System.out.println("Not a valid day");
	
	
	//7 days a week
	//if days is Tuesday or Thursday-->SDLC class
	//if day saturday or sunday-->Java class
    //if day monday or friday-->No class
	//if day is wednesday-->Review class
	//
	
	
	String weekDay="Sunday";
	if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
		System.out.println("SDLC Class");
		
	}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
		System.out.println("Java Class");
		
	}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
		System.out.println("No Class");
		
	}else if (weekDay.equals("Wednesday")) {
		System.out.println("Review Class");
	}else {
		System.out.println("Not a valid day");
	}
}
}

		
		
		
		
		
	
		





