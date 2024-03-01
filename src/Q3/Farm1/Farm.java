package Q3.Farm1;

import java.util.ArrayList;

public abstract class Farm implements IFarm {
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;

    public Farm(ArrayList<Horse> h, ArrayList<Cow> c, int mnhb, int mnc, double mhc, double mcc) {
        myHorses = h;
        myCows = c;
        myNumHayBales = mnhb;
        myNumCorn = mnc;
        myHayCost = mhc;
        myCornCost = mcc;
    }

    /** Feeds all cows where farm has enough food */
    private boolean feedCows() { return false; }

    /** Feeds all horses where farm has enough food */
    private boolean feedHorses()  { return false; }

    /** Feeds all cows and horses where farm has enough food  */
    public boolean feedAllAnimals() {
        return false;
    }

    /** Calculates the value of the milk produced by the
     *  cows price for each cow's milk is the same per pound */
    private double cowIncome(double perPound)  {
        return 0; // use getmilk()
    }

    /** Calculates the value of the rides given by the horses
     *  ride value of each horse changes based on the horse */
    private double horseIncome() { return 0; }

    /** Calculates the daily income of the farm */
    public double farmIncome() {
        return 0;
    }

    /** Calculates the total weight of all the farm animals */
    public int getWeight() {
        return 0;
    }

    /** Calculates the amount of money it will
     *  take to feed the animals for the day */
    public double getCost() {
        return 0;
    }

    /** Returns the cows in an ArrayList */
    public ArrayList<Cow> getCows() {
        return myCows;
    }

    /** Returns the horses in an ArrayList */
    public ArrayList<Horse> getHorses() {
        return myHorses;
    }
}
