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

        System.out.println();
    }
}
