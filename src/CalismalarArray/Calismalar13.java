package CalismalarArray;

public class Calismalar13 {
    public static void main(String[]args) {
	int arr[] = { 14, 46, 5, 3, 92, 1, 48, 36, 66, 101 };
	int largest = arr[0];
	int secondLargest = arr[0];
	int smallest=arr[0];
	int secondsmallest=arr[0];
	System.out.println("The given array is:" );
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+"\t");
	}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] > largest) {
			secondLargest = largest;
			largest = arr[i];
		} else if (arr[i] > secondLargest) {
			secondLargest = arr[i];
		}else if(arr[i]<smallest){
			secondsmallest=smallest;
			smallest=arr[i];
		}else if(arr[i]<secondsmallest) {
			smallest=arr[i];
		}
	}
	System.out.println("\nSecond largest number is:" + secondLargest);
	System.out.println("largest number is:" + largest);
	System.out.println("smallest number is : "+smallest);
	System.out.println("second smallest number is : "+secondsmallest);
    }}