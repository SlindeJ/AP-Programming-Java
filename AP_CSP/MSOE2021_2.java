import java.util.*; 

public class MSOE2018_9 {
    public static int fillCups(int water, String[] cups, int c) {
        if (water < 10) { return 0; }
        return 1 + fillCups(water-(Integer.parseInt(cups[c])+1), cups, c+1); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int reservoir = input.nextInt(); 
        String[] cups = (input.next() + input.nextLine()).split(" "); 
        System.out.println("Filled " + fillCups(reservoir, cups, 0) + " cups"); 


    }
}
/*
34
4 6 6 4 4 8 6
Filled 5 cups
@SlindeJ ➜ /workspaces/AP-Programming-Java/AP_CSP (master) $ java MSOE2021_2.java
55
4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4
Filled 10 cups
*/