package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class Patron {
    private String name;
    private String patronId;
    private ArrayList<Book> checkedOutBooks;

    // TODO: Implement constructor (name, patronId)
    public Patron(String n, String pId) {
        name = n;
        patronId = pId;
    }
    // Basic getters
    public String getName() { return name; }
    public String getPatronId() { return patronId; }

    // TODO: Implement checkInBook(Book book) and checkOutBook(Book book) methods (remove/add book from checkedOutBooks)
    // Don't forget to set the book's checkedOut field to true/false
    public void checkInBook(Book b) {   // make book available again
        if (!b.isAvailable()) {
            checkedOutBooks.remove(b);
            b.setCheckedOut(false);
        }
    }
    public void checkOutBook(Book b) {  // make book unavailable
        if (b.isAvailable()) {
            checkedOutBooks.add(b);
            b.setCheckedOut(true);
        }
    }
}
