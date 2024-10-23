package CS220.week8.abstractClass_StudentEx;

//This program demonstrate abstract class and abstract method
public class CompSciStudentDemo{
	public static void main(String[] args)
	{
		//Create a ComSciStudent object
		ComSciStudent csStudent = new ComSciStudent("Jennifer Haynes", "167W98337", 2015);
		//Score values for math, CS, and gen ed Credits
		csStudent.setMathCredits(12);
		csStudent.setCsCredits(20);
		csStudent.setGenEdCredits(40);
		
		//Display the student's data
		System.out.println(csStudent); // the toString method in Student class will be called
		
		//Display number of remaining Credits
		System.out.println("Credits remaining: " + csStudent.getRemainingCredits());
	}

}

