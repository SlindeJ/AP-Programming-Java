package Q4.LibraryManagementLab;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

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
        if () { // if book not exist
            return false;
        } else {
            for (Book b : books) {
                if (!b.isAvailable()) { return false; }     // continue working here
                if (b.getIsbn().equals(isbn)) {
                    Transaction nou = new Transaction(isbn, patronId, getDateToday());
                    transactions.add(nou);
                    b.setCheckedOut(true);
                    return true;
                }
            }
        }
    }
    public boolean checkinBook(String isbn, String patronId) {
        for (Transaction t : transactions) {
            if (t.getIsbn().equals(isbn) && t.getPatronId().equals(patronId)) {
                t.setReturnDate(getDateToday());

            }
        }
        return false;
    }
    public Book searchBookByAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthor().equals(author)) {
                return b;
            }
        }
        return null;
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
        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(title.toLowerCase()) || title.toLowerCase().contains(b.getTitle().toLowerCase())) {
                return b;
            }
        }
        return null;
    }

    @Override
    public Book searchBookByTitle(String title) {
        // TODO: Binary search for book; if not found, return the closest book
        for (Book b : books) {
            if (b.getTitle().equals(title)) {
                return b;
            }
        }
        // if no find book maybe findClosestBook??
        return findClosestBook(title);
    }

    // You might want to add some helper methods here like getBookByIsbn, getPatronById, etc.

    /* ========== DO NOT MODIFY ========== */
    public static String getDateToday() {
        return Instant.now().atZone(ZoneOffset.UTC).format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
