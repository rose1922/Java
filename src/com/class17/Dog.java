package com.class17;

public class Dog {
	
//  TASK 2
    
    //Create a Dog Class and create 3 different objects of it:
	//Husky, Bulldog, Labrador  with specific attributes and behaviours. 
	
	//define features, attributes
	String  kind, name ;
	
	int age;
	
	//define behavior, actions
	void friendly() {// method header
		//method body
		System.out.println("I can play with "+kind);
	}
	
	void hunter() {
		System.out.println("its owner is go hunt with " +name);
	}
	
//	void watchMovie() {
//		System.out.println("I can watch movie on my "+name);
	//}
	///////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.kind="Husky";
		dog1.age=2;		
		
		System.out.println("I have "+dog1.kind+ " "+ dog1.age+ " age");
		dog1.friendly();
		dog1.hunter();
		

		System.out.println();
		Dog dog2=new Dog();
		dog2.kind="Bulldog";

		
		System.out.println();
		System.out.println("---Creating 2 object of a phone type---");
		System.out.println();
		
		Dog dog3=new Dog();
		dog3.kind="Labrador";
		
	
		
	}
}



