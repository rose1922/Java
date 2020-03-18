package com.class32;

import java.util.ArrayList;

public class Task {

	public static void main(String[] args) {
		 
		// Soruyu yaz
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("A");
		arrayList.add("Y");
		arrayList.add("S");
	    arrayList.add("E");
		arrayList.add("G");
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("E"));
		System.out.println(arrayList.size());
		for(String name:arrayList) {
			System.out.println(name);
		}
	}

}
