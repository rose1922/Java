package comclass9;

public class NestedLoop {

	public static void main(String[] args) {

//		for(int i=1; i>=3; i++) {
//			
//			System.out.println("I am outer loop");
//			for(int j=1; j<=3; j++) {
//		}
//			System.out.println("I am inner loop");
//
//	}
		// ------> no output
		for (int i = 1; i <= 3; i++) {//tekrar sayisini kontrol ediyor

			System.out.println("im outer loop");
			for (int j = 1; j <= 3; j++) {

				System.out.println("im inner loop");

			}
		}

	}
}
