package CS223.Assignment_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Assignment2 {
	public static void main(String[] args) throws Exception {
		String[] paths = new String[]{
				"src/CS223/Assignment_2/names-1k-unsorted.csv",
				"src/CS223/Assignment_2/names-10k-unsorted.csv",
				"src/CS223/Assignment_2/names-50k-unsorted.csv",
				"src/CS223/Assignment_2/names-100k-unsorted.csv",
				"src/CS223/Assignment_2/names-1k-sorted.csv",
				"src/CS223/Assignment_2/names-10k-sorted.csv",
				"src/CS223/Assignment_2/names-50k-sorted.csv",
				"src/CS223/Assignment_2/names-100k-sorted.csv",
		};

		for (String path : paths) {
			ArrayList<String> names = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
				names.add(line);
				line = reader.readLine();
			}
			reader.close();

			long start = System.currentTimeMillis();
			selectionSort(names.toArray(new String[0]));
			long duration = System.currentTimeMillis() - start;
			System.out.printf("%s took %dms to Selection Sort\n", path, duration);
		}

		for (String path : paths) {
			ArrayList<String> names = new ArrayList<>();
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
			while (line != null) {
				names.add(line);
				line = reader.readLine();
			}
			reader.close();

			long start = System.currentTimeMillis();
			insertionSort(names.toArray(new String[0]));
			long duration = System.currentTimeMillis() - start;
			System.out.printf("%s took %dms to Insertion Sort\n", path, duration);
		}
	}

	private static void selectionSort(String[] arr) {

		//long start = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			int j = i;  // for second loop
			String temp = arr[i];
			while (j > 0 && temp.compareTo(arr[j - 1]) < 0) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		//long end = System.currentTimeMillis();
		//return end - start;       // was originally going to make the sort call also return the runtime itself but I see the template does that for me
		// I thought I'd include this for reference and evidence of the process
	}

	private static void insertionSort(String[] arr) {
		int min_index;
		for (int i = 0; i < arr.length - 1; i++) {
			min_index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j].compareTo(arr[min_index]) < 0) {
					min_index = j;
				}
			}
			if (min_index != i) {
				String temp = arr[i];
				arr[i] = arr[min_index];
				arr[min_index] = temp;
			}
		}
	}
}
