package CS220.week12;

import java.util.Objects;

//define class person
public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	// Note: You should override hashCode() in Java when you override the equals()
	// method.
	// Here's why: contract between equals() and hashCode():
	// (1) If two objects are equal according to the equals() method, they must have
	// the same hash code.
	// (2) If two objects have different hash codes, they must not be equal
	// according to the equals() method.

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // indicate same object
			return true;
		if (obj == null || getClass() != obj.getClass()) // special cases that the two objects are not equal
			return false;
		Person person = (Person) obj; // type casing Object obj to Person object
		System.out.println("use person equals here");
		return age == person.age && name.equals(person.name);
		// if both age and name of the two objects are the same.
	}

	@Override
	public int hashCode() {
		System.out.println("use person hash code here: " + Objects.hash(name, age));
		return Objects.hash(name, age); // generate a hash code based on multiple fields
		// relies on multiple fields to determine equality, two objects have same name
		// and same age
		// will receive the same hashCode.
		// here hashCode() and equals() method are consistent.
	}

	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
