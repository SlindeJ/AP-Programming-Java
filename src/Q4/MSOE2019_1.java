package Q4;
import java.util.*;

public class MSOE2019_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What are the two letters to search for? ");
        String letters1 = input.next().toLowerCase();
        String letters2 = letters1.substring(1) + letters1.substring(0, 1);
        System.out.print("What is the line of text? ");
        String text = input.next();
        text += input.nextLine();
        int count = 0;
        for (int i = 0; i < text.length()-1; i++) {
            if (text.substring(i, i+2).equals(letters1) || text.substring(i, i+2).equals(letters2)) {
                count++;
            }
        }
        System.out.println("Number: " + count);
    }
}
/*
What are the two letters to search for? ie
What is the line of text? their fields are in the hidden foreign forest
Number: 3
 */