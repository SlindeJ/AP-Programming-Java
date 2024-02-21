package Q3.Farm1;

public class Cow extends Animal {
    private static final double MILK_PRICE_LB = 0.20;   // static makes it across all cows and never changes
    private double myMilk;

    public Cow(String name, int weight, int corn, int hay, double milk) {
        super(name, weight, corn, hay);
        myMilk = milk;
    }

    public double value(double cornCost, double hayCost) {
        return myMilk * MILK_PRICE_LB - getFeedCost(cornCost, hayCost);
    }

    public double getMilk()             { return myMilk; }
    public static double getMilkPrice() { return MILK_PRICE_LB; }
}
