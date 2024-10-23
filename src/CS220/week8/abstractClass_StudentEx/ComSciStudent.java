package CS220.week8.abstractClass_StudentEx;

/**
 * The ComSciStudent class
 */
public class ComSciStudent extends Student {
	
	//Required credits
	private final int MATH_CREDITS = 15;   //math credit requirements
	private final int CS_CREDITS = 60;     //cs credit requirements
	private final int GEN_ED_CREDITS = 30; // Gen ed credit requirements
	
	//credits obtained
	private int mathCredits;
	private int csCredits;
	private int genEdCredits;
	
	/** The Constructor sets the the student's name, id and year admitted
	 */
	public ComSciStudent (String n, String id, int year)
	{
		super(n, id, year);
	}
	
	/** The setCsHours method sets the number of cs hours taken
	 */
	public void setCsCredits(int cs)
	{
		csCredits = cs;
	}
	
	/** The setMathHours method sets the number of math hours taken
	 */
	public void setMathCredits(int ms)
	{
		mathCredits = ms;
	}
	
	/** The setGenEdHours method sets the number of genEd hours taken
	 */
	public void setGenEdCredits(int gen)
	{
		genEdCredits = gen;
	}
	
	/** The getRemainingCredits method returns the number of hours 
	 * remaining to be taken. 
	 * It override the abstract method in Student class 
	 * @return The Credits remaining for the student
	 */
	public int getRemainingCredits() {
		int reqCredits, remainingCredits; 
	//Calculate the require Credits.
		reqCredits = MATH_CREDITS + CS_CREDITS + GEN_ED_CREDITS;
	//Calculate remaining hours.
		remainingCredits = reqCredits - (mathCredits + csCredits + genEdCredits);
		
		return (remainingCredits < 0) ? 0 : remainingCredits;
	}
	
}
