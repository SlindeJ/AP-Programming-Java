package Q1;
import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        // input section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you grade as a percent: ");
        double gp = input.nextDouble();
        // calculation section
        // boolean test = (gp >= 90)
        // System.out.println(test)

        String grade = "";
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";
        // output section
        System.out.println("\nYour grade is a(n) " + grade);
    }
}

/*
Enter you grade as a percent: 99.99

Your grade is a(n) A
 */