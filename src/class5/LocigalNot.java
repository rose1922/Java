package class5;

public class LocigalNot {
	public static void main(String[] args) {
		boolean b1=!true;
		boolean b2=!false;
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		// if trafic-->late, else-->on time
		if(!traffic) {//using !we are reverting condition
			System.out.println("0n time");
		}else {
			System.out.println("Late");
		}
		boolean isRain=false;
		
		if(!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Donot take an umbrella");
		}
	
	// lets compare 2 numbers using NOT operator
		int num1=10;
		int num2=11;
		
		if(num1==num2) {
			System.out.println("Numbers are equal");
			
		}else {
			System.out.println("Numbers are not equal");
		}
		
	
	//if name is not Marry or Anna then you are not my sister
	String name="Mary";
	String name2="Anna";
	// true OR false--> true add not-->false
	if (!(name.equals("Mary") || name2.equals("Anna"))) {
		System.out.println("you are not my sister");
	}else {
		System.out.println("You are my sister");
	}

}
}