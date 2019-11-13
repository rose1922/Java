package com.clas7;

public class Task {
	public static void main(String[] args) {

///*
// * Create a boolean variable workDay and assign true 
// * create int variable day and assign it to 1 
// * As long as it is workDay print “I need a day off” and increase  day. 
//* Once day is print “I do not need a day off any more
// */

		boolean workDay = true;
		int day = 1;
		while (workDay) {
			if (day == 6) {
				
				System.out.println("I need a day of");

				workDay = false;
			} else {
				System.out.println("I do not need a day of any more");
			}

			day++;
		}

	}
}