import java.util.*; 

public class MSOE2018_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter plain or cipher text: "); 
        String cipherText = input.next().toUpperCase(); 
        cipherText = cipherText + input.nextLine().toUpperCase(); 
        System.out.print("Enter key: "); 
        String key = Integer.toBinaryString(input.nextInt()); 
        while (key.length() < 30) {     // key to size 30
            key = "0" + key; 
        }
        while (cipherText.length() % 5 != 0) {
            cipherText += " "; 
        }
        // string list of every char binary code
        ArrayList<String> binaryList = new ArrayList<>(); 
        for (char x : cipherText.toCharArray()) {
            String n = Integer.toBinaryString(((int)x-32)); 
            while (n.length() < 6) {
                n = "0" + n; 
            }
            binaryList.add(n); 
        }

        // combined
        ArrayList<String> binaryListCombined = new ArrayList<>();
        for (int s = 0; s < binaryList.size(); s += 5) {
            String comb = binaryList.get(s) + binaryList.get(s+1) + binaryList.get(s+2) + binaryList.get(s+3) + binaryList.get(s+4); 
            binaryListCombined.add(comb); 
        }
        // XORed
        ArrayList<String> XORList = new ArrayList<>();
        for (int lcv = 0; lcv < binaryListCombined.size(); lcv++) {
            String XOR = ""; 
            for (int i = 0; i < binaryListCombined.get(lcv).length(); i++) {
                if (binaryListCombined.get(lcv).substring(i, i+1).equals(key.substring(i, i+1))) {
                    XOR += "0"; 
                } else {
                    XOR += "1"; 
                }
            }
            key = key.substring(1) + key.substring(0, 1); 
            XORList.add(XOR); 
        }
        // split XORed strings
        ArrayList<String> split = new ArrayList<>(); 
        for (int e = 0; e < XORList.size(); e += 1) {
            String part = XORList.get(e).substring(0, 6); 
            split.add(part); 
            part = XORList.get(e).substring(6, 12); 
            split.add(part); 
            part = XORList.get(e).substring(12, 18); 
            split.add(part); 
            part = XORList.get(e).substring(18, 24); 
            split.add(part); 
            part = XORList.get(e).substring(24); 
            split.add(part); 
        }
        // reduced and ascii
        ArrayList<Integer> ascii = new ArrayList<>();    // (char)number
        // int foo = Integer.parseInt("1001", 2);
        for (String k : split) {
            ascii.add(Integer.parseInt(k, 2) + 32); 
        }
        // cipher text
        ArrayList<String> ciphered = new ArrayList<>(); 
        for (int b : ascii) {
            ciphered.add( new Character((char)b).toString());   // fix here
        }
        System.out.println(); 
        for (String h : ciphered) {
            System.out.print(h); 
        }
        System.out.println(); 
    }
}
/*
Note: MSOE2018_9.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Enter plain or cipher text: welcome to msoe
Enter key: 8675309

W$I<"LG++U"ID11
@SlindeJ ➜ /workspaces/AP-Programming-Java/AP_CSP (master) $ java MSOE2018_9.java
Note: MSOE2018_9.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Enter plain or cipher text: W$I<"LG++U"ID11
Enter key: 8675309

WELCOME TO MSOE
*/