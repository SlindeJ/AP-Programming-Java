package Q3.Prog701g;

public class Student extends Person {
    private Double gpa;

    public Student(String fn, String ln, Double gpa) {
        super(fn, ln);
        this.gpa = gpa;
    }

    public Double getGPA() { return gpa; }
}
