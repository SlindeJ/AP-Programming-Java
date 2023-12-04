package Q2.LP3_14Cl;

public class Cl3_14 {
    private int awVotes;
    private int marVotes;
    private int totalVotes;

    public Cl3_14() {
        awVotes = 0;
        marVotes = 0;
        totalVotes = 0;
    }

    public void addVotes(int aw, int mar) {
        awVotes += aw;
        marVotes += mar;
        totalVotes += awVotes + marVotes;
    }

    public int getAwVotes() { return awVotes; }
    public int getMarVotes() { return marVotes; }
    public int getTotalVotes() { return totalVotes; }
}
