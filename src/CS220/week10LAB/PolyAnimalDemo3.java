package CS220.week10LAB;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PolyAnimalDemo3 {

	public static void main(String[] args) {
		 Fish goldenFish = new Fish(0, 0, "fish");
		 Frog greenFrog = new Frog(0, 0, "frog");
		 Bird whiteBird = new Bird(0, 0, "bird");
		 
//apply polymorphism: (1) use method overriding to provide different implementations for the same method prototype 
		 goldenFish.move();
		 System.out.printf("goldenFish: (%.2f, %.2f)\n", goldenFish.getPosition()[0], goldenFish.getPosition()[1]);
		 greenFrog.move();
		 System.out.printf("greenFrog: (%.2f, %.2f)\n", greenFrog.getPosition()[0], greenFrog.getPosition()[1]);
		 whiteBird.move();
		 System.out.printf("whiteBird: (%.2f, %.2f)\n", whiteBird.getPosition()[0], whiteBird.getPosition()[1]);
		 

//apply polymorphism: (2) use superclass reference variable to reference objects of subclasses
//variable "animalList" is polymorphic because "Animal"-type reference variables are used to reference "Animal"'s subclass types of objects  

//In the PolyAnimal ArrayList new animals are created by calling constructor with three parameters
//the Fish object should be created with a location(1, 1) with a non-empty String id
//the Frog object should be created with a location(-3.5, 2) with a non-empty String id
//the Bird object should be created with a location (5, -5.2) with a non-empty String id 		 
		 ArrayList<PolyAnimal> animalList = new ArrayList<PolyAnimal>(
				 										Arrays.asList( 
				 											new Fish(1, 1, "coolfish"), 
				 											new Frog(-3.5, 2, "smilefrog"), 
				 											new Bird(5, -5.2, "angrybird")
				 										)
				 									);
		 
		 
		 //step-4: call displayAnimalList() method to display a list of available animals
		displayAnimalList(animalList);
		 
		 Scanner input = new Scanner(System.in);
		 String message = "\nChoose an animal from the list to move: ";
		 int validChoice = 1;
		 while (validChoice <= animalList.size()) {
			 validChoice = getUserChoice(message, input, animalList.size());
			 if (validChoice == animalList.size() + 1)
				 break; //quit
			 validChoice--;

			 //step-5.1: call move() method to move the animal that user choices
			 animalList.get(validChoice).move();
			
			 //step-5.2: display the animal info after move it (use the toString() method)
			 animalList.get(validChoice).toString();
		 }
		 
		 //step-6: call distanceFrom() method (defined in PolyAnimal class)
		 //to get and display the distance between two animals
		 //you may use nested for loop to get two different animals in the list
		validChoice = 0;
		for (int i = 0; i < animalList.size(); i++) {
			if (!(animalList.get(i).getId().equals(animalList.get(validChoice).getId()))) {
				double distance = animalList.get(validChoice).getDistanceFrom(animalList.get(validChoice), animalList.get(i));	// (animal a, animal b)
				System.out.println("Distance between " + animalList.get(i).getClass().getSimpleName() + " and " + animalList.get(validChoice).getClass().getSimpleName() + ": " + distance);
			}
		}
		double distance = animalList.get(validChoice).getDistanceFrom(animalList.get(1), animalList.get(2));	// (animal a, animal b)
		System.out.println("Distance between " + animalList.get(2).getClass().getSimpleName() + " and " + animalList.get(1).getClass().getSimpleName() + ": " + distance);


		 
	}
	/**
	 * displayAnimalList: get animal info from the animal objects in the animalList
	 * and display them as a numbered list for user to choose from
	 * @param animalList
	 */
	public static void displayAnimalList(ArrayList<PolyAnimal> animalList) {
		 String message ="";
		 for (int i=0; i<animalList.size(); i++) {
			 message += String.format("\n%d. %s", (i+1), animalList.get(i));
		 }
		 message += String.format("\n%d. %s", animalList.size()+1, "Quit");
		 System.out.println(message);
	}
	
	/**
	 * getUserChoice: get the animal that user picked
	 * @param message
	 * @param sc
	 * @param animalSize
	 * @return
	 */
	public static int getUserChoice(String message, Scanner sc, int animalSize) {
		   int num = 0;
		   while (true)
		   {
			   System.out.print(message);
			   try {
				   num = sc.nextInt();
				   if (num <  1 || num > animalSize + 1) {  
					   throw new InputMismatchException();
				   }
				   else break; 
			   }
			   catch(InputMismatchException e) {
				   System.err.println("Invalid input! Try again!");
				   sc.nextLine(); //get invalid input from input stream and ignore invalid input, i.e.,  invalid input from input stream buffer
			   }
			
		   }
		   
		   return num;
    }

}



