package CS220.week6;

//import java.lang.classfile.attribute.SourceFileAttribute;
//import java.sql.SQLOutput;
//import java.util.Scanner;
//
//public class ReviewSystem2 {
//
//	public static void main(String[] args) {
//
//		//(1) create a Reviews object instance that can contain a list of Review objects
//		Reviews reviewList = new Reviews();
//
//		//(2) adding comments and rating to each Review object
//		//call addNewReview() method
//
//
//		//(3) view all reviews
//		//call viewAllReviews() method
//
//
//	    //(4) print out the average rating.
//		//call getAverageRating() method
//
//
//		//(5) output all comments for given rating
//	    //call viewComments() method
//
//
//	    //(6) create a console menu
//	    Scanner sc = new Scanner(System.in);
//		//loop a menu
//		while(true) {
//			//call displayMenu() method
//			displayMenu();
//			//(7) get user choice, use switch-case statement to call different methods to complete different tasks
//			int userChoice = sc.nextInt();
//			switch(userChoice) {
//				case 1: addNewReview(reviewList);
//				case 2: viewAllReviews(reviewList);
//				case 3: getAverageRating(reviewList);
//				case 4; viewComments(reviewList);
//				default: sc.close(); System.exit(0);
//			}
//
//		}
//	    //sc.close();
//	}//end of the main method
//
//	/**
//	 * addNewReview: add new review(s)
//	 * @param reviewList
//	 */
//	public static void addNewReview(Reviews reviewList) {
//		System.out.println("Type rating + comments. To end: -1");
//		Scanner scnr = new Scanner(System.in);
//		reviewList.inputReviews(scnr);
//	}
//
//	/**
//	 * viewAllReviews: view all reviews
//	 * @param reviewList
//	 */
//	public static void viewAllReviews(Reviews reviewList) {//add code to complete this method
//		reviewList.viewAllReviews(); // call reviews object's inputReviews() method
//	}
//
//	/**
//	 * getAverageRating: get average rating
//	 * @param reviewList
//	 */
//	public static void getAverageRating(Reviews reviewList) {//add code to complete this method
//		System.out.printf("Average rating is: %.wf\n", reviewList.getAverageRating());
//	}
//
//	/**
//	 * viewComments: view comments under a rating
//	 * @param reviewList
//	 */
//	public static void viewComments(Reviews reviewList) {//add code to complete this method
//		 int currRating = -1;
//		 Scanner scnr = new Scanner(System.in);
//		System.out.println("Type rating to review comments. to end enter -1");
//		while ((currRating = scnr.nextInt()) != 1) {
//
//		}
//	}
//
//	public static void displayMenu() {//add code to complete this method
//		//create a menu
//		final String[] MENU = {"add new review", "view all reviews", "get average reviews", "view comments", "quit"};
//
//		//display the menu in console
//		for (int i = 0; i < MENU.length; i++) {
//			System.out.printf("%s: %s\n", (i + 1), MENU[i]);
//		}
//	}
//
//}
