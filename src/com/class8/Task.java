package com.class8;

public class Task {
	public static void main(String [] args) {
		for(int a=1;  a<=100;  a++) {
			System.out.print(a +" ");
		}
		for(int a1=101;  a1>=1;  a1--) {
			System.out.println(a1);
		}
		for(int i=20 ;i>=1 ; i-=2) {
			System.out.println(i);
		}
		for(int c=20; c<=50; c++ ) {
			if(c%2!=0)
			System.out.println(c);
		}
		System.out.println("*******************************");
		
		
		
		//what is the output
		
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum=sum+i;//
			System.out.println(sum);
		}
		
		// what is the output int sumAll=0;
		int sumAll=0;
		for(int i=0; i<=20; i+=5) {
			sumAll=sumAll+i;
		}
		System.out.println(sumAll);
		System.out.println("*************************************");
	
	//what is the output
	
	int total=2;
	for(int y=1; y<=3; y++) {
		total=total*y;//2=2*1;4=2*2;12=4*3
	}
	System.out.println(total);

}
}