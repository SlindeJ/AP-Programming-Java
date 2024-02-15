package Q3;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Prog295c {
    public static void merge(String SSN, String CTD, ArrayList<String> arr) {
        String cl = CTD.substring(0, 1);
        String type = CTD.substring(1, 2);
        String dept = CTD.substring(2);
        arr.add((SSN + "\t\t" + cl + "\t\t" + type + "\t\t" + dept));
    }

    public static void main(String[] args) {
        try {
            Scanner merge1 = new Scanner(new File("Langdat/merge1.dat")); // remember to replace with new data file
            Scanner merge2 = new Scanner(new File("Langdat/merge2.dat"));
            ArrayList<String> list = new ArrayList<>();
            while (merge1.hasNext()) {
                String SSN = merge1.next();
                String Class_Type_Dept = merge1.next();
                merge(SSN, Class_Type_Dept, list);
            }
            while (merge2.hasNext()) {
                String SSN = merge2.next();
                String Class_Type_Dept = merge2.next();
                merge(SSN, Class_Type_Dept, list);
            }
            System.out.println("Social Sec#\tClass\t Type\t  Dept#");
            for (String s : list) {
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Social Sec#	Class	 Type	  Dept#
000-00-0001		A		B		1
123-45-6789		C		F		5
432-23-3489		A		B		1
514-98-1234		A		B		1
522-77-8765		C		F		5
522-77-8766		C		F		5
522-77-8767		C		F		5
531-45-9260		C		F		5
111-11-1111		A		B		1
222-22-2227		D		L		9
321-01-2345		A		B		1
357-86-4219		C		F		5
411-52-9485		D		L		9
514-98-5555		C		F		5
521-96-8743		C		F		5
525-25-2525		A		B		1
538-11-1234		D		L		9
539-12-1235		D		L		9
540-13-1236		D		L		9
541-14-1237		C		F		5
 */
