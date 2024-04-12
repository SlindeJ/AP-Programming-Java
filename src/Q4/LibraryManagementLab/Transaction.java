package Q4.LibraryManagementLab;

public class Transaction {
    private String isbn;
    private String patronId;
    private String checkoutDate; // Simple date format
    private String returnDate; // Optional, can be null if not returned yet

    // TODO: Implement constructor (isbn, patronId, checkoutDate); set returnDate to null by default
    public Transaction(String i, String pId, String cDate) {
        isbn = i;
        patronId = pId;
        checkoutDate = cDate;
        returnDate = null;
    }
    // TODO: Implement getters and setters
    public String getPatronId() { return patronId; }
    public String getIsbn() { return isbn; }
    public String getCheckoutDate() { return checkoutDate; }
    public String getReturnDate() { return returnDate; }

    // continue here

    @Override
    public String toString() {
        return "Transaction{" +
                "isbn='" + isbn + '\'' +
                ", patronId='" + patronId + '\'' +
                ", checkoutDate='" + checkoutDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
