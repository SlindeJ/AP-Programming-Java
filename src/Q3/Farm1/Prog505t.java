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
            // need to change, copied from 505w

            int hay = input.nextInt();
            double hayCost = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cows = input.nextInt();

            for (int r = 0; r < cows; r++) {
                String name = "cow wow" + r;
                int weight = input.nextInt();
                int milk = input.nextInt();
                int hayEaten = input.nextInt();
                int cornEaten = input.nextInt();
                Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                animal.add(wow);
                hay -= hayEaten;
                corn -= cornEaten;
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();
            for (int r = 0; r < horseRows; r++) {       // rows
                for (int p = 0; p < horsePens; p++) {   // pens
                    String name = input.next();
                    int weight = input.nextInt();
                    int hayEaten = input.nextInt();
                    int cornEaten = input.nextInt();
                    int rides = input.nextInt();
                    double rideCost = input.nextDouble();
                    Horse Aarrrrrrr = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animal.add(Aarrrrrrr);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            // TODO: report income of the day, cumulative weight of all animals, -
            //  if there's enough food to feed all animals, and the cow that makes the most money
            // income of the day
            double tot_income = 0;
            for (Animal a : animal) {
                tot_income += a.value(cornCost, hayCost);
            }
            System.out.println("The total income for the day is: " + tot_income);
            // cumulative weight of all animals
            int tot_weight = 0;
            for (Animal x : animal) {
                tot_weight += x.getWeight();
            }
            System.out.println("The total weight of all the animals is: " + tot_weight);
            // if there's enough food to feed all animals
            System.out.println("There is " + hay + " left and " + corn + " left. So there is enough food to feed all animals");
            // cow that makes most amount of money
            double maxCowValue = Double.MIN_VALUE;
            int maxCowIndex = 0;
            for (int lcv = 0; lcv < animal.size(); lcv++) {
                if (animal.get(lcv) instanceof Cow) {
                    Cow Xow = (Cow)animal.get(lcv);
                    if (Xow.value(cornCost, hayCost) < maxCowValue) {
                        maxCowValue = Xow.value(cornCost, hayCost);
                        maxCowIndex = lcv;
                    }
                }
            }
            System.out.printf("Cow %s makes the most amount of money\n", animal.get(maxCowIndex).getName());
            // horse that makes least amount of money
            double minHorseValue = Double.MAX_VALUE;
            int minHorseIndex = 0;
            for (int lcv = 0; lcv < animal.size(); lcv++) {
                if (animal.get(lcv) instanceof Horse) {
                    Horse horse = (Horse)animal.get(lcv);
                    if (horse.value(cornCost, hayCost) < minHorseValue) {
                        minHorseValue = horse.value(cornCost, hayCost);
                        minHorseIndex = lcv;
                    }
                }
            }
            System.out.printf("Horse %s makes the least amount of money\n", animal.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
