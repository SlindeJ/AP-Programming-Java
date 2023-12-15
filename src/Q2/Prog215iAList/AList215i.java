package Q2.Prog215iAList;

public class AList215i {
    private int vehicleNumber;
    private double gallonsGas;
    private double milesDriven;
    private double milesPerGallon;

    public AList215i(int vnum, double gals, double midri) {
        vehicleNumber = vnum;
        gallonsGas = gals;
        milesDriven = midri;
        milesPerGallon = midri / gals;
    }


    public double getMPG() { return milesPerGallon; }
    public int getVehicleNumber() { return vehicleNumber; }
    public double getGallonsGas() { return gallonsGas; }
    public double getMilesDriven() { return milesDriven; }
}
