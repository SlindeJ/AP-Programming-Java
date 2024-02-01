package Q3.Prog702q;

public class Vehicle implements names {
    protected String name;
    protected int tires;
    protected double value;

    public Vehicle(String name, int tires, double value) {
        this.name = name;
        this.tires = tires;
        this.value = value;
    }

    public int getTires() {
        return tires;
    }
    public double getValue() {
        return value;
    }
    public String getName() {
        return name;
    }
}
