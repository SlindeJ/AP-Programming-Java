package CS223.Assignment_3;

public class maxIndex {
    public int minIndex(int[] array, int key) {  // n is length of the array
        int left = 0, right = array.length -1;      // pulled from the example slides
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
}
