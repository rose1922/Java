package com.class24;

public class Task {
	   // TASK 1
	// Write a program  that will have a 4 different access
	// levels of constructors and create 3 objects of this class: 1 - inside same class;
	// 2 - from outside the class and observe result.
	// 3 - from different class inside different package
	   // TASK 2
		//Write program that have static constructor and observe result.
		
	    public Task() {
			System.out.println("I am public constructor");
		}
		Task(String str) {
			System.out.println("I am default constructor");
		}
		protected Task(int num) {
			System.out.println("I am protected constructor");
		}
		private Task(int num, int num2) {
			System.out.println("I am private constructor");
		}
		
		public static void main(String[] args) {
			Task obj=new Task();
			Task obj1=new Task(4);
			Task obj2=new Task(4, 5);
			Task obj3=new Task("Some string");
		}
	}  
	    
	    
	    
	    

    
	


