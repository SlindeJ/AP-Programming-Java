package Q3.AbstClLab;

public class Triangle extends NotCircle {
    private double base;

    public Triangle(double h, double b) {
        height = h;
        base = b;
    }

    public void setHeight(double height) { this.height = height; }
    public void setWidth(double b) { base = b; }
    public double getHeight() { return height; }
    public double getWidth() { return base; }

    public void calculateArea() {
        System.out.println("Area: " + (.5 * base * height));
    }
    public void calculateCircumference() {
        double hype = Math.hypot(base, height);   // Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        System.out.println("Perimeter: " + (hype + base + height));
    }

    public void calculatePerimeter() {
        this.calculateCircumference();
    }
}

