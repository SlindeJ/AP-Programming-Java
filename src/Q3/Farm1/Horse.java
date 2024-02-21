package Q3.Farm1;

public class Horse extends Animal {
    private int myNumRides;
    private double myRideCost;

    public Horse(String name, int weight, int corn, int hay, int rides, double cost) {
        super(name, weight, corn, hay);
        myNumRides = rides;
        myRideCost = cost;
    }

    public double value(double cornCost, double hayCost) {
        return myNumRides * myRideCost - getFeedCost(cornCost, hayCost);
    }

    @Override
    public String getName()     { return super.getName() + super.getName(); }   // calls getName() from the SUPERCLASS

    public int getRides()       { return myNumRides; }
    public double getRideCost() { return myRideCost; }
}
