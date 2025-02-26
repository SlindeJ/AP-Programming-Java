package CS223.Assignment_3;

import java.util.Arrays;

public class Assignment3 {
	private static int countNumberOfKeys(int[] array, int key) {
		return maxIndexBinarySearch(array, key) - minIndexBinarySearch(array, key) + 1;
	}

	private static int minIndexBinarySearch(int[] array, int key) {
			int left = 0, right = array.length -1;      // pulled from the example slides
			int minindex = -1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (array[mid] == key){
//                return mid;
					minindex = mid;
					right = mid - 1;
				}
				else if (array[mid] > key) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			return minindex;
	}

	private static int maxIndexBinarySearch(int[] array, int key) {
			int left = 0, right = array.length -1;
			int maxindex = -1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (array[mid] == key){
					maxindex = mid;
					left = mid + 1;
				}
				else if (array[mid] > key) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			return maxindex;
	}

	private static int predecessor(int[] array, int key) {
			int left = 0, right = array.length -1, predIndex = -1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (array[mid] == key){
					return mid;
				}
				else if (array[mid] > key) {
					right = mid - 1;
				} else {
					predIndex = mid;
					left = mid + 1;
				}
			}
			return predIndex;
	}

	private static int findPeak(int[] array) {
		throw new UnsupportedOperationException("findPeak");
	}

	// DO NOT MODIFY
	public static void main(String[] args) {
		System.out.println("Part 1: Frequency");
		int[] a = {1, 1, 3, 7, 9, 14, 14, 14, 14, 14, 14, 18, 27, 39, 39, 39};
		System.out.printf("Array is %s]%n", Arrays.toString(a));
		int[] testKeys = {1, 14, 39, 7, 100, -88, 16};
		for (int key : testKeys) {
			System.out.printf("Frequency of %d is %d%n", key, countNumberOfKeys(a, key));
		}

		System.out.println("\nPart 2: Predecessor");
		testKeys = new int[]{1, 0, 39, 47, 36, 12, 6};
		System.out.printf("Array is %s%n", Arrays.toString(a));
		for (int key : testKeys) {
			int p = predecessor(a, key);

			if (p == -1) {
				System.out.printf("Predecessor of %d is undefined%n", key);
			}
			else {
				System.out.printf("Predecessor of %d is %d%n", key, a[p]);
			}
		}

		System.out.println("\nPart 3: Peak Finding");
		int[][] c = {
				new int[]{15, 18, 21, 25, 29, 31, 35, 23, 14, 9, 1, -1},
				new int[]{31, 35, 23, 14, 9, 1, -1},
				new int[]{31, 35, 37, 39},
				new int[]{36, 35, 32, 29}
		};

		for (int[] array : c) {
			System.out.printf("Array is %s%n", Arrays.toString(array));
			int peak = findPeak(array);
			System.out.printf("Peak is %d at index %d%n", array[peak], peak);
		}
	}
	// END DO NOT MODIFY
}
