package CS220.week2;
import java.util.Scanner;

public class week2Lab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int myFavThingYears = 13;
        double myAge8 = 2.25;
        boolean myReading = true;
        String myFavSubject = "Science";
        //
        int favThingYears;
        double age8;
        boolean reading = false;
        String favSubject;
        System.out.print("How many years have you been doing your favorite thing? ");
        favThingYears = input.nextInt();
        System.out.println();
        if (favThingYears >= 100 || favThingYears < 0) {
            System.out.println("Favorite years of thing out of bounds");
            System.exit(0);
        }
        System.out.print("What is your age divided by 8? ");
        age8 = input.nextDouble();
        System.out.println();
        if (age8 <= 0 || age8 >= 12.5) {
            System.out.println("Age division by 8 out of bounds");
            System.exit(0);
        }
        System.out.print("Do you like reading? ");
        String stringReading = input.next();
        System.out.println();
        if (stringReading.contains("y") || stringReading.contains("Y")) {
            reading = true;
        } else if (stringReading.length() == 0) {
            System.out.println("Please answer reading question");
            System.exit(0);
        } else {
            reading = false;
        }
        System.out.print("Favorite subject? ");
        favSubject = input.next();
        System.out.println();
        if (favSubject.length() == 0) {
            System.out.println("Please answer your favorite subject");
            System.exit(0);
        }
        //

        System.out.printf("I have been doing my favorite thing for %d years, my age divided by 8 is %.2f, it is " + myReading + " that I like reading, my favorite subject is " + myFavSubject, myFavThingYears, myAge8);
        System.out.println();
        System.out.printf("You have been doing your favorite thing for %d years, your age divided by 8 is %.2f, it is " + reading + " that you like reading, your favorite subject is " + favSubject, favThingYears, age8);
        System.out.println();
        if (myFavThingYears == favThingYears) {
            System.out.println("We both have been doing the thing we like for " + myFavThingYears + " years!");
        }
        if (myAge8 == age8) {
            System.out.println("We are both the same age!");
        }
        if (myReading && reading) {
            System.out.println("We both like reading!");
        }
        if (myFavSubject.equals(favSubject)) {
            System.out.println("We both like " + myFavSubject + "!");
        }
    }
}
