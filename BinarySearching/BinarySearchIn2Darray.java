package BinarySearching;

import java.util.Arrays;

// Watch this again .. not really felt this while doing 

// Need to watch this again ..! concepts lag here 


public class BinarySearchIn2Darray {
    public static void main(String[] args) {

        // Here we will solve for the case where array is sorted row and column wise

        int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 28, 29, 37, 49 }, { 33, 34, 38, 50 } };

        System.out.println(Arrays.toString(binarySort2D(arr, 20)));

    }

    static int[] binarySort2D(int[][] arr, int target) {

        int row = 0;
        int column = arr.length - 1;

        while (row < arr.length && column >= 0) {

            if (arr[row][column] == target) {
                return new int[] { row, column };
            }
            if (arr[row][column] < target) {

                row++;

            } else {
                column--;

            }

        }

        return new int[] { -1, -1 };

    }
}
