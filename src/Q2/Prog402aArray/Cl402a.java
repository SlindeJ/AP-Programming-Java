package Q2.Prog402aArray;

public class Cl402a {
    private int ID;
    private int Score;
    private double Diff; // maybe need
    private double Avg; // maybe need

    public Cl402a(int iID, int iScore, double sum) {
        ID = iID;
        Score = iScore;
        Avg = 0;
    }

    public void calc(double total, int countt) {
        Avg = total/countt;
        Diff = Score - Avg;
    }

    public void toFString() { System.out.printf("%d\t%d\t%.2f\n", ID, Score, Diff); }
}
