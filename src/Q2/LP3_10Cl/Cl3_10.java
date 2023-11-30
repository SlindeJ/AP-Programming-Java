package Q2.LP3_10Cl;

public class Cl3_10 {
    private int burgers;
    private int fries;
    private int sodas;
    private double mealCost; // before taxes
    private double taxCost;
    private double fCost;   // with taxes


    public Cl3_10(int rburgers, int rfries, int rsodas) {
        burgers = rburgers;
        fries = rfries;
        sodas = rsodas;
        taxCost = 0;
        fCost = 0;
        mealCost = 0;
    }

    public void calc() {
        mealCost = burgers * 1.69 + fries * 1.09 + sodas * 0.99;
        taxCost = mealCost * 0.065;
        fCost = mealCost + taxCost;
    }

    public double getMealCost() { return mealCost; }
    public double getTaxCost() { return taxCost; }
    public double getfCost() { return fCost; }

}
