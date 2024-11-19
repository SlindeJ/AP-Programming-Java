package CS220.take_home8;

public class RightTriangle extends Polygon {
    private double height;
    private double base;
    public RightTriangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    public double getArea() { return base * height / 2; }
    public double getPerimeter() { return base + height + Math.sqrt((base*base+height*height)); }
    public String getName() { return this.getClass().getSimpleName(); }
    public String toString() { return STR."\{this.getName()} has an area of \{this.getArea()}m^2 and perimeter of \{this.getPerimeter()}m"; }
    public int getNumberOfSides() { return 3; }
}
