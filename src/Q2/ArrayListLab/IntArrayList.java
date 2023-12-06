package Q2.ArrayListLab;

public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }
    private void doubleCapacity() { //=> doubles the capacity of myArray
        myCapacity *= 2;
        int[] tempArray = new int[myCapacity];
        for (int lcv = 0; lcv < mySize - 1; lcv++) {
            tempArray[lcv] = myArray[lcv];
        }

    }
    private void halfCapacity() { // => halves the capacity of myArray

    }
    private void add(int num) { // => adds the provided number to the end of myArray

    }
    public void remove(int index) { // => removes the item at the provided index and shifts all items down

    }
    public int get(int index) { // => returns the item at the provided index

    }
    public void set(int index, int num) { // => set the provided index to the provided number

    }
    public int size() { // => returns mySize

    }
    public int[] toArray() { //=> returns myArray;

    }
    public int indexOf(int num) { // => returns the index of the provided number in myArray

    }

}
