package CS220.week12;

//create another class named Student as a subclass of Person class
public class Student extends Person {
	// (1) add studentId as a private instance variable
	private String studentId;

	// (2) add a constructor
	public Student(String name, int age, String studentId) {
		super(name, age); // call Person constructor to set up name and age
		this.studentId = studentId;

	}

	// a get method that return student id
	public String getStudentId() {
		return studentId;
	}

	// (3) add a toString() method
	@Override
	public String toString() {
		return String.format("Name:%s, Age:%d, StudentId: %s", getName(), getAge(), getStudentId());
	}

	@Override
	public boolean equals(Object obj) {
		// (2) add Java code here to complete the method
		// if two Student objects have the same id, then they are equal

		return true; // note: return statement needs to be modified.
	}

	@Override // Person.hashCode() method
	public int hashCode() {
		// (3) add Java code here to complete the method
		// generate hashCode for each Student object instance
		// that matches the equals() method, use "studentId" field

		return 0; // note: return statement needs to be modified.
	}

	/**
	 * Object.hashCode(): use to get the hashcode of a single, non-null object
	 * Objects.hashCode(): use to get the hashcode of a single object that might be
	 * null Objects.hash(): use to get a hashcode for multiple objects
	 */

}
