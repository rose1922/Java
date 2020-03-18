package InterviewQuestion;

import java.util.Scanner;

public class PrimeAhmet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Bir numara girin : ");
		int numara = scan.nextInt();
		if (isPrime(numara)) {
			System.out.println(numara + " Girdiginiz numara asal sayi");
		} else {
			System.out.println(numara + " Girdiginiz numara asal sayi degil");
		}
	}

	public static boolean isPrime(int numara) {
		if (numara <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(numara); i++) {
			if (numara % i == 0) {
				return false;
			}
		}
		return true;
	}
}


	


