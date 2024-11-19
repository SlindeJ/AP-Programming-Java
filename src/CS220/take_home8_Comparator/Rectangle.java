package CS220.take_home8_Comparator;

public class Rectangle extends Quadrilateral{
    private double length;
    private double width;

    public Rectangle(double sideLength, double sideLength1) {
        length = sideLength;
        width = sideLength1;
    }

    public double getArea() { return length * width; }
    public double getPerimeter() { return 2 * (length + width); }
    public String getName() { return this.getClass().getSimpleName(); }
    public String toString() { return STR."\{this.getName()} has an area of \{this.getArea()}m^2 and perimeter of \{this.getPerimeter()}m"; }
    public int getNumberOfSides() { return 4; }
}
