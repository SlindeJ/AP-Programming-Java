package CS220.week12;
// Fig. 16.12: BinarySearchTest.java
// Collections method binarySearch.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Collections_binarySearch {
	public static void main(String[] args) {
		// create an ArrayList<String> from the contents of colors array
		String[] colors = { "red", "white", "blue", "black", "yellow", "purple", "tan", "pink" };
		List<String> colorList = new ArrayList<>(Arrays.asList(colors));

		System.out.printf("Color List: %s%n", colorList);

		String[] searchColors = { "black", "red", "pink", "aqua", "gray", "teal" };
		// search list for various values
		Arrays.sort(searchColors);

		for (String s : searchColors) {
			printSearchResults(colorList, s);
		}
	}

	// perform search and display result
	private static void printSearchResults(List<String> list, String key) {

		System.out.printf("%nSearching for: %s%n", key);

		Collections.sort(list); // must sort the list first before applying binarySearch
		System.out.printf("Color List after sort: %s%n", list);

		// Use Collections's binarySearch() method, binarySearch() is much faster than
		// linear search
		int result = Collections.binarySearch(list, key);

		if (result >= 0) {
			System.out.printf("Found at index %d%n", result);
		} else {
			System.out.printf("Not Found (%d)%n", result);
		}
	}
}
