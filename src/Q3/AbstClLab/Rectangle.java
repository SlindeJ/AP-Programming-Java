package Q3.AbstClLab;

public class Rectangle extends NotCircle {
    private double width;

    public Rectangle(double h, double w) {
        height = h;
        width = w;
    }

    public void setHeight(double height) { this.height = height; }
    public void setWidth(double wid) { width = wid; }
    public double getHeight() { return height; }
    public double getWidth() { return width; }

    public void calculateArea() {
        System.out.println("Area: " + (width * height));
    }
    public void calculateCircumference() {
        System.out.println("Perimeter: " + (2 * width + 2 * height));
    }

    public void calculatePerimeter() {
        this.calculateCircumference();
    }
}
