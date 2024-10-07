//import java.util.ArrayList;
//import java.util.Scanner;
package CS220.week6;

public class ReviewAndReviewsTest {

	public static void main(String[] args) {
	    //Review class demo and test program
		Review newReview = new Review();
		System.out.println(newReview);
		newReview.setRatingAndComment(4, "This is a new comment.");
		System.out.println("Add Review Rating: "+ newReview.getRating());
		System.out.println("Add Review Comment: "+ newReview.getComment());
		System.out.println(newReview);
		
		//Reviews class demo and test program
		//Reviews newReviewList = new Reviews();
		//System.out.println(newReviewList); 
		/*Note: because in the Reviews class, there is no toString() method
		defined, so the Object class's instance method toString() method will be called here
		that toString() method will return: getClass().getName()+"@"+Integer.toHexString(hashCode());
		the toString() method
		So in order to print out the ArrayList of Review objects, 
		need to define a method in Reviews class to print out all Review objects.
		*/
		//final Scanner keyboard = new Scanner(System.in);
		//System.out.println("Type rating + comments. To end: -1");
		//newReviewList.inputReviews(keyboard);        
		//newReviewList.viewAllReviews();
	} 
	
}
