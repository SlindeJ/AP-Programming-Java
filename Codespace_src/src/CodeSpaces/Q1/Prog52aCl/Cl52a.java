package CodeSpaces.Q1.Prog52aCl;

public class Cl52a {    // rectangle class
    private int myLen;  // Also Helper Class
    private int myWid;
    private int myArea;
    private int myPerim;

    // input section    (this is the Constructor)
    public Cl52a(int len, int wid) {
        // set up private data
        myLen = len;
        myWid = wid;
        myArea = 0;
        myPerim = 0;


    }

    // Calculation section (Mutators/Setters)
    public void calc() {    // purpose is to set up private data in the function
        myArea = myLen * myWid;
        myPerim = 2 * myLen + 2 * myWid;
        // same as typing "return".          returns nothing
    }

    // Output section   (Accessors/Getters)
    public int getArea() { return myArea; } // proper programmers use _Area instead of myArea
    public int getPerim() { return myPerim; }
    // This is a helper class
}
