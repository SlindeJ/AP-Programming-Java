package CS220.week11;
import java.util.*;
import javax.swing.JOptionPane;

public class ListEx2 {
    private final static String OWNER = "TINA";
    private final static String[] customerMenuList = {"View cats", "View dogs", "View all animals", "quit"};
    private final static String[] ownerMenuList = {"View cats", "Add cats", "Delete cats", "View dogs", "Add dogs",
			"Delete dogs", "View all animals", "quit"};
    
	public static void main(String[] args) {
		//setup animal list
		List<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Snow", 1));
        catList.add(new Cat("White", 2));
        catList.add(new Cat("Ball", 5));
       
        List<Dog> dogList = new ArrayList<Dog>();
        dogList.add(new Dog("Sunny", 3));
        dogList.add(new Dog("Summer", 2));
        dogList.add(new Dog("Day", 7));
        
        List<Animal> allAnimals = null;
		
        //start menu
		System.out.println("Enter your name: ");
		Scanner s = new Scanner(System.in);
		String userName = s.next();
		String userChoice = "";
		String[] menuList = null;
		if (userName.equalsIgnoreCase(OWNER))
			//display a menu for owner
	       menuList = ownerMenuList; 
		else //indicates to display a menu for user
		   menuList = customerMenuList;
		
        do {
        	  userChoice = displayMenu(menuList,s); 
       System.out.println("you chose: " + userChoice); 	  
        	  switch(userChoice) {
        		case "View cats" -> displayAnimal(catList); 
        		case "View dogs" -> displayAnimal(dogList);
        		case "View all animals" -> {
	        			allAnimals = new LinkedList<Animal>();
	        			allAnimals.addAll(catList);
	        			allAnimals.addAll(dogList);
	        			displayAnimal(allAnimals);
        			}
        		case "Add cats" -> /*addCat(catList, new Scanner(System.in));*/
        		                   addAnimal(catList, new Cat("", 0));
        		case "Add dogs" -> addDog(dogList, new Scanner(System.in));
        		case "Delete cats" -> removeAnimal(catList, new Cat("Snow", 1)); //use the equals() method defined in the Animal class
        		case "Delete dogs" -> removeAnimal(dogList, dogList.get(dogList.size()-1));
        	  }
        } while(!userChoice.equals("quit"));
        
	}
    
	public static void removeAnimal(List<? extends Animal> animalList, Animal a) {
		System.out.println("Before remove: " + a);
		System.out.println(animalList);
		if(animalList != null) {
			animalList.remove(a);
			System.out.println("After remove: " + a);
			System.out.println(animalList);
		}
	}
	
    public static <T extends Animal>void addAnimal(List<T> animalList, T newAnimal){
    	if (animalList != null) {
    	  System.out.println("Enter new " + newAnimal.getClass().getSimpleName()+ " name and age: ");
    	  Scanner input = new Scanner(System.in);
    	  String name = input.nextLine().trim();
    	  System.out.println("name: " + name);
    	  
    	  
	      int age = input.nextInt();
	      System.out.println("age: " + age);
	    	//may add more input validation
	    	if (!name.isBlank() && age > 0) {
	    		newAnimal.setName(name);
	    		newAnimal.setAge(age);
	    	}
	    	animalList.add(newAnimal);	
    	}
    }
	public static void addCat(List<Cat> catList, Scanner input) {
		System.out.println("Enter cat name and age: ");
    	String name = input.next().trim();
    	int age = input.nextInt(); 
    	//may add more input validation
    	if (!name.isBlank() && age > 0)
    		catList.add(new Cat(name, age));
	}
	
	public static void addDog(List<Dog> dogList, Scanner input) {
		System.out.println("Enter dog name and age: ");
    	//Scanner input = new Scanner(System.in);
    	String name = input.next().trim();
    	int age = input.nextInt(); 
    	//may add more input validation
    	if (!name.isBlank() && age > 0)
    		dogList.add(new Dog(name, age));
	}
	/*
	public static <T extends Animal> void  addAnimal(List<T> animalList, Scanner input) {
		System.out.println("Enter  name and age: ");
    	//Scanner input = new Scanner(System.in);
    	String name = input.next().trim();
    	int age = input.nextInt(); 
    	//may add more input validation
    	if (!name.isBlank() && age > 0) {
    		T temp = new Dog(name, age);
    		animalList.add(temp);
    	}
	}
	*/
	/* Note: When using wildcard in the type parameter, can not use .add() method to add a specific object to the list
	 * should define separate methods to add specific animals to specific animal list
	 * */ 
	/*
    public static void addAnimal(List<? extends Animal> animalList, String type) {
    	//may add a new animal from console input, from file input, etc.
    	System.out.printf("Enter %s name and age: ", type);
    	Scanner input = new Scanner(System.in);
    	String name = input.next().trim();
    	int age = input.nextInt(); 
    	//may add more input validation
    	if (!name.isBlank() && age > 0) {          
	    	if (type.equals("cat"))
	    		animalList.add(new Cat(name, age));
	    	}
        	else if (type.equals("dog")) {
        		animalList.add(new Dog(name, age));
        	}
    	}
    }
    */
	 
	//List<? extends Animal> can be assigned to from all: List<Animal>, List<Cat>, List<Dog>
	public static void displayAnimal(List<? extends Animal> animalList) {
		/*for (int i=0; i<animalList.size(); i++) {
			System.out.println(animalList.get(i).getClass().getName()); 
			System.out.println(animalList.get(i).getName());
			System.out.println(animalList.get(i).speak());
		}*/
		
		System.out.println("Animal List:");
		System.out.println(animalList);
		
	}
	
	public static String displayMenu(String[] menuList, Scanner s) {
		
	      if (menuList != null && menuList.length > 0) {
	    	  
	      //version-1: display menu in a pop-up input box	  
		  /*String userChoice =(String) JOptionPane.showInputDialog(null, "Choose what you want to do:",
			        "AnimalList Practice", JOptionPane.QUESTION_MESSAGE, null, // Use default icon                                      
			        menuList, // Array of choices
			        menuList[0]); // Initial choice is "View cats" here;
		  */
	      //version-2: display menu in console	  
		  String userChoice = getUserChoice(menuList, s); //display menu in console
           	  return userChoice == null ? "quit": userChoice; 
	      }
	      else
	    	  return "quit";	  
	}	
	
	public static String getUserChoice(String[] menuList, Scanner sc) {
		   int num = 0;
		   while (true)
		   {
			   for (int i= 0; i< menuList.length; i++) {
				   System.out.printf("\n%d.%s", (i+1), menuList[i]);
			   }
			   try {
				   System.out.println("\nEnter your choice: ");
				   num = sc.nextInt();
				   if (num <  1 || num > menuList.length + 1) {  
					   throw new InputMismatchException();
				   }
				   else break; 
			   }
			   catch(InputMismatchException e) {
				   System.err.println("Invalid input! Try again!");
				   sc.nextLine(); //get invalid input from input stream and ignore invalid input, i.e.,  invalid input from input stream buffer
			   }
			
		   }
		   return menuList[num-1];
		   
	}
}

