package Q3.Prog703s;

import Q3.Prog702q.Bus;
import Q3.Prog702q.Car;
import Q3.Prog702q.Truck;
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
                double value = input.nextInt();
                if (type == 1) {
                    String color = input.next();
                    Computer v = new Apple(name, number, value, color);
                    list.add(v);
                }
                else if (type == 2) {
                    double version = input.nextDouble();
                    Computer v = new Windows(name, number, value, version);
                    list.add(v);
                }
                else if (type == 3) {
                    int code = input.nextInt();
                    Computer v = new Linux(name, number, value, code);
                    list.add(v);
                }
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}