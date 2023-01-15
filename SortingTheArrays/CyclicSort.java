package SortingTheArrays;
// Do this when range is givrn as in if element lies between a particular range

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 3, 1, 5, 7, 6};
        // int[] arr = { 2, 4, 3, 1, 0,5, 7,6};
        

        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cyclicSort(int[] arr) {

        // Index would always be value-1

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i]-1; //Index would be value -1
            // int correctIndex = arr[i]; //Index would be value if starts from 0

            if(arr[i]!=arr[correctIndex])
            {
                swapTwoNums(arr, i, correctIndex);
            }
            else{
                i++;

            }


        }
    }

    static void swapTwoNums(int[] arr, int i, int j) {

        int temp;

        temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

}
