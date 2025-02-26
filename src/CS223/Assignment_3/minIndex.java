package CS223.Assignment_3;

public class minIndex {
    public int minIndex(int[] array, int key) {  // n is length of the array
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
}
