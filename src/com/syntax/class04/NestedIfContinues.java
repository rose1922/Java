package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		
		//check if patient has my any allergies
		//if no allergies-->you are healtly
		//othewise check if patient has:
		
		//orange allergy--->do nat eat orange
		//apple allery---->do not eat apples
		//
		boolean allergy=true;
	    boolean appleAllergy=true;
	    boolean orangeAllergy=true;
	    boolean kiwiAllergy=false;
	    
		if(allergy) {
			System.out.println("Please answer below");
			
			if(orangeAllergy) {
				System.out.println("Do not eat oranges");
			}
			if(appleAllergy) {
				System.out.println("Do not eat apple");
			}
			
			
		}else {
			System.out.println("You are healty");
		}

	}

}
