package Q1.Prog213fCl;

public class Cl213f {
    private double kwh; // Kilo watt hours
    private double price;
    private double cost;

    public Cl213f(int kwh2) {
        kwh = kwh2;
        price = 0.07;
        cost = 0;
    }

    public void calc() {
        if (kwh > 10000) {
            cost = (price * 2000) + (0.05 * 8000) + (kwh - 10000) * 0.04;
        } else if (kwh > 2000) {
            cost = (price * 2000) + (kwh - 2000) * 0.05;
        } else {
            cost = price * kwh;
        }
    }

    public double getCost() { return cost; }


}
