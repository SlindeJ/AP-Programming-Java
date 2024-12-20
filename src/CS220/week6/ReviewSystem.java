package CS220.week6;

import java.util.ArrayList;
import java.util.Scanner;

public class ReviewSystem {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		//create an ArrayList object that can contain a list of Review objects
		ArrayList<Review> reviewList = new ArrayList<Review>();
		
		Review currReview;
		int currRating;
		String currComment;
		int i;
		
		//adding comments and rating to each Review object
		System.out.println("Type rating + comments. To end: -1");
		currRating = scnr.nextInt();
		while (currRating >=0) {
			currReview = new Review();
			currComment = scnr.nextLine(); 
			currReview.setRatingAndComment(currRating, currComment);
			reviewList.add(currReview);
			currRating = scnr.nextInt();
		}
		
		 // Output all comments for given rating
	      System.out.println();
	      System.out.println("Type rating. To end: -1");
	      currRating = scnr.nextInt();
	      while (currRating != -1) {
	         for (i = 0; i < reviewList.size(); ++i) {
	            currReview = reviewList.get(i);
	            if (currRating == currReview.getRating()) {
	               System.out.println(currReview.getComment());
	            }
	         }
	         currRating = scnr.nextInt();
	      }

	}

}
