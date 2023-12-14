package CodeSpaces.Q1.Prog209aCl;

public class Cl209a {
    private int rnum;    // number that was read in
    private int G500; // greater than 500
    private int L500; // less than 500
    //private int tnums; // total read numbers


    public Cl209a() {   // number in
        G500 = 0;
        L500 = 0;
        //tnums += rnum;      // may need += tnums
    }

    public void calc(int rnum) {
        if (rnum >= 500) {
            G500++;
        } else { L500++; }
    }




    // DOING BOOLEANS!!!!!
    // change to ints
//    public int greater(int numr) {
//        return (numr >= 500);
//    }
//    public boolean lesser(int numr) {
//        return (numr < 500);
//    }

    public int getTotal() { return (int)G500 + (int)L500; }
    public int getG500() { return G500; }
    public int getL500() { return L500; }

}
