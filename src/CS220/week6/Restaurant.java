
import java.util.Scanner;

import w6.Reviews;

public class Restaurant {
   private String name;
   private Reviews reviews = new Reviews();
   
   //Note: no constructor defined in this class
   
   /** 
    * setName: set/update restaurant name
    * @param restaurantName
    */
   public void setName(String restaurantName) {
      name = restaurantName;
   }
   
   /**
    * getName: return restaurant name
    * @return
    */
   public String getName()
   {
	   return name;
   }
   
   /**
    * addReviews: add new review to the review list of a restaurant
    * @param scnr
    */
      
   public void addReviews(Scanner scnr) {
	  System.out.println("Type rating + comments. To end: -1");
      reviews.inputReviews(scnr);
   }
   
   /**
    * printCommentsByRating: print out all comments for each rating level
    */
   public void printCommentsByRating() { 
      System.out.println("Comments for each rating level: ");
      for (int i = 1; i <= 5; ++i) {
         System.out.println(i + ":");
         reviews.printCommentsForRating(i);
      }
   }
   
   /**
    * getAvgRating: returns the average rating of a restaurant
    * @return
    */
   public double getAvgRating() {
	   return reviews.getAverageRating();
   }
   
}