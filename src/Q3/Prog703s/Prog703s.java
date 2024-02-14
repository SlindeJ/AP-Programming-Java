package Q3.Prog703s;

import Q3.Prog702q.Bus;
import Q3.Prog702q.Car;
import Q3.Prog702q.Truck;
import Q3.Prog702q.Vehicle;
//import Q3.Prog702q.Computer;      // check this out

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog703s.txt")); // remember to replace with new data file
            List<Computer> list = new ArrayList<>();
            while (input.hasNext()) {
                int type = input.nextInt();
                String name = input.next();
                int number = input.nextInt();
                double value = input.nextDouble();
                if (type == 1) {
                    String color = input.next();
                    Computer v = new Apple(name, number, value, color);
                    list.add(v);
                } else if (type == 2) {
                    double version = input.nextDouble();
                    Computer v = new Windows(name, number, value, version);
                    list.add(v);
                } else if (type == 3) {
                    int code = input.nextInt();
                    Computer v = new Linux(name, number, value, code);
                    list.add(v);
                }
            }
                int GoG = 0; // Green or Gold (apple computers)
                int ver7 = 0; // windows on ver. 7.0
                int endin5 = 0; // linux codes that end in 5
                //
                for (Computer v : list) {
                    if (v instanceof Apple) {
                        if (((Apple)v).getColor().equals("Green") || ((Apple)v).getColor().equals("Gold")){
                            GoG++;
                        }
                    }
                    if (v instanceof Windows) {
                        if (((Windows)v).getVersion() == 7.0) {
                            ver7++;
                        }
                    }
                    if (v instanceof Linux) {
                        if (((Linux)v).getCode() % 10 == 5) {
                            endin5++;
                        }
                    }
                }
                //

                System.out.println("There are " + GoG + " green or gold Apple computers");
                System.out.println("There are " + ver7 + " Windows computers on version 7.0");
                System.out.println("There are " + endin5 + " Linux computers with a code that ends in a 5");

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
There are 1 green or gold Apple computers
There are 2 Windows computers on version 7.0
There are 4 Linux computers with a code that ends in a 5
 */