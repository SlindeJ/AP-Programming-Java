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
        ///////////////////////////////
        year += notMod(SecInYear, unix);
        unix = unix % SecInYear; 
        int days = notMod(SecInDay, unix) + 1; 
        int leaps = 0; 
        int leapYears = 0; 
        if (year > 1972) {
            leaps++; 
            leapYears = year-1972; 
        }
        while (leapYears > 4) {
            leapYears -= 4; 
            leaps++; 
        }
        days -= leaps; 
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
        unix = unix % SecInDay; 
        ///////////////////////////////
        int SecInHour = 3600; 
        int SecInMin = 60; // yes, neccissary
        int hour = (unix - unix % SecInHour) / SecInHour; // forgot I made notMod
        unix = unix % SecInHour; 
        int mins = (int)(unix / SecInMin); 
        String oooh = ""; 
        if (hour == 0) {
            hour = 24; 
        }
        if (mins < 10) { 
            oooh = "0"; 
        }
        if (hour < 12) {
            System.out.println(hour + ":" + oooh + mins + " AM"); 
        } else if (hour == 12) {
            System.out.println(hour + ":" + oooh + mins + " PM");
        } else if (hour == 24) {
            System.out.println(hour-12 + ":" + oooh + mins + " AM");
        } else if (hour > 12) {
            System.out.println(hour-12 + ":" + oooh + mins + " PM");
        } else {
            System.out.println("Error");
        }
        System.out.println(month + "/" + days + "/" + year);
    }
}
/*
Enter UNIX time: 1234567890
11:31 PM
2/13/2009
*/