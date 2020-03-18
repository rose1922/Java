package CalismalarArray;

public class Calismalar4 {

	public static void main(String[] args) {
	// write a prog so that the elements of the array printed in reverse order 
	// starting with the last element
		
		int[] nums= {2,4,6,8,10,1,3,5,7,9};
		for(int x=nums.length-1;x>=0;x--) {
			System.out.println(nums[x]+" ");
		}

	}

}
