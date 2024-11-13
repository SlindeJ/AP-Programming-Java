package CS220.week11;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

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

	@Override
	public int compareTo(Person other) {
		// Sort by age first, use compare() method defined in java.lang.Integer class
		int ageComparison = Integer.compare(this.age, other.age);
		if (ageComparison != 0) {
			return ageComparison;
		} else {
			// If ages are equal, sort by name, use compareTo() method defined in
			// java.lang.String class
			return this.name.compareTo(other.name);
		}
	}

}
