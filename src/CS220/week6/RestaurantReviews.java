package CS220.week6;
//
//import java.util.Scanner;
//
//public class RestaurantReviews {
//
//   public static void main (String [] args) {
//      Scanner scnr = new Scanner(System.in);
//      Restaurant ourPlace = new Restaurant();
//      String currName;
//
//      System.out.println("Type restaurant name: ");
//      currName = scnr.nextLine();
//      ourPlace.setName(currName);
//
//      //add reviews
//      System.out.println("Add reviews");
//      ourPlace.addReviews(scnr);
//      System.out.println();
//
//      //print comments for each rating
//      ourPlace.printCommentsByRating();
//
//      //print out average rating of a restaurant
//      System.out.printf("\nThe average rating is: %.1f out of 5.0\n", ourPlace.getAvgRating());
//   }
//}