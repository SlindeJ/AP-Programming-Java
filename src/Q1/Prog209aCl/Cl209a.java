package Q1.Prog209aCl;

public class Cl209a {
    private int rnum;    // number that was read in
    private int G500; // greater than 500
    private int L500; // less than 500
    private int tnums; // total read numbers


    public Cl209a(int numi) {   // number in
        rnum = numi;
        G500 = 0;
        L500 = 0;
        tnums += rnum;      // may need += tnums
    }

    public void calc() {
        if (rnum >= 500) {
            G500++;
        } else { L500++; }
    }

    public int getTotal() { return tnums; }


}
