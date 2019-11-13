package com.class16;

public class IQ7 {

	public static void main(String[] args) {
		
        //DUZELT
        
        int num= 2;
        boolean isPrime=true;
        
      if(num ==0 || num ==1) // if(num<=1){
        	isPrime=false;
        } else {
        
        	for(int i=2; i<num; i++){
        
        
        if(num%i==0){
        isPrime=false;
        break; 
	}

 }}
           if (isPrime) {
        	   System.out.println(num+" is a Prime number");
        	   
           }else {
        	   System.out.println(num+" is Not Prime number");
           }
           
 }
	}