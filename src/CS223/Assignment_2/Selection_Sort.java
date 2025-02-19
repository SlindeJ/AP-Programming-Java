package CS223.Assignment_2;

public class Selection_Sort {

    public long SelectionSort(String[] arr) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            int j = i;  // for second loop
            String temp = arr[i];
            while (j > 0 && temp.compareTo(arr[j - 1]) < 0) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = temp;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
