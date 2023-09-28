package Q1;
import java.util.*;

public class Prog122h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number  Square  Square Root  Cube  4th Root");
        int lcv = 1;
        while (lcv < 21) {
            int square = (int)Math.pow(lcv, 2);
            double sqrt = Math.sqrt(lcv);
            int cube = (int)Math.pow(lcv, 3);
            double fthrt = Math.sqrt(sqrt);
            System.out.print(lcv + "\t\t");
            System.out.print(square + "\t\t");
            System.out.printf("%.4f\t\t", sqrt);
            System.out.print(cube + "\t\t");
            System.out.printf("%.4f\n", fthrt);
            lcv++;
        }
    }
}

/*
Number  Square  Square Root  Cube  4th Root
1		1		1.0000		1		1.0000
2		4		1.4142		8		1.1892
3		9		1.7321		27		1.3161
4		16		2.0000		64		1.4142
5		25		2.2361		125		1.4953
6		36		2.4495		216		1.5651
7		49		2.6458		343		1.6266
8		64		2.8284		512		1.6818
9		81		3.0000		729		1.7321
10		100		3.1623		1000		1.7783
11		121		3.3166		1331		1.8212
12		144		3.4641		1728		1.8612
13		169		3.6056		2197		1.8988
14		196		3.7417		2744		1.9343
15		225		3.8730		3375		1.9680
16		256		4.0000		4096		2.0000
17		289		4.1231		4913		2.0305
18		324		4.2426		5832		2.0598
19		361		4.3589		6859		2.0878
20		400		4.4721		8000		2.1147
 */