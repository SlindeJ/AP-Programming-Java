import java.util.*; 

public class MSOE2015_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter plain or cipher text: "); 
        String cipherText = input.next().toUpperCase(); 
        System.out.print("Enter key: "); 
        String key = Integer.toBinaryString(input.nextInt()); 
        while (key.length() < 30) {     // key to size 30
            key = "0" + key; 
        }
        while (cipherText.length() % 5 != 0) {
            cipherText += " "; 
        }
        ArrayList<String> binaryList = new ArrayList<>();   // string list of every char binary code
        for (char x : cipherText.toCharArray()) {
            String n = Integer.toBinaryString(((int)x-32)); 
            if (n.equals("0")) {
                n = "000000"; 
            }
            binaryList.add(n); 
        }
        // looks good here, need to make a list of the 5 combined binary codes
        // IMPORTANT: notice that the key shifts left 1 for every binary grouping after the first
        for (String s : binaryList) {
            System.out.println(s); 
        }
        ArrayList<String> binaryListCombined = new ArrayList<>();
        for (int s = 0; s < binaryList.size()/5; s += 5) {
            String comb = binaryList.get(s) + binaryList.get(s+1) + binaryList.get(s+2) + binaryList.get(s+3) + binaryList.get(s+4); 
            binaryListCombined.add(comb); 
        }
        for (String c : binaryListCombined) {
            System.out.println(c); 
        }
        System.out.println(key); 
        // XOR the binary grouping with the key down here
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
        System.out.println(XORList.get(0)); 
    }
}