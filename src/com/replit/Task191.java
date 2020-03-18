package com.replit;

//public class Task191 {
	
	import java.util.ArrayList;
	
	class Main {
		
	  public static void main(String[] args){
		  
	ArrayList<Boolean> listA=new ArrayList<>();

	  listA.add(true);
	  listA.add(false);
	  listA.add(false);
	   
	 ArrayList<Boolean> listB=new ArrayList<>();
	  listB.addAll(listA);
	  listB.addAll(listA);
	  System.out.println(listB);
	  
	}
	}


