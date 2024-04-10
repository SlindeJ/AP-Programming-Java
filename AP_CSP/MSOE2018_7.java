import java.util.*; 

public class MSOE2018_7 {
    public static int notMod(int num, int bignum) {
        int takeout = bignum % num; 
        int n = bignum - takeout; 
        return n / num; 
    }
    public static void main(String[] args) {
        int SecInYear = 31_536_000; 
        int SecInDay = 86_400; 
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter UNIX time: "); 
        int unix = input.nextInt(); 
        int year = 1970; 
        int month = 1; 
        year += notMod(SecInYear, unix);
        unix = unix % SecInYear; 
        // account for leap year somewhere around here
        int days = notMod(SecInDay, unix) + 1; 
        // days in months = 31 28/29 31 30 31 30 31 31 30 31 30 31
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        for (int i = 0; i < months.length; i++) {
            if (days > months[i]) {
                days -= months[i]; 
                month++; 
            } else {
                break; 
            }
        }
        // leap year here
        System.out.println(month + "/" + days + "/" + year);
    }
}