package com.class2;

public class PerimiterAndArea {
	
	public static void main (String[] args) {
		
		int width=5;
		int height=8;
		int area=width*height;
		int perimeter=2*(width*height);
	/*
	 * the perimeter of a regtangle with width ___
	 * and height ____ is equal ___ and the area is _______
	 * 
	 */
		System.out.println("The perimatier of regtangle with width" +width+
				"and height"+height+" is equal to" +perimeter+"and the area is"+area);
		
		String message="The perimatier of regtangle with width"+width+"and height"+height+"is equal to"+perimeter+"and the area is"+area;
		System.out.println(message);
	}

}
