package class5;

import java.util.Scanner;

public class LogiacalAndScanner {
	public static void main(String[] args) {
		/* ask user to enter age
		 * if age is from 1 to 3--> you are a baby
		 * if  age from3-5--> you are toddler
		 * if age from5-12-->you are a kid
		 * if age from12-19-->teenager
		 * if age > 20--> you are an adult
		 */
		int age;
		Scanner scan;
	    scan=new Scanner(System.in);
		System.out.println("Please enter your age");
	   age=scan.nextInt();
	    
	   String human;
		
		if(age>=1 && age<=3) {
			System.out.println("You are a baby");
			human="baby";
			
		}else if (age>3 && age <=5) {
			System.out.println("You are a toddler");
			human="toddler";
		}else if (age > 5 && age<=12) {
			System.out.println("You are kid");
			human="kid";
		}else if (age>12 && age<=19) {
			System.out.println("You are teenager");
			human="teenager";
		}else if (age>19) {
			System.out.println("You are adult");
			human="adul";
		}else {
			System.out.println("Invalid age entered");
			human="unknown";
			System.out.println("You are "+human);
			
			
		}
		
	}
}
