package CS223.Assignment_3;

public class findPeak {
    public int findPeak(int[] array, int key) {  // n is length of the array
        int left = 0, right = array.length -1;
        while (left <= right) {
            if (left == right) {return left;}
            if (right == left+1) {
                if (array[left] > array[right]) {return left;}
                else {return right;}
            }
            int mid = (left + right) / 2;
            if (array[mid] < array[mid + 1]) {
                left = mid + 1;
            } else if (array[mid] < array[mid-1]) {
                right = mid - 1;
            } else {return mid;}

//            if (array[mid] == key){
//                return mid;
//            }
//            else if (array[mid] > key) {
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
        }
        return -1;
    }
}
