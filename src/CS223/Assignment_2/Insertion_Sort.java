package CS223.Assignment_2;

public class Insertion_Sort {
    private int min_index;
    // dont need an array you take it in as an argument

    public void Insertion_Sort(String[] arr) {
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
