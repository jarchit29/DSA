package ArraysAndArrayList;

import java.util.Arrays;

public class ArrayInJava {
    public static void main(String[] args) {

        // 1 D array

        // int[] arr = new int[2];
        // int[] arr2 = { 1, 2, 3, 4 };

        // 2 D array

        // int[R][C]

        // int[][] tdArr = new int[3][];
        // Mentioning coulums is not necessary beacuse of memory alloation

        int[][] tdArr2 = {
                { 1, 2, 3 }, // 0 th index
                { 4, 5 }, // 1st index
                { 6, 7, 8, 9 } // 2nd index

        }; // Variating coulums is possible 3*4 array

        // Now iterating 2D arrays below

        System.out.println("Priniting using normal for");

        for (int row = 0; row < tdArr2.length; row++) {

            for (int col = 0; col < tdArr2[row].length; col++) {

                System.out.print(tdArr2[row][col] + " ");

            }
            System.out.println();

        }

        // Print the same using to string method with enhanced for loop

        System.out.println("Results are printed using enhanced for loop ");

        for (int[] is : tdArr2) {

            System.out.println(Arrays.toString(is));
        }

    }
}
