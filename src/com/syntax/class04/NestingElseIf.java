package com.syntax.class04;

public class NestingElseIf {

	public static void main(String[] args) {
		/*if student completed a quiz we will check for a score
		 * if score>90--->great job
		 * if score>80--->well done
		 * if score>70-->you could have done better
		 * 
		 * if student did not completed the quiz--> not good
		 * please do homework ontime
		 */
		
		boolean quizCompleted=false;
		int score=46;
		
		if(quizCompleted) {
			System.out.println("Lets check your score");
			if(score>90) {
				System.out.println("Great job,you study a lot");
			
		    }else if(score>80) {
			System.out.println("well done");
		    }else if(score>70) {
			System.out.println("You could done better");
		    }else {
			System.out.println("You failed");
		    }
		
	    }else {
		System.out.println("Please do HW ontime");
		
	  }	

	}

}