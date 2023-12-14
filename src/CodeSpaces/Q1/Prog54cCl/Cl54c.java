package CodeSpaces.Q1.Prog54cCl;

public class Cl54c {
    private double radius;
    private double circ; // circumference
    private double area;

    public Cl54c(double radi) { // radius input
        radius = radi;
        circ = 0;
        area = 0;
    }

    public void calc() {
        circ = 2 * 3.14159 * radius;
        area = 3.14159 * Math.pow(radius, 2);
    }

    public double getCirc() { return circ; }
    public double getArea() { return area; }


}
