import java.util.Scanner;

public class ReviewSystem2 {
      
	public static void main(String[] args) {
		
		//(1) create a Reviews object instance that can contain a list of Review objects
		Reviews reviewList = new Reviews();
	
		//(2) adding comments and rating to each Review object
		//call addNewReview() method
		
		
		//(3) view all reviews
		//call viewAllReviews() method
		
		
	    //(4) print out the average rating.
		//call getAverageRating() method
	
		
		//(5) output all comments for given rating
	    //call viewComments() method
	   
	    
	    //(6) create a console menu 
	    Scanner sc = new Scanner(System.in);
		//loop a menu
		//while(true) {
			//call displayMenu() method
			
			//(7) get user choice, use switch-case statement to call different methods to complete different tasks
			
			
		//}
	    sc.close();  
	}//end of the main method
    
	/**
	 * addNewReview: add new review(s)			
	 * @param reviewList
	 */
	public static void addNewReview(Reviews reviewList) { 
		System.out.println("Type rating + comments. To end: -1");
		Scanner scnr = new Scanner(System.in);
		reviewList.inputReviews(scnr);
	}
	
	/**
	 * viewAllReviews: view all reviews
	 * @param reviewList
	 */
	public static void viewAllReviews(Reviews reviewList) {//add code to complete this method
		
	}
	
	/**
	 * getAverageRating: get average rating
	 * @param reviewList
	 */
	public static void getAverageRating(Reviews reviewList) {//add code to complete this method
		
	}
	
	/**
	 * viewComments: view comments under a rating
	 * @param reviewList
	 */
	public static void viewComments(Reviews reviewList) {//add code to complete this method
		 
	}
	
	public static void displayMenu() {//add code to complete this method
		//create a menu
		
		//display the menu in console
		
	}
	
}
