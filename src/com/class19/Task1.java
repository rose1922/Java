package com.class19;

public class Task1 {
	// create a method createEmail().
	//Based on provided users name, LastName and email type,your method should
	//return complate email.
String createEmail(String name,String lastname,String emailType) {
	String email;
	email=name+lastname+"@"+emailType+".com";
	return email;
}

	public static void main(String[] args) {
		Task1  e=new Task1();
		String email=e.createEmail("Anka","Ad","gmail");
		System.out.println(email);
		

	}

}
//Task 2
//write a method to return whether given number is prime or not.


//Task 3
//Create class Student that will have a method getGrade.
//Your method should accept the score of a student a return a greade.
//score>90-A     score>80-B      score>70-C     score>50-D  anyting else-F