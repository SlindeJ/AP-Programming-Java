package Q4.LibraryManagementLab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    /* ========== DO NOT MODIFY (Except data file path) ========== */
    public static ArrayList<Book> loadCatalog() {
        try {
            // Dataset source: https://www.kaggle.com/datasets/saurabhbagchi/books-dataset
            System.out.print("Loading catalog...");
            String path = "LibraryManagementLab/book_catalog.csv";  // Change directory as needed
            Scanner file = new Scanner(new File(path));
            ArrayList<Book> books = new ArrayList<>();
            while (file.hasNextLine()) {
                String[] bookData = file.nextLine().split(";");
                String isbn = bookData[0];
                String title = bookData[1];
                String author = bookData[2];
                Book book = new Book(title, isbn, author);
                books.add(book);
            }
            file.close();
            System.out.println("success.");
            return books;
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found. Returning empty catalog.");
        }
        return new ArrayList<>();
    }

    // TODO: Implement main program; make a new Library object, load the catalog,
    // add each book from the catalog to the library, then display the menu
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Library library = new Library(loadCatalog());
        System.out.println("Menu: ");
        System.out.println("1. Add Patron\n" +
                "2. Add Book\n" +
                "3. Remove Book\n" +
                "4. Checkout Book\n" +
                "5. Return Book\n" +
                "6. Search Book\n" +
                "7. Search Book Transaction\n" +
                "8. Exit");
        System.out.print("Enter choice: ");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.print("Enter Name: ");
            String name = input.next();
            System.out.print("Enter Patron ID: ");
            String patronID = input.next();
            Patron p2 = new Patron(name, patronID); 
            library.addPatron(p2); 
            System.out.println("Successfully added patron");
        } else if (choice == 2) {
            System.out.print("Enter ISBN: ");
            String ISBN = input.next();
            System.out.print("Enter Title: ");
            String title = input.next();
            System.out.print("Enter Author: ");
            String author = input.next();
            Book b = new Book(title, ISBN, author); 
            library.addBook(b); 
        } else if (choice == 3) {
            System.out.print("Enter ISBN: ");
            String ISBN = input.next();
            library.removeBook(ISBN); 
        } else if (choice == 4) {
            System.out.print("Enter ISBN: ");
            String ISBN = input.next();
            System.out.print("Enter Patron ID: ");
            String patronID = input.next();
            if (library.checkoutBook(ISBN, patronID) == true) { // returns boolean, may cause problem
                System.out.println("Book checked out successfully");
            }
            else {
                System.out.println("Error checking out book");
            }
        } else if (choice == 5) {
            System.out.print("Enter ISBN: ");
            String ISBN = input.next();
            System.out.print("Enter Patron ID: ");
            String patronID = input.next();
            if (library.checkinBook(ISBN, patronID) == true) { // also returns boolean value, might need to finish
                System.out.println("Book checked in successfully"); 
            }
            else {
                System.out.println("Error checking in book");
            }
        } else if (choice == 6) {
            System.out.print("Enter Title: ");
            String title = input.next();
            // print stuff for book found
            System.out.println(library.searchBookByTitle(title)); // prints book object
        } else if (choice == 7) {
            System.out.print("Enter ISBN: ");
            String ISBN = input.next();
            // print stuff from transaction
            library.viewMostRecentTransaction(ISBN); 
        } else {    // exit
            System.out.println("Exiting...");
        }
    }
}
