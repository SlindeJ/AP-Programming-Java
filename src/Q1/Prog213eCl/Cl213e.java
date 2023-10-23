package Q1.Prog213eCl;

public class Cl213e {
    private int age;
    private int sums;
    private int XS;
    private int S;
    private int M;
    private int L;
    private int XL;


    public Cl213e() {
        age = 0;
        sums = 0;
        XS = 0;
        S = 0;
        M = 0;
        L = 0;
        XL = 0;
    }

    public void calc(int age) {
        this.age = age;
        sums++;
        if (age < 20) {
            XS++;
        } else if (20 <= age && age < 40) {
            S++;
        } else if (40 <= age && age < 60) {
            M++;
        } else if (60 <= age && age < 80) {
            L++;
        } else if (80 <= age) {
            XL++;
        }
    }

    public int getnou() { return 1; }
}
