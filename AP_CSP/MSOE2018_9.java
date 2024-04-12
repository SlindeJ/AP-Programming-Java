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
            binaryList.add(n); 
        }
        // looks good here, need to make a list of the 5 combined binary codes
        // IMPORTANT: notice that the key shifts left 1 for every binary grouping after the first
        for (String s : binaryList) {
            System.out.println(s); 
        }
        System.out.println(key); 

        // XOR the binary grouping with the key down here
        ArrayList<String> XORed = new ArrayList<>(); 
        
    }
}