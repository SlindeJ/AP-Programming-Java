package Q2.LP3_9Cl;

public class Cl3_9 {    // todays - born
    private int diffYears;
    private int diffMonths;
    private int diffDays;
    private int daysAlive;
    private int hoursSlept;

    public Cl3_9(int byear, int bmonth, int bday, int tyear, int tmonth, int tday) {
        diffYears = tyear - byear;
        diffMonths = tmonth - bmonth;
        diffDays = tday - bday;
    }

    public void calc() {
        diffYears *= 365;
        diffMonths *= 30;
        daysAlive = diffYears + diffMonths + diffDays;
        hoursSlept = 8 * daysAlive;
    }

    public String toString() { return "You have been alive for " + daysAlive + " days.\nYou have slept for " + hoursSlept + " hours."; }
}
