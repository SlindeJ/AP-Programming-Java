package Q3.Prog702q;

public class Truck extends Vehicle {
    private int miles;

    public Truck(String name, int tires, double value, int miles) {
        super(name, tires, value);
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }
    public double getValue() { return value - (.25 * miles); }
}
