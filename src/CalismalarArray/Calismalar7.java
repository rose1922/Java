package CalismalarArray;

import java.util.Scanner;

public class Calismalar7 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		String [] day=new String[7];
		
		for(int row=0;row<day.length;row++) {
			System.out.println("Please enter day "+(row+1)+" of the week");
			day[row]=scan.next();
			//day[0]=sunday;
			//day[1]=monday;
		}
		for(int i=0;i<day.length;i++) {
			System.out.println(day[i]);
		}
		
		
	}
		
	}
		