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
		FillInQuestion q1 = new FillInQuestion("Are you cool?", "Not as cool as you");	// creates question of FillInQuestion type
		quiz.add(q1);												// can go in quiz as all are question types
		//create a new ChoiceQuestion question and add it to quiz
		ChoiceQuestion q2 = new ChoiceQuestion();
		q2.addText("Coolest College?");
		q2.addChoice("UW-Madison", false);
		q2.addChoice("UW-Whitewater", true);
		q2.addChoice("UW-Stout", false);
		quiz.add(q2);
		//create a new MultiChoiceQuestion question and add it to quiz
		MultiChoiceQuestion q3 = new MultiChoiceQuestion();
		q3.addText("Whitewater Building Names?");
		q3.addChoice("Joshua", false);
		q3.addChoice("Hyland", true);
		q3.addChoice("McFarland", false);
		q3.addChoice("Hope", false);
		q3.addChoice("Upham", true);
		quiz.add(q3);
		//create a new NumericQuestion question and add it to quiz
		System.out.println(67.0/11);
		NumericQuestion q4 = new NumericQuestion("What is 67/11?", (67.0/11.0));
		quiz.add(q4);
		//create a new FreeResponse question and add it to quiz
		FreeResponse q5 = new FreeResponse("How old am I?");
		q5.setAnswer("18");
		quiz.add(q5);
	    return quiz;
	}
	
	/**
	 * display quiz questions and ask user to answer those questions
	 * @param quiz
	 */
	//step-5: add java code to complete this method
	public static void displayQuiz(ArrayList<Question> quiz) {
		Scanner input = new Scanner(System.in);	// good
		//add a loop here to display each question in the quiz
		//get user answer from keyboard input
		//check user answer and display result (i.e., true or false, means answer is correct or not)
		int qNum = 0;
		while (qNum < quiz.size()) {
			System.out.println("Question #" + (qNum + 1));
			System.out.println("Question type: " + quiz.get(qNum).getClass().getSimpleName());
			quiz.get(qNum).display();
			System.out.print("Enter your answer: ");
			String answer = input.nextLine();
			System.out.println(quiz.get(qNum).checkAnswer(answer));
			qNum++;
		}
	}

}
