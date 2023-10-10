package Q1.Prog88aCl;

public class Cl88a {
    private int num1;
    private int num2;
    // need sum, difference, product, average, "distance" (absval), min and max
    private int sum;
    private double diff;
    private int product;
    private double average;
    private int absval;
    private int min;
    private int max;

    // set up constructor
    public Cl88a(int Num1, int Num2) {
        // set up private data
        num1 = Num1;
        num2 = Num2;
        // maybe set other private variables? I think you set them to 0 to allow helper class to know about them

    }

    public void calc() {
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        average = (double)sum / 2;
        absval = (int)Math.abs(diff);
        if (num1 >= num2) {
            min = num2;
            max = num1;
        } else {
            min = num1;
            max = num2;
        }
    }
    public int getsum() { return sum; }
    public double getdiff() { return diff; }
    public int getproduct() { return product; }
    public double getaverage() { return average; }
    public int getabsval() { return absval; }
    public int getmin() { return min; }
    public int getmax() { return max; }


}
