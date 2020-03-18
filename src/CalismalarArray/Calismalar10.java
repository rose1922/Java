package CalismalarArray;

public class Calismalar10 {

	public static void main(String[] args) {
		
	
			int[][] numbers = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
	//should print 3

			int countNegative = 0;
			for (int j = 0; j < numbers.length; j++) {
				for (int i = 0; i < numbers[j].length; i++) {
					
			System.out.print(numbers[j][i]);	
				}
	}

	}}
