package CS220.week12;

import java.util.HashSet;

public class PersonSetTest {

	public static void main(String[] args) {

		HashSet<Person> people = new HashSet<>();
		Person p1 = new Person("Alice", 25);
		Person p2 = new Person("Bob", 30);
		Person p3 = new Person("Alice", 25); // Duplicate

//Each Person object will be saved to HashSet based on its hash code
//When two Person objects have the same hash code, they will be mapped to the same location
//in a hash table. So when the 2nd "Alice" added to the HashSet, it will be compared with the 
//first "Alice" stored in the same location, if they are equal or not, by calling equals() method
//if they are equal, then the 2nd "Alice" will be treated as duplicate object,
//and then ignored (i.e., will not be added to the HashSet		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		System.out.println(people);

//(1) create HashSet<Person> to store Student object instances
//add four new Student object instances into the set.
//print out the objects in the set.		

	}
}
