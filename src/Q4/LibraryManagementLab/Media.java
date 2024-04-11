package Q4.LibraryManagementLab;

public abstract class Media {
    private String title;
    private String isbn;
    private boolean isCheckedOut;

    // TODO: Implement constructor (title, isbn)
    public Media(String t, String i) {
        title = t;
        isbn = i;
        isCheckedOut = false; // may not need
    }
    // TODO: Implement getter methods
    public void setCheckedOut(boolean checkedOut) { isCheckedOut = checkedOut; }
    public boolean isAvailable() { return !isCheckedOut; }
    public String getTitle() { return title; }
    public String getIsbn() { return isbn; }
}
