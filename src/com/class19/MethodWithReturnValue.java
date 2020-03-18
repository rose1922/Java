package com.class19;

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
		/* declare a String and if String has more than 10 characters-->String is large
		 * otherwise --> String is small */
		String str = "Welcome home";
		int numOfChars = str.length();

		if (numOfChars > 10) {
			System.out.println("String is large");
		} else {
			System.out.println("String is small");
		}

		char character = str.charAt(4);
		System.out.println(character);
		// create an object of the class where method is defined
		Recap obj = new Recap();
		// int num=obj.sum(10, 30); compile error saying change return type
		// obj.sum(10, 20);
		MethodWithReturnValue obj1 = new MethodWithReturnValue();
		obj1.sum(20, 50);
		
		//int sum = obj1.sum(50, 50);
	//	System.out.println(sum);
		int large=obj1.findLargest(20, 40);
		System.out.println(large);
	}
	// return type, method name (list of parameters)
	int num1=50;
	int num2=70;
	int sum(int num1, int num2) {
		//int c = num1 + num2;
		return num1+num2;
		
	}
     private void syso() {
		// TODO Auto-generated method stub

	}
	// method to return largest number
	
	
	
	
	int findLargest(int num1, int num2) {
	int n1=30;
	int n2=60;
	int largest;
		if (n1 > n2) {
			largest = n1;
		} else {
			largest = n2;
		}
		return largest;
	}
}


