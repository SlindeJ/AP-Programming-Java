package Q3.Prog701g;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Prog701g {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog701g.dat")); // remember to replace with new data file
            List<Person> list = new ArrayList<Person>();    // list of the parent class

            int num = input.nextInt();
            while (num != 99) {
                String f = input.next();
                String l = input.next();

                if (num == 1) {
                    double gpa = input.nextDouble();
                    Person p = new Student(f, l, gpa);
                    list.add(p);
                }
                else if (num == 2) {
                    int numStu = input.nextInt();
                    Person p = new Teacher(f, l, numStu);
                    list.add(p);
                }
                else if (num == 3) {
                    String favW = input.next();
                    Person p = new Admin(f, l, favW);
                    list.add(p);
                }
                num = input.nextInt();
            }
            // helper vars
            double tot = 0; // total gpa
            int cnt = 0; // number of students
            int totStu = 0; // total students each teacher has
            String large = "";
            String small = "lkaujdoifjasudfjascjfuwqaejwjtuwoitud43u5dgjsdugajrwejdlkfhosjjs;joajiatuoajtjwugjausgrjjfdlucljgosjd;lfiudslkrjowukuljf;lkunt;lwulk;udj;liaulckajr;lks;ulkmlekujlivieiujs;0xjoldilsjijduj;liduviml;iulkjfpo8jlsiunivliuopijdlkfuw4elksjc;lzjledfjsd8djelij;liucvmaisdjf;luomf8j;lducijaslkeiu;lixuelkuine8jl;s98ueln;ujf;u8cnaklyosnfyjcliuelijh8yxkls;98jnlku9nc;liulkdsj;ufndkujjz;oul;kjop8u;saelkajs;ldkfulkzsjoiulk;iaudlfkjziul;jdlj;l jpoulkjeujroiulkiuslkj;lk8uxjr;lijiwsuslkjouen;ucnlirjfuaien;iajlrijhpj;lsadfauynayf;lj.zhpoisudhf,xhdirhkjxm,hoihsalx.uxon;fla;ijhxzmjhujdoifjasudfjascjfuwqaejwjtuwoitud43u5dgjsdugajrwejdlkfhosjjs;joajiatuoajtjwugjausgrjjfdlucljgosjd;lfiudslkrjowukuljf;lkunt;lwulk;udj;liaulckajr;lks;ulkmlekujlivieiujs;0xjoldilsjijduj;liduviml;iulkjfpo8jlsiunivliuopijdlkfuw4elksjc;lzjledfjsd8djelij;liucvmaisdjf;luomf8j;lducijaslkeiu;lixuelkuine8jl;s98ueln;ujf;u8cnaklyosnfyjcliuelijh8yxkls;98jnlku9nc;liulkdsj;ufndkujjz;oul;kjop8u;saelkajs;ldkfulkzsjoiulk;iaudlfkjziul;jdlj;l jpoulkjeujroiulkiuslkj;lk8uxjr;lijiwsuslkjouen;ucn;lirjfuaien;iajlrijhpj;lsadfauynayf;lj.zhpoisudhf,xhdirhkjxm,hoihsalx.uxolksjc;lzjledfjsd8djelij;liucvmaisdjf;luomf8j;lducijaslkeiu;lixuelkuine8jl;s98ueln;ujf;u8cnaklyosnfyjcliuelijh8yxkls;98jnlku9nc;liulkdsj;ufndkujjz;oul;kjop8u;saelkajs;ldkfulkzsjoiulk;iaudlfkjziul;jdlj;l jpoulkjeujroiulkiuslkj;lk8uxjr;lijiwsuslkjouen;ucn;lirjfuaien;iajlrijhpj;lsadfauynayf;lj.zhpoisudhf,xhdirhkjxm,hoihsalx.uxon;fla;ijhxzmjhujdoifjasudfjascjfuwqaejwjtuwoitud43u5dgjsdugajrwejdlkfhosjjs;joajiatuoajtjwugjausgrjjfdlucljgosjd;lfiudslkrjowukuljf;lkunt;";
            for (Person x : list) {
                if (x instanceof Student) {
                    tot += ((Student)x).getGPA();
                    cnt++;
                }
                if (x instanceof Teacher) {
                    totStu += ((Teacher)x).getNumStudents();
                }
                if (x instanceof Admin) {
                    String word = ((Admin)x).getFavw();
                    if (word.length() > large.length()) { large = word; }
                    if (word.length() < small.length()) { small = word; }
                }
            }

            System.out.printf("Average student GPA: %.2f\n", tot/cnt);
            System.out.println("Total number of students taught by teachers: " + totStu);
            System.out.println("Smallest favorite admin word: " + small);
            System.out.println("Largest favorite admin word: " + large);

            // Note to self: the get method for teacher is not the same as Szelogowski's

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Average student GPA: 3.06
Total number of students taught by teachers: 316
Smallest favorite admin word: done
Largest favorite admin word: coolbeans
 */