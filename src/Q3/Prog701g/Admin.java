package Q3.Prog701g;

public class Admin extends Person {
    private String myFavw;
    // inherited myFirst and myLast from Person

    public Admin(String fn, String ln, String fav) {
        super(fn, ln);  // call constructor of super/parent class
        myFavw = fav;
    }

    public String getFavw() { return myFavw; }
}
