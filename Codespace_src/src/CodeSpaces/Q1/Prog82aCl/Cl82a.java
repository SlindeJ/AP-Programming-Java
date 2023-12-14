package CodeSpaces.Q1.Prog82aCl;

public class Cl82a {
    private int speedLimit;
    private int carSpeed;
    private double fine;


    public Cl82a(int lim, int spd) {
        speedLimit = lim;
        carSpeed = spd;
        fine = 0;
    }

    public void calc() {
        fine = (carSpeed - speedLimit) * 5 + 20;
    }

    public double getFine() { return fine; }
}
