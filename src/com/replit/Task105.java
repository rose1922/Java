package com.replit;

 //public class Task105 {

//Create a class named 'Main' with String variable 'name' and integer variable 'roll_no'. 

//Creating an object of the class Main and assign value of 2 to roll_no and name as "John"

//Your program should print the following:
//Name is John and roll number is 2
	
	class Main{
	String name;
    int roll_no;
   public static void main(String[] args) {
    Main s = new Main();
    s.name = "John";
    s.roll_no = 2;
    System.out.println("Name is "+s.name+" and roll number is "+s.roll_no);
  }
}


