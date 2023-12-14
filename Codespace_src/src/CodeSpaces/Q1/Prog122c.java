package CodeSpaces.Q1;

public class Prog122c {
    public static void main(String[] args) {
        int lcv = 1;
        while (lcv < 6) {
            int x = lcv;
            int func1 = x * 2;
            int func2 = x * 2 + 1;
            int func3 = func1 * 2;
            int func4 = (int)Math.pow(func1, 2);
            lcv++;
            System.out.print(func1 + "   " + func2 + "   " + func3 + "   " + func4 + "\n");
        }



    }
}
