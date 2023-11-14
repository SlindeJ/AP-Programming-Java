package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array[lcv] = (int)(Math.random() * (91 - 20) + 20);
        }

        for (int lcv = 0; lcv < array.length; lcv++) {
            System.out.print(array[lcv] + " ");
        }
        System.out.println();
        // #2
        for (int temp : array) {
            System.out.print(temp + " ");
        }
        System.out.println();
        // #3
        System.out.println("The middle number is " + array[array.length / 2]);
        // #4
        double avg = array[0] + array[array.length - 1] + array[array.length / 2];
        System.out.printf("Average of the first, middle, and last numbers in %.2f\n", (avg / 3));
        // #5
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("The smallest number is " + smallest);
        System.out.println("The largest number is " + largest);
        // #6
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] == smallest)
                array[lcv] = smallest;
            else if (array[lcv] == largest)
            array[lcv] = largest;
        }

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();
        // #7
        int randNum = ((int)Math.random() * 10 + 1);
        array[array.length / 2] = randNum;

        for (int x : array)
            System.out.print(x + " ");
        System.out.println();
        // #8 Add 10 to every number in the List. Print all.
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] += 10;

        for (int x : array) System.out.print(x + " ");
        System.out.println();
        // #9
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted is " + myThird);
        // #10 nums in 50s
        for (int num : array) {
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        }
        System.out.println();
        // #11
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] % 4 == 0) {
                System.out.print(array[lcv] + " ");
            }
        }
        System.out.println();
        // #12  is there a 60?
        boolean sixty = false;
        for (int temp : array) {
            if (temp == 60) sixty = true;
        }
        System.out.println("Is 60 in the list? " + sixty);
        // #13  check to see if all the elements from front to back are in the same order from back to front
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++) {
            if (array[lcv] != array[array.length - 1 - lcv]) {
                same = false;
            }
        }
        System.out.println("Is the array palindromic? " + same);
        // #14 how many number are greater than the average?
        double average = 0;
        for (int x : array) {
            average += x;
        }
        average /= array.length;
        int count = 0;
        for (int x : array) {
            if (x < average) count++;
        }
        System.out.printf("There are %d number greater than the average\n", count);
        // #15 how many of the nubmer are even?
        int evens = 0;
        for (int x : array) {
            if (x%2 == 0) evens++;
        }
        System.out.printf("There are %d even number\n", evens);
        // #16 copy all the elements of the array into a vew array but in reverse order
        int[] array2 = new int[array.length];
        for (int lcv = 0; lcv < array.length; lcv++) {
            array2[lcv] = array[array.length - 1 - lcv];
        }
        for (int n : array2) {
            System.out.print(n + " ");
        }
        System.out.println();
        // #17 write a program to shift every element of an array circularly right.
        int[] shiftArr = circularShiftRight(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();
        // # 18 find the sum of all the digits of all the elements
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp%10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements = " + sum);
    }

    public static int[] circularShiftRight(int[] arr) {     // can call static functions without needing to call any object
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++) {
            shifted[lcv] = arr[lcv-1];
        }
        shifted[0] = temp;
        return shifted;
    }
}
/*
56 41 30 83 26 70 43 21 42 29 71 78 44 29 51 84 37 24 44
56 41 30 83 26 70 43 21 42 29 71 78 44 29 51 84 37 24 44
The middle number is 29
Average of the first, middle, and last numbers in 43.00
The smallest number is 21
The largest number is 84
56 41 30 83 26 70 43 21 42 29 71 78 44 29 51 84 37 24 44
56 41 30 83 26 70 43 21 42 1 71 78 44 29 51 84 37 24 44
66 51 40 93 36 80 53 31 52 11 81 88 54 39 61 94 47 34 54
The number that was ousted is 40
51 53 52 54 54
36 80 52 88
Is 60 in the list? false
Is the array palindromic? false
There are 12 number greater than the average
There are 9 even number
54 34 47 94 61 39 54 88 81 11 52 31 53 80 36 93 5 51 66
54 66 51 5 93 36 80 53 31 52 11 81 88 54 39 61 94 47 34
Sum of all digits of all elements = 166
 */