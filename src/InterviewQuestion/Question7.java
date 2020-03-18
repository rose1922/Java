package InterviewQuestion;

public class Question7 {

	public static void main(String[] args) {
//Write a java program to find the second largest number in the array?
//Maximum and minimum number in the array?
    int[] array= {2,11,19,-5,29,55};
    
    int largest=array [0];
    int secondLargest=array[0];
    int smallest=array[0];
    for(int i=0; i<array.length;i++) {
    	if(array[i]>largest) {
    	secondLargest=largest;
    	largest=array[i];
    }else if(array[i]>secondLargest) {
    	secondLargest=array[i];
    }else if(array[i]<smallest) {
    	smallest=array[i];
    }
    }
    System.out.println(largest);
	System.out.println(secondLargest);
	System.out.println(smallest);
		
		
		
		
		

			
	}
	

}
