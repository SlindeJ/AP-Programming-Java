package Q2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BigArray2 {
    public static void printCat(Cat cat) {
        System.out.println(cat.getName() + "\t" + cat.getWeight() + "\t" + cat.getAge() + "\t" + cat.getCost());
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/bigArrayList.dat")); // remember to replace with new data file
            int numCats = input.nextInt();
            input.nextLine();
            Cat[] cats = new Cat[50];


            for (int lcv = 0; lcv < numCats; lcv++) {
                String name = input.nextLine();
                double weight = input.nextDouble();
                int age = input.nextInt();
                double cost = input.nextDouble();
                input.nextLine();
                cats[lcv] = new Cat(name, weight, age, cost);
            }
//          Print out all the cats (there is no toString() available)
            System.out.println("1. All the cats: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (int lcv = 0; lcv < numCats; lcv++) {
                printCat(cats[lcv]);
            }
//          Print the name of the 3rd cat.
            System.out.println("\n2. The their cat is named: " + cats[2].getName());
//          The last cat has gained 10 pounds. Update the weight on the object. Print the new weight.
            cats[numCats-1].setWeight(cats[numCats-1].getWeight()+10);
            System.out.println("3. The updated weight is: " + cats[numCats-1].getWeight());
//          The cat named Rascal died. Find that cat and remove it from the list.
            int rascalIndex = 0;
            for (int lcv = 0; lcv < numCats; lcv++) {
                if (cats[lcv].getName().equals("Rascal")) {
                    rascalIndex = lcv;
                }
            }
            for (int lcv = rascalIndex; lcv < numCats-1; lcv++) {
                cats[lcv] = cats[lcv+1];
            }
            numCats--;
//          A new kitten was brought in (Angel, 3.6, 1, 25.99).  Insert it into the 2nd cell.
            // for (int lcv = numCats+1; lcv --> 1;)        Szelogowski's method
            for (int lcv = numCats; lcv > 1; lcv--) {
                cats[lcv] = cats[lcv-1];
            }
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
            numCats++;
//          A new geriatric cat was found (Gimpy, 14.3, 10,  29.99). Put him on the list.
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
            numCats++;
//          Print the updated list with a for-each loop
            System.out.println("\n7. The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");
            for (Cat cat : cats) {
                if (cat != null) { printCat(cat); }
            }
//          Replace the 3rd cat with (Sugar, 23.6, 7, 33.25) put the removed cat at the end of the list.
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;
//          Switch the 2nd and 4th cats.
            Cat tempCat = cats[1];
            cats[1] = cats[3];
            cats[3] = tempCat;
//          Print the names of the cats on the list.
            for (Cat cat : cats) {
                System.out.println(cat.getName() + " ");
            }
//          Remove all cats under $26. Print the costs of each cat remaining on the list.

//          All cats heavier than 15 pounds need to go on a diet <--  no for-each this time.

            // Print the names of the cats being put on a diet.
            int i = 0;
            while (i < numCats) {
                if (cats[i].getCost() < 26) {
                    for (int j = i; j < numCats-1; j++) {
                        cats[j] = cats[j+1];
                    }
                    numCats--;
                } else {
                    i++;
                }
            }

            System.out.println("\n11. The cats costing $26 or more actually cost: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                System.out.print(cats[lcv].getCost() + " ");
            }
            System.out.println();
            for (Cat cat : cats) {

            }
            // 12.
            System.out.println("\nThe cats being put on a diet are: ");
            for (int lcv = 0; lcv < numCats; lcv++) {
                Cat cat = cats[lcv];
                if (cat.getWeight() > 15) {
                    System.out.print(cat.getName() + "\t");
                }
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
