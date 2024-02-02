package Q3.Prog703s;

public class Computer {
    protected String name;
    protected int number;
    protected double value;

    public Computer(String name, int number, double value) {
        this.name = name;
        this.number = number;
        this.value = value;
    }

    public String getName() { return name; }

    public double getValue() {
        return value;
    }

    public int getNumber() {
        return number;
    }
}
