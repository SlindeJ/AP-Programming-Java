package CS220.week12;
// Programming Practice 8.3.1
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionsPractice {
	public static void main(String[] args) {

		String[] colorVotes = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN", "YELLOW", "BLUE", "RED", "GREEN", "ORANGE" };
		// (1) Create a List collection (e.g., ArrayList) and add elements from
		// colorVotes array to the list
		List<String> colorList = new ArrayList<String>(Arrays.asList(colorVotes));

		// (2-1) call outputList method to print out colorList
		outputList("color list", colorList);

		// (3-1) call addColors method to ask user to add more colors to the color list
		addColors(colorList, new Scanner(System.in));

		// create a remove color list
		List<String> removeList = Arrays.asList("RED", "WHITE", "BLUE");
		// (4-1) call outputList method to print out remove color list
		outputList("remove color list", removeList);

		// (4-2) call removeColors method to remove colors in color list based on the
		// remove color list: removeList
		removeColors(colorList, removeList);

		// 6-1: call sortColors method to sort colors in descending order
		sortColors("ascending", colorList);
		sortColors("descending", colorList);

		// 7-1: call searchColors method to find a color in the list
		searchColors(colorList);
		// 8-1: call countColors method to count the frequency of different colors in
		// the list

	}

	// outputList() method to print out a given list to console
	private static void outputList(String s, List<String> list) {
		System.out.printf("%s: ", s);
		for (int count = 0; count < list.size(); count++) {
			System.out.printf("%s ", list.get(count));
		}
		System.out.println();

		// System.out.println(list);

	}

	// 3-2: complete addColors() method to ask user to add one or more than one
	// colors
	private static void addColors(List<String> colorList, Scanner s) {
		// add code here
		System.out.println("Add more color choice(s), separate by space: ");
		String input = s.nextLine().toUpperCase();
		String[] colors = input.split(" ");
		// colorList.addAll(Arrays.asList(colors));
		Collections.addAll(colorList, colors);
		outputList("updated color list", colorList);

	}

	// 4-3: complete removeColors() method to remove colors specified in removeList
	// from colorList
	private static void removeColors(List<String> colorList, List<String> removeList) {
		// add code here
		colorList.removeAll(removeList);
		outputList("after remove, color list", colorList);
	}

	// step 6: complete sortColors() method to sort colors
	private static void sortColors(String s, List<String> colorList) {
		Collections.sort(colorList); // by default, the order of strings is ???
		if (s.equalsIgnoreCase("decending")) {
			Collections.reverse(colorList);
		}
		outputList("Color list in " + s, colorList);
	}

	// step 7: add a method to search a color in the list
	private static void searchColors(List<String> colorList) {
		Collections.sort(colorList);		// have to have sorted list to binary search
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a color that you are looking for: ");
		String color = userInput.next().trim().toUpperCase();
		int index = Collections.binarySearch(colorList, color); // binary search
		if (index >= 0)
			System.out.printf("Find the color: \"%s \" in the colorList[%d].\n", color, index);
		else {
			System.out.printf("Did not find the color: \"%s \" in the colorList.\n", color);
			// add that new color into the list and keeps the order of other color in the
			// list
			colorList.add(Math.abs(index) - 1, color);
		}
		userInput.close();
	}

	// step 8: add a method to count colors in a list
	private static void countColors(List<String> colorList) {

	}

}
