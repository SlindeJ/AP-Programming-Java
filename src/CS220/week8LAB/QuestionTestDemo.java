package CS220.week8LAB;


import java.util.ArrayList;
import java.util.Scanner;

public class QuestionTestDemo {

	public static void main(String[] args) {
		
		// Create a quiz an ArrayList named "quiz" that contains all kinds of questions
		ArrayList<Question> quiz = createQuiz();
	    // display quiz
        displayQuiz(quiz);
	}
	
	/**
	 * create a quiz that is an ArrayList of all kinds of questions
	 * @return an ArrayList of questions as a quiz
	 */
	//step-4: add java code to complete this method
	public static ArrayList<Question> createQuiz(){
		ArrayList<Question> quiz = new ArrayList<Question>();
		
		//create a new FillInQuestion question and add it to quiz
		//create a new ChoiceQuestion question and add it to quiz
		//create a new MultiChoiceQuestion question and add it to quiz
		//create a new NumericQuestion question and add it to quiz
		//create a new FreeResponse question and add it to quiz
		
	    return quiz;
	}
	
	/**
	 * display quiz questions and ask user to answer those questions
	 * @param quiz
	 */
	//step-5: add java code to complete this method
	public static void displayQuiz(ArrayList<Question> quiz) {
		Scanner input = new Scanner(System.in);
		//add a loop here to display each question in the quiz
		//get user answer from keyboard input
		//check user answer and display result (i.e., true or false, means answer is correct or not)
	}

}
