//package CS220.week8;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//import w11.Bird;
//
//public class PolyAnimalDemo {
//
//	public static void main(String[] args) {
//
//		 Animal animal = new Animal();
//		 Fish goldenFish = new Fish();
//		 Frog greenFrog = new Frog();
//		 //step-1: create a new Bird object named whiteBird
//		 Bird whiteBird = new Bird();
//
////apply polymorphism: (1) use method overriding to provide different implementations for the same method prototype
//		 animal.move();
//		 goldenFish.move();
//		 System.out.printf("goldenFish: (%.2f, %.2f)\n", 0, 0);
//		 greenFrog.move();
//		 System.out.printf("greenFrog: (%.2f, %.2f)\n", 0, 0);
//		 whiteBird.move();
//		 System.out.printf("whiteBird: (%.2f, %.2f)\n", 0, 0);
//
//		 //step-4: move godenFish to the position of greenFrog
//
//
////apply polymorphism: (2) use superclass reference variable to reference objects of subclasses
////variable "animalArray" is polymorphic because "Animal"-type reference variables are used to reference "Animal"'s subclass types of objects
//		 Animal[] animalArray = new Animal[] {new Fish(), new Frog(), new Bird()};
//		 String message = "\nChoose one type of animals that you want to move: ";
//		 message += "\n1. Fish\n2. Frog\n3. Bird\n4. quit\n";
//
//		 Scanner input = new Scanner(System.in);
//		 int validChoice = 1;
//		 while (validChoice <= animalArray.length) {
//			 validChoice = getUserChoice(message, input, animalArray);
//			 if (validChoice == animalArray.length + 1)
//				 break; //quit
//			 //move the animal that user choices
//			 animalArray[validChoice-1].move();
//			 //step-3: display the position of each animal position after move it
//
//		 }
//
//		 //step-4. test moveTo method by moving the arrayArray[0] (references to a Fish object)
//		 //to the position where arrayArray[2] (references to a Bird object) located.
//
//	}
//
//
//	public static int getUserChoice(String message, Scanner sc, Animal[] animalArray) {
//		   int num = animalArray.length;
//		   while (true)
//		   {
//			   System.out.print(message);
//			   try {
//				   num = sc.nextInt();
//				   if (num <  1 || num > animalArray.length + 1) {
//					   throw new InputMismatchException();
//				   }
//				   else break;
//			   }
//			   catch(InputMismatchException e) {
//				   System.err.println("Invalid input! Try again!");
//				   sc.nextLine(); //get invalid input from input stream and ignore invalid input, i.e.,  invalid input from input stream buffer
//			   }
//
//		   }
//
//		   return num;
//	   }
//
//
//}
//
//class Animal{
//	protected double x_coordinate;  //subclasses can access protected members in a superclass
//	protected double y_coordinate;
//
//	//step-2: add two constructors in the Animal class:
//	//one constructor with two parameters that accepts arguments to
//	//initialize the two instance variables: x_coordinate and y_coordinate.
//
//
//	//One default constructor that calls the constructor with two parameters
//	//to initialize the two instance variables with value 0.0.
//
//
//
//
//	public void move() {
//		++x_coordinate;
//		++y_coordinate;
//
//		System.out.printf("%s moved %.1f feet\n", this.getClass().getSimpleName(), 2.0 );
//	}
//
//	//step-3: add a method named “getPosition” in the Animal class that
//	//returns x_coordinate and y_coordinate of the Animal object as an array.
//
//}
//
//// class Fish
//class Fish extends Animal{
//	@Override
//	public void move() {
//		swim(3);
//	}
//
//	//we assume fish can move on x-axis only
//	private void swim(double feet) {
//		x_coordinate += feet;
//		System.out.printf("%s swam: %.1f feet.\n", this.getClass().getSimpleName(), feet);
//	}
//
//	//step-4: add a method named “moveTo” in the Fish class,
//	//that move a Fish object to a position that another animal located.
//
//
//
//}
//
////class Frog
//class Frog extends Animal{
//	@Override
//	public void move() {
//		jump(5);
//	}
//
//	//we assume frog can move on y-axis only
//	private void jump(double feet) {
//		y_coordinate += feet;
//		System.out.printf("%s jumped: %.1f feet.\n", this.getClass().getSimpleName(), feet);
//	}
//
//}
//
////Step-1: add class Bird here: Bird class extends Animal class, Bird can move by fly
////fly distance is calculated by the square root of ( square of distance moves on x-axis + square of distance moves on y-axis)
//class Bird{
//
//}
//
