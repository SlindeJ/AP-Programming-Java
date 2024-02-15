package Q3;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;

public class Prog901a {
    public static void printFile(Scanner input) {
        String text = "";
        while (input.hasNext()) {
            text += input.next() + " ";
        }
        System.out.println(text + "\n\nBackwards\n" + reverseString(text));
    }

    public static String reverseString(String s) {
        if (s.length() == 1) { return s; }
        return s.substring(s.length()-1) + reverseString(s.substring(0, s.length()-1));
    }
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("Langdat/prog512h.dat"));
            printFile(input);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Good morning life and all Things glad and beautiful My pockets nothing hold But he that owns the gold The sun is my great friend His spending has no end Hail to the morning sky Which bright clouds measure high Hail to you birds whose throats Would number leaves by notes Hail to you shady bowers And you green fields of flowers Hail to you women fair That make a show so rare In cloth as white as milk Be it calico or silk Good morning life and all Things glad and beautiful

Backwards
 lufituaeb dna dalg sgnihT lla dna efil gninrom dooG klis ro ocilac ti eB klim sa etihw sa htolc nI erar os wohs a ekam tahT riaf nemow uoy ot liaH srewolf fo sdleif neerg uoy dnA srewob ydahs uoy ot liaH seton yb sevael rebmun dluoW staorht esohw sdrib uoy ot liaH hgih erusaem sduolc thgirb hcihW yks gninrom eht ot liaH dne on sah gnidneps siH dneirf taerg ym si nus ehT dlog eht snwo taht eh tuB dloh gnihton stekcop yM lufituaeb dna dalg sgnihT lla dna efil gninrom dooG
 */
