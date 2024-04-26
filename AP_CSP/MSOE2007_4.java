import java.util.*; 

public class MSOE2018_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Please enter the addresses: "); 
        String a = input.next() + input.nextLine(); 
        String[] addrs = a.split(" "); 
        int north = 0; 
        int south = 0; 
        int east = 0; 
        int west = 0; 
        for (int n = 0; n < addrs.length; n++) {
            if (addrs[n].equals("N")) {
                north = Integer.valueOf(addrs[n-1]); 
            }
        }
        for (int e = 0; e < addrs.length; e++) {
            if (addrs[e].equals("E")) {
                east = Integer.valueOf(addrs[e-1]); 
            }
        }
        for (int s = 0; s < addrs.length; s++) {
            if (addrs[s].equals("S")) {
                south = Integer.valueOf(addrs[s-1]); 
            }
        }
        for (int w = 0; w < addrs.length; w++) {
            if (addrs[w].equals("W")) {
                west = Integer.valueOf(addrs[w-1]); 
            }
        }
        double x = 0; 
        double y = 0; 
        if (north > south) { x = (double)(north - south) / 800; }
        else { x = (double)(south - north) / 800; }
        if (east > west) { y = (double)(east - west) / 1200; }
        else { y = (double)(west - east) / 1200; }
        System.out.println(x); 
        System.out.println(y); 
        double d = Math.sqrt((double)Math.pow(x, 2) + (double)Math.pow(y, 2)); 
        System.out.print(" = " + d + "\n"); 
    }
}
/*
Please enter the addresses: 100 S 25 E 310 N 445 W
0.2625
0.35
 = 0.4375
@SlindeJ ➜ /workspaces/AP-Programming-Java/AP_CSP (master) $ java MSOE2007_4.java
Please enter the addresses: 517 N 3876 W 6788 S 123 W
7.83875
0.1025
 = 7.839420119658086
 */