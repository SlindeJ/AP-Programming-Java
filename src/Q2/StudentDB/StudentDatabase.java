package Q2.StudentDB;
import java.util.*;

public class StudentDatabase {
    public static int indexOfStudent(ArrayList<Student> db, int id) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getId() == id) { index = lcv; }
        }
        return index;
    }

    public static int indexOfStudent(ArrayList<Student> db, String last) {
        int index = -1;
        for (int lcv = 0; lcv < db.size(); lcv++) {
            if (db.get(lcv).getLastName().equals(last)) { index = lcv; }
        }
        return index;
    }

    public static void printStudent(Student stu) {
        System.out.printf("%s\t%s\t%d\t%.2f\n", stu.getFirstName(), stu.getLastName(), stu.getId(), stu.getGPA());
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> db = new ArrayList<>();

        for (;;) {  // while (true)     same thing
            System.out.println("\nStudent Menu:\n");
            System.out.println("1 - Add new student");
            System.out.println("2 - Display all students");
            System.out.println("3 - Search for student (by id)");
            System.out.println("4 - Search for student (by last name)");
            System.out.println("5 - Modify a student's GPA");
            System.out.println("6 - Remove student (by id)");
            System.out.print("7 - Exit\n\nPlease enter your choice: ");
            int c = input.nextInt();

            if (c == 1) {
                System.out.print("Enter first name: ");
                String first = input.next();
                System.out.print("Enter last name: ");
                String last = input.next();
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                System.out.print("Enter student GPA: ");
                double gpa = input.nextDouble();
                Student st = new Student(first, last, id, gpa);
                db.add(st);
            } else if (c == 2) {
                System.out.println("First\tLast\tID\tGpa");
                for (Student stu : db) { printStudent(stu); }
            } else if (c == 3) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStudent(db, id);
                if (index != -1) { printStudent(db.get(index)); }
                else { System.out.println("No student was found with that ID."); }
            } else if (c == 4) {
                System.out.print("Enter last name: ");
                String last = input.next();
                int index = indexOfStudent(db, last);
                if (index != -1) { printStudent(db.get(index)); }
                else { System.out.println("No student was found with that ID."); }
            } else if (c == 5) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStudent(db, id);
                //
                if (index == -1) { System.out.println("No student was found with that ID."); }
                else {      // a bit more complicated
                    System.out.print("Enter GPA: ");
                    double gpa = input.nextDouble();
                    db.get(index).setGPA(gpa);
                    System.out.println("GPA updated successfully!");
                }
            } else if (c == 6) {
                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                int index = indexOfStudent(db, id);
                if (index == -1) { System.out.println("No student was found with that ID."); }
                else { db.remove(index); }
            } else if (c == 7) {
                return;
            }
        }
    }
}
/*
Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 1
Enter first name: scrub
Enter last name: chubak
Enter student ID: 00000
Enter student GPA: -4.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 2
First	Last	ID	Gpa
scrub	chubak	0	-4.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 3
Enter student ID: 0
scrub	chubak	0	-4.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 4
Enter last name: chubak
scrub	chubak	0	-4.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 6
Enter student ID: 0

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 2
First	Last	ID	Gpa

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 1
Enter first name: e
Enter last name: e
Enter student ID: 1
Enter student GPA: 1

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 5
Enter student ID: 1
Enter GPA: 2
GPA updated successfully!

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 2
First	Last	ID	Gpa
e	e	1	2.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 4
Enter last name: e
e	e	1	2.00

Student Menu:

1 - Add new student
2 - Display all students
3 - Search for student (by id)
4 - Search for student (by last name)
5 - Modify a student's GPA
6 - Remove student (by id)
7 - Exit

Please enter your choice: 7
 */