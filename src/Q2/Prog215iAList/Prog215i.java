package Q2.Prog215iAList;

import Q2.Prog215hAList.AList215h;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog215i {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog215i.dat")); // remember to replace with new data file
            ArrayList<AList215i> list = new ArrayList<>();
            double totalmpg = 0;
            double bestmpg = 0;
            double worstmpg = 100000;
            int vbestmpg = 0;
            int vworstmpg = 0;
            double avgMPG = 0;
            int numOfVehicles = 0;
            while (input.hasNext()) {
                int vnum = input.nextInt();
                if (vnum == 0) { break; }
                double gallons = input.nextDouble();
                double miles = input.nextDouble();
                if (gallons == 0 && miles == 0) { continue; }
                AList215i helper = new AList215i(vnum, gallons, miles);
                list.add(helper);
            }
            System.out.println("Vehicle\tMiles\tGallons\tMPG");
            for (int lcv = 0; lcv < list.size(); lcv++) {
                AList215i helper = list.get(lcv);
                numOfVehicles = lcv;
                totalmpg += helper.getMPG();
                if (helper.getMPG() > bestmpg) {
                    bestmpg = helper.getMPG();
                    vbestmpg = helper.getVehicleNumber();
                } if (helper.getMPG() < worstmpg) {
                    worstmpg = helper.getMPG();
                    vworstmpg = helper.getVehicleNumber();
                }
                avgMPG = totalmpg / numOfVehicles;
                System.out.printf("%d\t%.2f\t%.2f\t%.2f\n", helper.getVehicleNumber(), helper.getMilesDriven(), helper.getGallonsGas(), helper.getMPG());
            }
            System.out.println("\nMPG Statistics: ");
            System.out.printf("Best %d\nWorst %d\nFleet Average %.2f\nNumber of Vehicles %d\n", vbestmpg, vworstmpg, avgMPG, numOfVehicles + 1);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Vehicle	Miles	Gallons	MPG
1005	380.50	15.00	25.37
1003	240.10	12.00	20.01
1006	172.30	9.00	19.14
1008	317.70	14.00	22.69
1010	390.20	17.00	22.95
1015	152.10	4.00	38.03
1017	310.00	12.30	25.20
1020	409.90	17.90	22.90

MPG Statistics:
Best 1015
Worst 1006
Fleet Average 28.04
Number of Vehicles 8
 */