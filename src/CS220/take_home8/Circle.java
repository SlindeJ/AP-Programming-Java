package CS220.take_home8;

public class Circle extends Shape {
    private double radius;
    public double getRadius() { return radius; }
    public double getArea() { return Math.PI * radius * radius; }
    public double getPerimeter() { return 2 * Math.PI * radius; }
    public String getName() { return this.getClass().getSimpleName(); }
    public String toString() { return "[name] has an area of [area]m^2 and perimeter of [perimeter]m"; }
}
