package SortingTheArrays;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 1, 3, 6, 9, 4, 2 };

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr) {

        // i's value would be for counting the pass , in bubble sort last element gets
        // its position with every pass
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {

            swapped = false;
            // j means an internal pointer which would compare and swap

            // length is i-1 as after every pass , last element is sorted

            for (int j = 1; j < arr.length - i; j++) {

                // This below statement is for making efficient


                if (arr[j] < arr[j - 1]) {

                    int temp;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    swapped = true;

                }

                // Means break the loop if value is not swapped means if array's that part is
                // sorted

            }
            if (!swapped) {

                break;
            }
           

        }

    }

}
