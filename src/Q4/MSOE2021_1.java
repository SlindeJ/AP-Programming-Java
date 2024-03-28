package Q4;
import java.util.*;

public class MSOE2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the letter to look for? ");
        String ltr = input.next();
        System.out.print("Please type the sentence to search here: ");
        String text = input.next();
        text += input.nextLine();
        String[] words = text.split(" ");
        String word = "not found";
        for (int i = words.length-1; i > 0; i--) {
            if (words[i].substring(words[i].length()-1).equals("g")) {
                word = words[i];
            }
        }
        System.out.println(word);
    }
}
/*
What is the letter to look for? g
Please type the sentence to search here: coffee is a way of stealing time that should by rights belong to your older self
stealing
 */