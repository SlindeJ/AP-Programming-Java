package CodeSpaces.Q1.Prog54bCl;

public class Cl54b {
    private int n1 = 475;
    private int n2 = 821;
    private int n3 = 369;
    private int n4 = 562;
    private int summ = 0;
    private double avg = 0;



    public void calc() {
        summ = n1 + n2 + n3 + n4;
        avg = (double)summ / 4;
    }

    public int getSum() { return summ; }
    public double getAvg() { return avg; }

}
