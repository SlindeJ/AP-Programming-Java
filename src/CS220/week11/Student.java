package CS220.week11;

//create another class named Student as a subclass of Person class
public class Student extends Person {
	// (1) add studentId as a private instance variable
    private String studentId;
	// (2) add a constructor
    public Student(String name, int age, String id) {
        super(name, age);
        studentId = id;
    }
	// (3) add a toString() method
	// @Override public String toString()
    public String getStudentId() { return studentId; }
}
