package Q2.Prog215hAList;

public class AList215h {
    private double oneScore;
    private double twoScore;
    private double threeScore;
    private double fourScore;
    private double fiveScore;
    private double sixScore;
    private double sevenScore;
    private double eightScore;
    private double avgScore;
    private double totalScore;
    private double[] myarray;

    public AList215h(double score1, double score2, double score3, double score4, double score5, double score6, double score7, double score8) {
        oneScore = score1;
        twoScore = score2;
        threeScore = score3;
        fourScore = score4;
        fiveScore = score5;
        sixScore = score6;
        sevenScore = score7;
        eightScore = score8;
        avgScore = 0;
        totalScore = 0;
        myarray = new double[]{ score1, score2, score3, score4, score5, score6, score7, score8};    // can literally use an array of the scores and iterate through it in calc
    }

    public void calc() {
        Double max = 0.0;
        Double min = 100000000.0;
        for (int lcv = 0; lcv < myarray.length; lcv++) {
            totalScore += myarray[lcv];
            if (myarray[lcv] > max) {
                max = myarray[lcv];
            } if (myarray[lcv] < min) {
                min = myarray[lcv];
            }
        }
        avgScore = (totalScore - max - min) / 6;
    }

    public void getAvgScore() {
        System.out.printf("%.2f %.2f %.2f %.2f %.2f %.2f %.2f %.2f = %.2f\n", oneScore, twoScore, threeScore, fourScore, fiveScore, sixScore, sevenScore, eightScore, avgScore);
    }
}







