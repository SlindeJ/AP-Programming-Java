package CodeSpaces.Q1;

public class LP5_9 {
    public static void main(String[] args) {
        System.out.println("x^1\tx^2\tx^3\tx^4\tx^5");
        for (int lcv = 1; lcv < 7; lcv++) {
            System.out.println(lcv + "\t" + (int)Math.pow(lcv, 2) + "\t" + (int)Math.pow(lcv, 3) + "\t" + (int)Math.pow(lcv, 4) + "\t" + (int)Math.pow(lcv, 5));
            
        }
    }
    
}
