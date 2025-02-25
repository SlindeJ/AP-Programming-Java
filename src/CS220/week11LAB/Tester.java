package CS220.week11LAB;

import java.util.Arrays;
import java.util.*;

public class Tester  {
    public static void main(String[] args)
    {
        Address[] addresses =
                {
                        new Address("Main Street", 123),
                        new Address("Main Street", 57),
                        new Address("Hollywood Ave", 11235),
                        //step-3: add two more new Address objects, and then test the compareTo() method
                        new Address("Lobbo Dr.", 78374),
                        new Address("St. N. Nolan", 123456),
                };
        //Step-4: bonus points: reproduce the following statements by using nested for loop
        //to compare all addresses in the Address array.
        System.out.println(addresses[0].compareTo(addresses[0]));
        System.out.println("Expected: 0");
        System.out.println(addresses[0].compareTo(addresses[1]) > 0);
        System.out.println("Expected: true");
        System.out.println(addresses[1].compareTo(addresses[2]) > 0);
        System.out.println("Expected: true");
        System.out.println(addresses[2].compareTo(addresses[1]) > 0);
        System.out.println("Expected: false");

        Arrays.sort(addresses);
        System.out.println(Arrays.toString(addresses));
        System.out.println(
                "Expected: [11235 Hollywood Ave, 78374 Lobbo Dr., 57 Main Street, 123 Main Street, 123456 St. N. Nolan]");
        System.out.println(addresses[3].compareTo(addresses[4]) > 0);
        System.out.println("Expected: false");
    }
}
