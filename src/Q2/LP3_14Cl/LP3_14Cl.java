package Q2.LP3_14Cl;
import java.util.*;

public class LP3_14Cl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cl3_14 helper = new Cl3_14();
        System.out.println("Election results for New York:");
        System.out.print("Awbrey: ");
        int NYaw = input.nextInt();
        System.out.print("Martinez: ");
        int NYmar = input.nextInt();
        helper.addVotes(NYaw, NYmar);
        System.out.println("Election results for New Jersey:");
        System.out.print("Awbrey: ");
        int NJaw = input.nextInt();
        System.out.print("Martinez: ");
        int NJmar = input.nextInt();
        helper.addVotes(NJaw, NJmar);
        System.out.println("Election results for Connecticut:");
        System.out.print("Awbrey: ");
        int CCaw = input.nextInt();
        System.out.print("Martinez: ");
        int CCmar = input.nextInt();
        helper.addVotes(CCaw, CCmar);
        double awperc = (double)helper.getAwVotes() / helper.getTotalVotes() * 100;
        double marperc = (double)helper.getMarVotes() / helper.getTotalVotes() * 100;

        System.out.println("Candidate\t\tVotes\tPercentage");
        System.out.printf("Awbery\t\t%d\t%.2f\n", helper.getAwVotes(), awperc);
        System.out.printf("Martinez\t\t%d\t%.2f\n", helper.getMarVotes(), marperc);
        System.out.println("Total Votes: " + helper.getTotalVotes());

    }
}
/*
Election results for New York:
Awbrey: 314159
Martinez: 271860
Election results for New Jersey:
Awbrey: 89008
Martinez: 121032
Election results for Connecticut:
Awbrey: 213451
Martinez: 231034
Candidate		Votes	Percentage
Awbery		616618	49.71
Martinez		623926	50.29
Total Votes: 1240544
 */