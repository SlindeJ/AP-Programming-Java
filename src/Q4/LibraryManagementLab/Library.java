package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Library implements LibrarySystem {
    private ArrayList<Book> books;
    private ArrayList<Patron> patrons;
    private ArrayList<Transaction> transactions;

    // TODO: Implement the constructor
    public Library(ArrayList<Book> b, ArrayList<Patron> p, ArrayList<Transaction> t) {
        books = b;
        patrons = p;
        transactions = t;
    }
    // Implement interface methods
    @Override
    public void addBook(Book book) { /* Implementation; remember to add in sorted order */
        // it sorts by title
    }
    @Override
    public void removeBook(String isbn) { /* Implementation */
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                books.remove(b);
            }
        }
    }
//     Other methods...
    public void addPatron(Patron patron) { patrons.add(patron); }
    public void removePatron(String patronId) {
        for (Patron p : patrons) {
            if (p.getPatronId().equals(patronId)) {
                patrons.remove(p);
            }
        }
    }
    public void createTransaction(String isbn, String patronId, String checkoutDate) {
        Transaction t = new Transaction(isbn, patronId, checkoutDate);
        transactions.add(t);
    }
    public void updateTransaction(String isbn, String patronId, String returnDate) {
        for (Transaction t : transactions) {
            if (t.getIsbn().equals(isbn) && t.getPatronId().equals(patronId)) {
                t.setReturnDate(returnDate);
            }
        }
    }
    public boolean checkoutBook(String isbn, String patronId) {

        return false;
    }
    public boolean checkinBook(String isbn, String patronId) {

        return false;
    }
    public Book findClosestBook(String title) {

    }
    public Book searchBookByTitle(String title) {

    }
    public Book searchBookByAuthor(String author) {

    }
    @Override
    public void viewMostRecentTransaction(String isbn) {
        // Hint: Use a backward loop to find the most recent transaction
        // If no transaction is found, print "No transactions found for ISBN: <isbn>"
    }

    // TODO: Complete the implementation of LibrarySystem methods

    // TODO: Implement searchBookByTitle and searchBookByAuthor using binary search

    @Override
    public Book findClosestBook(String title) {
        // TODO: Search for the closest book title using .toLowerCase() and .contains(); return the closest book or null
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
