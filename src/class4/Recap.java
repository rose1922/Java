package class4;

public class Recap {
	public static void main(String[] args ) {
		
		int num=23;
		num=90;
		num -=200;//-110=90-200
		num-=110;
		num+=200;
		
		if(num>0){
			System.out.println(num+" is a positive number");
			
		} else if (num==0){
			System.out.println("Value of number is " + num);
					
		}else {
			System.out.println(num + "is negative number");
		}
		
		//even or odd(7,8)
		int i=137;
		if(i%2==0) {
		
			System.out.println(i +" is a even number");
		}else {
			System.out.println(i+"is an odd number");
			
		}
		if (i%2!=0 ) {
			System.out.println(i+"is an odd number");
		}else {
			System.out.println(i+"is an a even number");
		}
		
		
		}

}
