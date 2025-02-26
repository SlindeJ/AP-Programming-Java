package CS223.Assignment_3;

public class Predecessor {
    public int BINARY_SEARCH(int[] array, int key) {  // n is length of the array
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
}
