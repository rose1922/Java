package com.class3;

public class IfElseIf {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 99;

		if (num1 > num2) {
			System.out.println("Num1 is larger than num2");

		} else if (num1 == num2) {
			System.out.println("Num1 is equal num2");
		} else {
			System.out.println("Num1 is smaller than num2");
		}

		int day = 5;

		if (day == 1) {
			System.out.println("Today is Monday.I have to go to work");
		} else if (day == 2) {
			System.out.println("Today is Tuesday.I have SDLC class");
		} else if (day == 3) {
			System.out.println("Today is Wednesday.Ihave Java rewiev class");

		} else if (day == 4) {
			System.out.println("Today is Thursday.I have SDLC rewiv class");

		} else if (day == 5) {
			System.out.println("Today is Friday.Weekend is here");
		} else if (day == 6) {
			System.out.println("Today is Saturday.My favorite coding day");

		} else if (day == 7) {
			System.out.println("I love spending Sundays at Syntax");

		} else {
			System.out.println("I do not know this day");
		}
	}

}
