package Q2.Prog213fArray;

public class Cl213f {
    private double myKwh;
    private double myCost;

    public Cl213f(double kwh) {
        myKwh = kwh;
        myCost = 0;
    }

    public void calc() {
        if (myKwh > 10000) {
            myCost = (0.07 * 2000) + (0.05 * 8000) + (myKwh - 10000) * 0.04;
        } else if (myKwh > 2000) {
            myCost = (0.07 * 2000) + (myKwh - 2000) * 0.05;
        } else {
            myCost = 0.07 * myKwh;
        }
    }

//public void calc() {
//        if (kwh > 10000) {
//            cost = (price * 2000) + (0.05 * 8000) + (kwh - 10000) * 0.04;
//        } else if (kwh > 2000) {
//            cost = (price * 2000) + (kwh - 2000) * 0.05;
//        } else {
//            cost = price * kwh;
//        }
//    }
    public String toString() {
        return "The cost of " + myKwh + " is $" + myCost;
    }
}
