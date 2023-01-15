package SortingTheArrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 8, 5, 3, 1 };

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));


    }

    static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int end = arr.length-i-1;

            int maxii = maxInTheRoom(arr, 0, end);

            swapTwoNums(arr, maxii, end);

        }

    }

    static void swapTwoNums(int[] arr, int i, int j) {

        int temp;

        temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

    static int maxInTheRoom(int[] arr, int start, int end) {

        int max = start;

        for (int i = 0; i <= end; i++) {

            if (arr[max] < arr[i]) {

                max = i;

            }
        }

        return max;

    }

}
