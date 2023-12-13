package Q2.Prog214cAList;

public class AList214c {
    private double myGallons;
    private String myGasType;
    private boolean myCarWash;
    private double gasCost;
    private double washCost;
    private double finalCost;

    public AList214c(double gals, String type, boolean wash) {
        myGallons = gals;
        myGasType = type;
        myCarWash = wash;
        gasCost = 0;
    }
    public void calc() {
        if (myGasType.equals("R")) {
            gasCost = myGallons * 1.359;
        } else if (myGasType.equals("P")) {
            gasCost = myGallons * 1.479;
        } else if (myGasType.equals("H")) {
            gasCost = myGallons * 1.429;
        }
        if (myGallons > 10) {
            washCost = 2.00 - (0.20 * ((int)myGallons - 10));
            if (washCost < 0) { washCost = 0; }
        }
        if (myCarWash) { finalCost += washCost; }
        finalCost += gasCost;
    }

    public void finprint() {
        System.out.printf("Gallons: %.2f\tGas Type: %s\tCar wash: %s\tCost of gas: %.2f\tFinal cost: %.2f\n", myGallons, myGasType, myCarWash, gasCost, finalCost); } // maybe final print
}
