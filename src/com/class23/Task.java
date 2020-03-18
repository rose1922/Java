package com.class23;

public class Task {
	//     TASK 1
	//    Write a program that will have a constructor:
	//	one with parameters and second without any parameters.
	//    Create a separate Test class where you will execute both of the constructors.

	Task(){
			System.out.println("Have a nice day");
		}
	Task(String str){
		System.out.println("Today is Java Class");
		}
		public static void main(String[] args) {
			Task obj=new Task();
			Task obj1=new Task("String");

		}

	}


