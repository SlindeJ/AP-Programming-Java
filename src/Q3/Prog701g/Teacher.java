package Q3.Prog701g;

public class Teacher extends Person {
    private int numStudents;

    public Teacher(String fn, String ln, int numStu) {
        super(fn, ln);
        numStudents = numStu;
    }

    public int getNumStudents() { return numStudents; }
}
