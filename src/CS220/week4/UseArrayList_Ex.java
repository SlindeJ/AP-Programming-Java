
import java.util.ArrayList;
import java.util.Arrays;

public class UseArrayList_Ex {
	
	public static void main(String[] args) {
	/*please note here without using type parameter, 
	it is equivalent to ArrayList<Object> which means this array list can hold objects potentially any type
	But most of the time, we prefer to add type parameter to specify what type of objects 
	this array list will hold. We want the array list holds the same type of objects.
	The advantage of using type parameter is to invoke type checks at compilation time 
	*/
	ArrayList list = new ArrayList(); 
	// ArrayList<String> list = new ArrayList<String>();
	list.add("this");
	list.add(10);
	list.add(true);
	
	System.out.println("An array list: " + list.toString());
	
	//Use ArrayList 
	String[] line = {"Kylo", "Finn", "Rey", "Maz", "Leia"}; 
	//to convert an array to an list, use Arrays.asList() method
	ArrayList<String> line_list = new ArrayList<String>(Arrays.asList(line)); 
	//use a list as an initializer to create an ArrayList object
	for (String person: line_list) //use enhance for loop to access elements in array list
	System.out.println(person);
	System.out.println(Arrays.toString(line));
	System.out.println(line_list); //print out elements in an array list
	//(1) The person at the front of the line (index 0) leaves the line (use remove(index) method).
	System.out.printf("Remove the person (%s) at the front of the line.\n", line_list.remove(0));
	System.out.println(line_list);
	//(2) The person at the end of the line cuts in front of the person at the front of the line (remove last and add it back to the front).
	//Find the index of last object in the array list, use size() method
	String person_cut = line_list.remove(line_list.size()-1);
	System.out.printf("\nThe person %s at the end of the line cuts in front of the line.\n", person_cut);
	line_list.add(0, person_cut);
	System.out.println(line_list);
	//(3) Two new people named "Poe" and "Snoke" cut into line behind the second person in line (use add(index, element) method).
	System.out.println("\nTwo new people named \"Poe\" and \"Snoke\" cut into the line behind the 2nd person in line.");
	line_list.add(1, "Poe");
	line_list.add(2, "Snoke");
	System.out.println(line_list);
	//(5)A new person named "Han" enters the back of the line (add(element) method).
	line_list.add("Han");
	System.out.println("\nAdd a new person \"Han\" at the end of the line");
	System.out.println(line_list);
	//(6)Find a person named "Rey" in the list (use contains() or indexOf() method)
	line_list.contains("Rey");
	System.out.println("\nFind a person named \"Rey\" in the list");
	System.out.println(line_list.contains("Rey")); //return true 
	System.out.println(line_list.indexOf("Rey")); //return the first index of the element that matches
	//(7) Get first person's name in the line (use get(i) method to find element with given index)
	System.out.println("The first person in the line is: " + line_list.get(0));

	}//end of the main method
}
