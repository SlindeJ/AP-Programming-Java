package Q4.LibraryManagementLab;

import java.util.ArrayList;

public class BinarySearchUtil {
    public Book binarySearch(ArrayList<Book> arr, Book b) {
        int l = 0; 
        int r = arr.size() - 1; 
    while (l <= r) {
        int m = l + (r - l) / 2;
        if (arr.get(m) == b) {
            return b;
        }
        else if (arr.get(m).getTitle().compareTo(b.getTitle()) < 0) {   // may or may not be the right direction
            l = m + 1;
        }
        else {
            r = m - 1;
        } 
    }
    return -1;
    } 
}
