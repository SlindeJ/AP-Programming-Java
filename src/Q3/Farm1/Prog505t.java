package Q3.Farm1;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog505t.dat")); // remember to replace with new data file
            List<Animal> animal = new ArrayList<>();
            List<Cow> cow = new ArrayList<>();
            List<Horse> horse = new ArrayList<>();
            // need to change, copied from 505w

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();
            int totHayEaten = 0;
            int totCornEaten = 0;

            int cows = input.nextInt(); // number of cows to read in

            for (int r = 0; r < cows; r++) {
                int weight = input.nextInt();
                int milk = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                Cow wow = new Cow("Cow Wow" + r, weight, milk, cornEaten, hayEaten);
                animal.add(wow);
                cow.add(wow);
                hay -= hayEaten;
                corn -= cornEaten;
                totHayEaten += hayEaten;
                totCornEaten += cornEaten;
            }

            int horses = input.nextInt(); // number of horses to read in

            for (int r = 0; r < horses; r++) {
                int weight = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                int rides = input.nextInt();
                double rideCost = input.nextDouble();
                Horse Aarrrrrrr = new Horse("☹" + r, weight, cornEaten, hayEaten, rides, rideCost);
                animal.add(Aarrrrrrr);
                horse.add(Aarrrrrrr);
                hay -= hayEaten;
                corn -= cornEaten;
                totHayEaten += hayEaten;
                totCornEaten += cornEaten;
            }

            // TODO: report income of the day, Report the cost of feeding the animals for a day, cumulative weight of all animals, -
            //  if there's enough food to feed all animals, if so, feed all the animals and report how many bales of hay and cobs -
            //  of corn are left in the barn.  If there is not enough food for ALL the animals, none of the animals get fed ☹ -
            //  report that there is insufficient food to feed the animals and request an immediate shipment of hay and corn for -
            //  the amount of needed of each. Sell off the 3 cows that generate the lowest amount of milk. Sell off the two -
            //  horses that generate the lowest amount of ride income. Change the first cow.   The cow has a weight of 1250, -
            //  followed by 80 pounds of milk produced per day, followed by the number of 3 hay bales eaten each day, followed -
            //  by 4 corncobs eaten each day. Report the total number of cows and horses on the farm.
            // income of the day
            double tot_income = 0;
            for (Animal a : animal) {
                tot_income += a.value(cornCost, hayCost);
            }
            System.out.println("The total income for the day is: $" + tot_income);
            // cost of feeding all animals for a day
            System.out.println("It costs $" + ((totCornEaten * cornCost) + (totHayEaten * hayCost)) + " to feed all the animals for a day");
            // cumulative weight of all animals
            int tot_weight = 0;
            for (Animal x : animal) {
                tot_weight += x.getWeight();
            }
            System.out.println("The total weight of all the animals is: " + tot_weight);
            // if there's enough food to feed all animals
            System.out.println("There is " + hay + " hay left and " + corn + " corn left. So there is enough food to feed all animals");
            // Sell off the 3 cows that generate the lowest amount of milk
            int slackers = 3;
            double minMilk = cow.get(0).getMilk();
            int slackerPos = 0;
            while (slackers > 0) {
                for (int milker = 0; milker < animal.size(); milker++) {
                    if (animal.get(milker) instanceof Cow) {
                        if (((Cow)animal.get(milker)).getMilk() < minMilk) {
                            minMilk = ((Cow) animal.get(milker)).getMilk();
                            slackerPos = milker;
                        }
                    }
                }
                animal.remove(slackerPos);
                slackers--;
            }
            // Sell off the two horses that generate the lowest amount of ride income
            int rougher = 2;
            double minRideIncome = horse.get(0).getRideCost() * horse.get(0).getRides();
            int rougherPos = 0;
            while (rougher > 0) {
                for (int rider = 0; rider < animal.size(); rider++) {
                    if (animal.get(rider) instanceof Horse) {
                        if ((horse.get(rider).getRideCost() * horse.get(rider).getRides() < minRideIncome)) {
                            minRideIncome = 0;  // fix here
                            rougherPos = rider;
                        }
                    }
                }
                animal.remove(rougherPos);
                rougher--;
            }
            // Change the first cow. The cow has a weight of 1250, followed by 80 pounds of milk produced per day,
            // followed by the number of 3 hay bales eaten each day, followed by 4 corncobs eaten each day.

            // Report the total number of cows and horses on the farm

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
