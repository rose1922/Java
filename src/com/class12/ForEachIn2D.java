package com.class12;

public class ForEachIn2D {

	public static void main(String[] args) {
		String[][] groceryList= {
				{"banana","orange","apple"},
				{"onion","patato","cucumber"},
				{"yogurt","cheese","milk"}
		};
		for(String[] list:groceryList) {
			
			for(String item:list) {
				System.out.println(item);
			}
			System.out.println();
			
		}

	}

}
