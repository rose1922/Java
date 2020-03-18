package com.class19;

public class Student {
	  
	char getGrade(int a) {
	        char gradeis='X';
	        if (a > 0 && a <= 50) {
	            gradeis = 'F';
	        } else if (a > 50 && a <= 70) {
	            gradeis = 'D';
	        } else if (a > 70 && a <= 80) {
	            gradeis = 'C';
	        } else if (a > 80 && a <= 90) {
	            gradeis = 'B';
	        } else if (a > 90 && a <= 100) {
	            gradeis = 'A';
	        }
	 return gradeis;
	    }
	
	    public static void main(String[] args) {
	        Student grade=new Student();

	        
	      char sonuc = grade.getGrade(70);
	        
	   System.out.println(sonuc);    
	      //  char lettergrade=grade.getGrade(65);
	      //  System.out.println(lettergrade);
	    }

	}

