import java.util.ArrayList;
import java.util.Scanner;

public class Reviews { 
   private ArrayList<Review> reviewList = new ArrayList<Review>();
   
   //Note: no constructor defined in this class
   
   /**
    * inputReviews: to get review rating and comments, and then add them to reviewList
    * @param scnr
    */
   public void inputReviews(Scanner scnr) {
      Review currReview;
      int currRating;
      String currComment;
       
      currRating = scnr.nextInt();
      while (currRating >= 0) {
         currReview = new Review();
         currComment = scnr.nextLine(); // Gets rest of line
         currReview.setRatingAndComment(currRating, currComment);
         reviewList.add(currReview);
         currRating = scnr.nextInt();
      }
   }
   
   /**
    * printCommentsForRating: given a rating, print all review comments under that rating 
    * @param currRating
    */
   public void printCommentsForRating(int currRating) {
      Review currReview;
      int numComments = 0; //count the number of comments under the rating
      String revComments ="";
      int i;
      System.out.println(currRating + ":"); 
      for (i = 0; i < reviewList.size(); ++i) {
         currReview = reviewList.get(i);
         if (currRating == currReview.getRating()) {
            //System.out.println(currReview.getComment());
        	 revComments += String.format(" %s\n", currReview.getComment());
             numComments++;
         }
      }
      if (numComments == 0) 
      {
    	  System.out.println("No one gave this rating in the reviews!");
      }
      
      else if (revComments.isBlank()) { //isBlank() is a String method that returns true if the string is empty or contains only whitespace 
    	  System.out.println("no comments for this rating");
      }
      else {
    	  System.out.println(revComments);
      }
   }
   /**
    * getAverageRating: get all review ratings in the review list and calculate average rating
    * @return: double (average rating)
    */
   public double getAverageRating() {
      int ratingsSum = 0;
      for (int i = 0; i < reviewList.size(); ++i) {
         ratingsSum += reviewList.get(i).getRating();
      }
      double avgRate = reviewList.isEmpty()? 0 : (double) ratingsSum / reviewList.size();
      return avgRate;
   }
   
   //add a method viewAllReviews to print out all reviews in the list
   /**
    * viewAllReviews: print out all reviews in the list
    */
   public void viewAllReviews() {
	   if (reviewList.isEmpty())
	     System.out.println("No reviews."); 
	   else 
	   {
		   for (Review r: reviewList) {
			   System.out.println(r); //call each Review object r's toString() method to print out each review
		   }
	   }
   }
}
