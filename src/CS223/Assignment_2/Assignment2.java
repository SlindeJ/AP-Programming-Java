package CS223.Assignment_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Assignment2 {							// need to do/impliment
	public static void main(String[] args) throws Exception {
		String[] paths = new String[]{
				"names-1k-unsorted.csv",
				"names-10k-unsorted.csv",
				"names-50k-unsorted.csv",
				"names-100k-unsorted.csv",
				"names-1k-sorted.csv",
				"names-10k-sorted.csv",
				"names-50k-sorted.csv",
				"names-100k-sorted.csv",
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

	private static void selectionSort(String[] array) {
		throw new UnsupportedOperationException();
	}

	private static void insertionSort(String[] array) {
		throw new UnsupportedOperationException();
	}
}