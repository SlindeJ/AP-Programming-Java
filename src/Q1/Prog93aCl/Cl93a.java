package CodeSpaces.Q1.Prog93aCl;

public class Cl93a {
    private int kwh;
    private double basecharge;
    private double surcharge;
    private double citytax;
    private double regpay;
    private double latepay;

    public Cl93a(int Kwh){
        kwh = Kwh;
        basecharge = 0;
        surcharge = 0;
        citytax = 0;
        regpay = 0;
        latepay = 0;
    }
    public void calc() { 
        basecharge = kwh * 0.0475;
        surcharge = basecharge * 0.1;
        citytax = basecharge * 0.03;
        regpay = basecharge + surcharge + citytax;
        latepay = regpay * 1.04;
    }

    public double getBasecharge() {return basecharge;}
    public double getSurcharge() {return surcharge;}
    public double getCitytax() {return citytax;}
    public double getRegpay() {return regpay;}
    public double getLatepay() {return latepay;}

    public String toString() {

        return basecharge + "\n" + surcharge + "\n" + citytax + "\n" + regpay + "\n" + latepay + "\n";
    }
}
