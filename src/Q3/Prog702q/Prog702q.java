package Q3.Prog702q;

import Q3.Prog702p.Animal;
import Q3.Prog702p.beepers;
import Q3.Prog702p.hiccas;
import Q3.Prog702p.wallies;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog702q.txt")); // remember to replace with new data file
            List<Vehicle> list = new ArrayList<>();
            while (input.hasNext()) {
                int type = input.nextInt();
                String name = input.nextLine(); 
                int tires = input.nextInt();
                if (type == 1) {
                    double value = input.nextDouble();
                    Vehicle v = new Car(name, tires, value);
                    list.add(v);
                }
                else if (type == 2) {
                    int miles = input.nextInt();
                    Vehicle v = new Truck(name, tires, 50000, miles);
                    list.add(v);
                }
                else if (type == 3) {
                    String homeTown = input.next();
                    Vehicle v = new Bus(name, tires, 50000, homeTown);
                    list.add(v);
                }
            }
            int numCar = 0;
            int numTruck = 0;
            int numBus = 0;
            double totCval = 0; // total car value
            double totVval = 0; // total vehicle value
            String longest_Home_Town_Name_For_A_Bus = "";
            int cTires = 0;
            int tTires = 0;
            int bTires = 0;
            for (Vehicle v : list) {
                if (v instanceof Car) {
                    totCval += ((Car)v).getValue();
                    totVval += ((Truck)v).getValue();
                    cTires += ((Car)v).getTires();
                    numCar++;
                }
                if (v instanceof Truck) {
                    totVval += ((Truck)v).getValue();
                    tTires += ((Truck)v).getTires();
                    numTruck++;
                }
                if (v instanceof Bus) {
                    totVval += ((Bus)v).getValue();
                    bTires += ((Bus)v).getTires();
                    numBus++;
                }
            }

            System.out.println("The total number of vehicles is: " + (numBus + numCar + numTruck));
            System.out.println("The total worth of all of the cars is: " + totCval);
            System.out.println("The total worth of every vehicle is: " + totVval);
            System.out.println("The longest home destination name for the busses is: ");    //
            System.out.println("The truck with the least value is: ");  //
            System.out.println("The total number of tires for cars is: " + cTires);
            System.out.println("The total number of tires for trucks is: " + tTires);
            System.out.println("The total number of tires for busses is: " + bTires);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
