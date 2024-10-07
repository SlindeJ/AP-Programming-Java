package CS220.week6;

public class Review {
    //instead use constructor to initialize instance variables
	//declare and initialize instance variables at the same time
	private int rating = 0;  
	private String comment = "";
	
	//since no constructor is defined in this class,  
	//default constructor created by compiler will be used
	//to create object instance 
	
	public void setRatingAndComment (int revRating, String revComment) {
		rating = revRating;  //since parameter name is different from instance variable name, use this keyword is optional
		comment = revComment;
	}
	
	/* to allow user to add/update rating and comments separately
	public void setRating(int revRating) {
		rating = revRating;
	}
	public void setComment(String revComment) {
		comment = revComment;
	}
    */ 
	public int getRating() {return rating; }
	
	public String getComment() {return comment; }
	
	//add a toString() method to return a string contains all info about a review
	public String toString() {
		return String.format("%d:%s", rating, comment);
	}
}
