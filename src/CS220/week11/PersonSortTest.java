package CS220.week11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class PersonSortTest {

	public static void main(String[] args) {
//https://help.intrexx.com/apidocs/jdk17/api/java.base/java/util/List.html
//List: An ordered collection (also known as a sequence). 
//The user can access elements by their integer index (position in the list), and search for elements in the list.		
		// (1) Create a list of students
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("bob", 21, "108"));
		studentList.add(new Student("phil", 77, "999"));
		studentList.add(new Student("mary", 11, "274"));
//		Iterator<Student> = studentList.iterator();
		// (2) Use enhanced loop to print out student info
		for (Student s : studentList) {
			System.out.println(s);
		}
		// (3) Sort students by their "nature order"
		// call sort method defined in the List class,
		// note: sort() is a default method defined in the List interface
		// "null" here means no comparator provided, use
		// "natural order" of the objects
		studentList.sort(null);
		// (4) after sort, use iterator to print out student objects in the list
		// Lecture8.1, slide#15
		for (Iterator<Student> i = studentList.iterator(); i.hasNext();) {
			System.out.println(i.next());
		}
		// (7) sort student list again by using customized comparator objects
		studentList.sort(new IdComparator());
		// (8) convert a list to an array, and print out student info
		System.out.println("\nAfter sort");
		Student[] studentarray = studentList.toArray(new Student[studentList.size()]);
		for (Student s : studentarray) {
			System.out.println(s);
		}
		System.out.println(Arrays.toString(studentarray));
	}
}
//(5) Implement Comparator interface to create customized 
//comparator other than "natural order" for the objects of Student class
//create a IdComparator to sort students based on their id
//extra question: how to order students based on id in descending order? 
class IdComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		// compare id: string, use compareTo() method from java.lang.String class
		return a.getStudentId().compareTo(b.getStudentId());
	}
}
//(6) comparator that orders students based on name first and then age in ascending order 
//extra question: how to order students based on name and then age in descending order? 
class NameAgeComparator implements Comparator<Student> {
	public int compare(Student a, Student b) {
		if (Integer.compare(b.getAge(), a.getAge()) != 0) {		// descending order
			return Integer.compare(a.getAge(), b.getAge());
		}
		else {
			return b.getName().compareTo(a.getName());		// descending order
		}
	}
}
