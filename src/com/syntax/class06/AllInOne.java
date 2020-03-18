package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
	   scan=new Scanner(System.in);
		System.out.println("is there a sale?");
		
		sale=scan.nextLine();
		if(sale.equalsIgnoreCase("yes")) {//kucuk harflr yada butuklede yazilabilir yes
			System.out.println("Whats the price");
			price=scan.nextDouble();
			if(price<=20) {
				discount=price*0.10;
				
			}else if(price>20 && price<=100) {
				discount=price*0.20;
				
			}else if(price>100 && price<=500) {
				discount=price*0.3;
				
				
			}else {
				discount=price*0.5;
				
			}
			finalPrice=price-discount;
			System.out.println("After "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
			
		}else {
			System.out.println("no going shopping");
		}
		
	} 
}
	


