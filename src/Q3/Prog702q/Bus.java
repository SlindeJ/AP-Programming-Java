package Q3.Prog702q;

public class Bus extends Vehicle {
    private String homeTown;

    public Bus(String name, int tires, double value, String homeTown) {
        super(name, tires, value);
        this.homeTown  = homeTown;
    }

    public String getHomeTown() {
        return homeTown;
    }
}
